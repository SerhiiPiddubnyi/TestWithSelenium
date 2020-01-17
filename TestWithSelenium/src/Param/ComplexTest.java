package Param;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;

@RunWith(Parameterized.class)
public class ComplexTest 
{
	static int numberDriver = 0;
	static WebDriver drv = null;
	
	private static int testCount = 31;
	private static int count = 1;
	
	public ComplexTest (int a)
	{
		if (count == 1)
		{
		init (a);	
		}	
	}
	
	@After
	public void counter()
	{
		count++;
		
		if (count > testCount)
		{
			drv.quit();
			count = 1;
		}
	}
	
	@Before
	public void refresh() 
	{
		drv.navigate().refresh();
	}
	
	private void init (int a) 
	{
		String driverFile;
		switch (a) {
		case 1:
			driverFile =  System.getProperty("user.dir"); 
			driverFile = driverFile.replace("\\", "/") + "/ResForTest/chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", driverFile);
			drv = new ChromeDriver();
			numberDriver = a;
			break;

		case 2:
			driverFile =  System.getProperty("user.dir"); 
			driverFile = driverFile.replace("\\", "/") + "/ResForTest/geckodriver.exe";
			System.setProperty("webdriver.gecko.driver", driverFile);
			drv = new FirefoxDriver();
			numberDriver = a;
			break;	
			
		case 3:
			driverFile =  System.getProperty("user.dir"); 
			driverFile = driverFile.replace("\\", "/") + "/ResForTest/operadriver.exe";
			System.setProperty("webdriver.opera.driver", driverFile);		
			OperaOptions name = new OperaOptions();
			name.setBinary("C:\\Program Files\\Opera\\65.0.3467.78\\opera.exe");
			drv = new OperaDriver(name);
			numberDriver = a;
			break;		
		}
		
