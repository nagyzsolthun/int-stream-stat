package zsolt.app;

/**
 * Provides statistical information for high number of integers.
 *
 */
public interface IntegerStreamStat  {

	/**
	 * Adds value to the list considered in the statistical anlysis.
	 *
	 * @param value the value to add
	 */
	void add(int value);

	/**
	 * Returns the median of the integers added to the object.
	 *
	 * @return the median
	 */
	int calcMedian();
}

