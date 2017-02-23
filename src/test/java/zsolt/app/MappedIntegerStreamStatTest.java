package zsolt.app;

import zsolt.app.impl.MappedIntegerStreamStat;

public class MappedIntegerStreamStatTest extends AbstractIntegerStreamStatTest {

	@Override
	public IntegerStreamStat createInstance() {
		// 1000 is a too low limit for example5
		return new MappedIntegerStreamStat(2000);
	}

}