		if (drv != null) {
			String calcFile =  System.getProperty("user.dir"); 
			calcFile = "file:///" + calcFile.replace("\\", "/") + "/ResForTest/Calculator.html";
			drv.get(calcFile);
		}
		
	}

	@Parameters
	public static Collection<Object[]> data ()
	{
		Object[][] data = {{1}, {2}, {3}};
		
		return Arrays.asList(data);
	}

	@Test
	public void test_oper1111111111() 
	{

		String expected = "1111111111";

		for (int i =  1; i <= 10; i++)
		{
			drv.findElement(ById.id("button1")).click();
		}

		String actual = drv.findElement(ById.id("text")).getAttribute("value");

		assertEquals(expected, actual);
	}

	@Test
	public void test_oper2222222222() 
	{

		String expected = "2222222222";

		for (int i =  1; i <= 10; i++)
		{
			drv.findElement(ById.id("button2")).click();
		}

		String actual = drv.findElement(ById.id("text")).getAttribute("value");


		assertEquals(expected, actual);
	}

	@Test
	public void test_oper3333333333() 
	{

		String expected = "3333333333";

		for (int i =  1; i <= 10; i++)
		{
			drv.findElement(ById.id("button3")).click();
		}

		String actual = drv.findElement(ById.id("text")).getAttribute("value");


		assertEquals(expected, actual);
	}

	@Test
	public void test_oper4444444444() 
	{

		String expected = "4444444444";

		for (int i =  1; i <= 10; i++)
		{
			drv.findElement(ById.id("button4")).click();
		}

		String actual = drv.findElement(ById.id("text")).getAttribute("value");


		assertEquals(expected, actual);
	}

	@Test
	public void test_oper5555555555() 
	{

		String expected = "5555555555";

		for (int i =  1; i <= 10; i++)
		{
			drv.findElement(ById.id("button5")).click();
		}

		String actual = drv.findElement(ById.id("text")).getAttribute("value");


		assertEquals(expected, actual);
	}

	@Test
	public void test_oper6666666666() 
	{

		String expected = "6666666666";

		for (int i =  1; i <= 10; i++)
		{
			drv.findElement(ById.id("button6")).click();
		}

		String actual = drv.findElement(ById.id("text")).getAttribute("value");


		assertEquals(expected, actual);
	}

	@Test
	public void test_oper7777777777() 
	{

		String expected = "7777777777";

		for (int i =  1; i <= 10; i++)
		{
			drv.findElement(ById.id("button7")).click();
		}

		String actual = drv.findElement(ById.id("text")).getAttribute("value");


		assertEquals(expected, actual);
	}

	@Test
	public void test_oper8888888888() 
	{

		String expected = "8888888888";

		for (int i =  1; i <= 10; i++)
		{
			drv.findElement(ById.id("button8")).click();
		}

		String actual = drv.findElement(ById.id("text")).getAttribute("value");


		assertEquals(expected, actual);
	}

	@Test
	public void test_oper9999999999() 
	{

		String expected = "9999999999";

		for (int i =  1; i <= 10; i++)
		{
			drv.findElement(ById.id("button9")).click();
		}

		String actual = drv.findElement(ById.id("text")).getAttribute("value");


		assertEquals(expected, actual);
	}

	@Test
	public void test_oper0000000000() 
	{

		String expected = "0000000000";

		for (int i =  1; i <= 10; i++)
		{
			drv.findElement(ById.id("button0")).click();
		}

		String actual = drv.findElement(ById.id("text")).getAttribute("value");


		assertEquals(expected, actual);
	}

	@Test
	public void test_oper1234567890() 
	{

		String expected = "1234567890";

		for (int i =  1; i <= 10; i++)
		{

			String button = "button" + i;	

			if (i <= 9) 
			{
				drv.findElement(ById.id(button)).click();
			}
			else 
			{
				drv.findElement(ById.id("button0")).click();
			}
		}

		String actual = drv.findElement(ById.id("text")).getAttribute("value");

		assertEquals(expected, actual);
	}

	@Test
	public void test_oper0987654321() 
	{

		String expected = "0987654321";

		for (int i =  10; i >= 1; i--)
		{

			String button = "button" + i;	

			if (i <= 9) 
			{
				drv.findElement(ById.id(button)).click();
			}
			else 
			{
				drv.findElement(ById.id("button0")).click();
			}
		}

		String actual = drv.findElement(ById.id("text")).getAttribute("value");

		assertEquals(expected, actual);
	}

	@Test
	public void test_oper1010101010() 
	{

		String expected = "1010101010";
		
		for (int i =  1; i <= 5; i++)
		{
		drv.findElement(ById.id("button1")).click();
		drv.findElement(ById.id("button0")).click();
		}

		String actual = drv.findElement(ById.id("text")).getAttribute("value");
	
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void test_oper0101010101() 
	{

		String expected = "0101010101";
		
		for (int i =  1; i <= 5; i++)
		{
		drv.findElement(ById.id("button0")).click();
		drv.findElement(ById.id("button1")).click();
		}

		String actual = drv.findElement(ById.id("text")).getAttribute("value");
	
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void test_operPlus5() 
	{

		String expected = "+";

		for (int i =  1; i <= 5; i++)
		{
			drv.findElement(ById.id("button+")).click();
		}

		String actual = drv.findElement(ById.id("hiddenOper")).getAttribute("value");


		assertEquals(expected, actual);
	}
	
	@Test
	public void test_operMinus5() 
	{

		String expected = "-";

		for (int i =  1; i <= 5; i++)
		{
			drv.findElement(ById.id("button-")).click();
		}

		String actual = drv.findElement(ById.id("hiddenOper")).getAttribute("value");


		assertEquals(expected, actual);
	}
	
	@Test
	public void test_operMult5() 
	{

		String expected = "*";

		for (int i =  1; i <= 5; i++)
		{
			drv.findElement(ById.id("button*")).click();
		}

		String actual = drv.findElement(ById.id("hiddenOper")).getAttribute("value");

		assertEquals(expected, actual);
		
	}
	
	@Test
	public void test_operDivis5() 
	{

		String expected = "/";

		for (int i =  1; i <= 5; i++)
		{
			drv.findElement(ById.id("button/")).click();
		}

		String actual = drv.findElement(ById.id("hiddenOper")).getAttribute("value");


		assertEquals(expected, actual);
	}
	
	@Test
	public void test_operRes5() 
	{

		String expected = "=";

		for (int i =  1; i <= 5; i++)
		{
			drv.findElement(ById.id("button=")).click();
		}

		String actual = drv.findElement(ById.id("hiddenOper")).getAttribute("value");


		assertEquals(expected, actual);
	}
	
	@Test
	public void test_OpeOper1() 
	{
		
		String expected = "=";
		
		drv.findElement(ById.id("button+")).click();
		drv.findElement(ById.id("button-")).click();
		drv.findElement(ById.id("button*")).click();
		drv.findElement(ById.id("button/")).click();
		drv.findElement(ById.id("button=")).click();
		
		String actual = drv.findElement(ById.id("hiddenOper")).getAttribute("value");

		assertEquals(expected, actual);
	}
	
	@Test
	public void test_OpeOper2() 
	{
		
		String expected = "/";
		
		drv.findElement(ById.id("button=")).click();
		drv.findElement(ById.id("button+")).click();
		drv.findElement(ById.id("button-")).click();
		drv.findElement(ById.id("button*")).click();
		drv.findElement(ById.id("button/")).click();
		
		String actual = drv.findElement(ById.id("hiddenOper")).getAttribute("value");

		assertEquals(expected, actual);
	}
	
	@Test
	public void test_OpeOper3() 
	{
		
		String expected = "*";
		
		drv.findElement(ById.id("button/")).click();
		drv.findElement(ById.id("button=")).click();
		drv.findElement(ById.id("button+")).click();
		drv.findElement(ById.id("button-")).click();
		drv.findElement(ById.id("button*")).click();
		
		String actual = drv.findElement(ById.id("hiddenOper")).getAttribute("value");

		assertEquals(expected, actual);
	}
	
	@Test
	public void test_OpeOper4() 
	{
		
		String expected = "-";
		
		drv.findElement(ById.id("button*")).click();
		drv.findElement(ById.id("button/")).click();
		drv.findElement(ById.id("button=")).click();
		drv.findElement(ById.id("button+")).click();
		drv.findElement(ById.id("button-")).click();
		
		String actual = drv.findElement(ById.id("hiddenOper")).getAttribute("value");

		assertEquals(expected, actual);
	}
	
	@Test
	public void test_OpeOper5() 
	{
		
		String expected = "+";
		
		drv.findElement(ById.id("button-")).click();
		drv.findElement(ById.id("button*")).click();
		drv.findElement(ById.id("button/")).click();
		drv.findElement(ById.id("button=")).click();
		drv.findElement(ById.id("button+")).click();
		
		String actual = drv.findElement(ById.id("hiddenOper")).getAttribute("value");

		assertEquals(expected, actual);
	}
	
	@Test
	public void test_oper012012012() 
	{

		String expected = "012012012";

		for (int i =  1; i <= 3; i++)
		{
			drv.findElement(ById.id("button0")).click();
			drv.findElement(ById.id("button1")).click();
			drv.findElement(ById.id("button2")).click();
		}

		String actual = drv.findElement(ById.id("text")).getAttribute("value");

		assertEquals(expected, actual);
	}
	
	@Test
	public void test_oper951951951() 
	{

		String expected = "951951951";

		for (int i =  1; i <= 3; i++)
		{
			drv.findElement(ById.id("button9")).click();
			drv.findElement(ById.id("button5")).click();
			drv.findElement(ById.id("button1")).click();
		}

		String actual = drv.findElement(ById.id("text")).getAttribute("value");

		assertEquals(expected, actual);
	}
	
	@Test
	public void test_oper1000001() 
	{

		String expected = "1000001";

		drv.findElement(ById.id("button1")).click();
		
		for (int i =  1; i <= 5; i++)
		{
			drv.findElement(ById.id("button0")).click();
		}
		
		drv.findElement(ById.id("button1")).click();

		String actual = drv.findElement(ById.id("text")).getAttribute("value");

		assertEquals(expected, actual);
	}
	
	@Test
	public void test_oper9000009() 
	{

		String expected = "9000009";

		drv.findElement(ById.id("button9")).click();
		
		for (int i =  1; i <= 5; i++)
		{
			drv.findElement(ById.id("button0")).click();
		}
		
		drv.findElement(ById.id("button9")).click();

		String actual = drv.findElement(ById.id("text")).getAttribute("value");

		assertEquals(expected, actual);
	}
	
	@Test
	public void test_oper000001() 
	{

		String expected = "000001";
		
		for (int i =  1; i <= 5; i++)
		{
			drv.findElement(ById.id("button0")).click();
		}
		
		drv.findElement(ById.id("button1")).click();

		String actual = drv.findElement(ById.id("text")).getAttribute("value");

		assertEquals(expected, actual);
	}
	
	@Test
	public void test_oper100000() 
	{

		String expected = "100000";

		drv.findElement(ById.id("button1")).click();
		
		for (int i =  1; i <= 5; i++)
		{
			drv.findElement(ById.id("button0")).click();
		}

		String actual = drv.findElement(ById.id("text")).getAttribute("value");

		assertEquals(expected, actual);
	}
	
	@Test
	public void test_oper101() 
	{

		String expected = "101";

		drv.findElement(ById.id("button1")).click();
		
		drv.findElement(ById.id("button0")).click();
		
		drv.findElement(ById.id("button1")).click();

		String actual = drv.findElement(ById.id("text")).getAttribute("value");

		assertEquals(expected, actual);
	}
}
