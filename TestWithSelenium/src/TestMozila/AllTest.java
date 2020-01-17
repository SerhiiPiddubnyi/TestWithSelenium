package TestMozila;
import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ ExistenceMoz.class, SimpleMoz.class, ComplexMoz.class, RealJobMoz.class })

public class AllTest 
{

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
