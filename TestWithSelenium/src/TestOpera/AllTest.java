package TestOpera;
import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ Existence.class, Simple.class, Complex.class, RealJob.class })

public class AllTest 
{

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
