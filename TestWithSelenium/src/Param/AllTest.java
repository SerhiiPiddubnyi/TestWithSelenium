package Param;
import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ ExistenceTest.class, SimpleTest.class, ComplexTest.class, RealJobTest.class})

public class AllTest 
{

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
