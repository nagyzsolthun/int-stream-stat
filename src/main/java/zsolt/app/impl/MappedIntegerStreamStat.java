package zsolt.app.impl;

import zsolt.app.IntegerStreamStat;

/**
 * Mapped implementation of IntegerStreamStat.
 * Provides great performance and low memory usage in case the range of integers is limited.
 */
public class MappedIntegerStreamStat implements IntegerStreamStat {
	
	public MappedIntegerStreamStat(int maxValue) {
		assert(maxValue < 10000);	// TODO check available memory
		integerCounter = new long[maxValue+1];
	}

	@Override
	public void add(int value) {
		assert(value < integerCounter.length);
		integerCounter[value]++;
		numberOfAllIntegers++;
	}

	@Override
	public int calcMedian() {
		assert(numberOfAllIntegers%2 == 1);
		
		long medianIndex = numberOfAllIntegers/2;
		for(int i=0; i<integerCounter.length; i++) {
			long integerCount = integerCounter[i];
			medianIndex -= integerCount;
			if(medianIndex < 0) return i;
		}
		
		throw new IllegalStateException("should never reach this point");
	}
	
	// the ith index holds the amount the number i was added
	private long [] integerCounter;
	
	// number of all integers added
	private long numberOfAllIntegers = 0;

}
