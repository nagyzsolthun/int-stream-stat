package zsolt.app;

import zsolt.app.impl.BruteForceIntegerStreamStat;

public class BruteForceIntegerStreamStatTest extends AbstractIntegerStreamStatTest {

	@Override
	public IntegerStreamStat createInstance() {
		// 1000 is a too low limit for example5
		return new BruteForceIntegerStreamStat();
	}

}
