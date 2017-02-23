package zsolt.app.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import zsolt.app.IntegerStreamStat;

/**
 * Brute force implementation of IntegerStreamStat, for testing purpose.
 * Integers are added to a list.
 */
public class BruteForceIntegerStreamStat implements IntegerStreamStat {

	@Override
	public void add(int value) {
		integers.add(value);
	}

	@Override
	public int calcMedian() {
		assert(integers.size()%2 == 1);

		Collections.sort(integers);
		int index = integers.size() / 2;	// int casting rounds downwards
		return integers.get(index);
	}

	private List<Integer> integers = new ArrayList<>();
}
