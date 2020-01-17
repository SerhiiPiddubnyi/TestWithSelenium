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
public class SimpleTest 
{
	static int numberDriver = 0;
	static WebDriver drv = null;
	
	private static int testCount = 15;
	private static int count = 1;
	
	public SimpleTest (int a)
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
	public void test_1() 
	{
		
		String expected = "1";
		
		drv.findElement(ById.id("button1")).click();
		
		String actual = drv.findElement(ById.id("text")).getAttribute("value");
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void test_2() 
	{
		
		String expected = "2";
		
		drv.findElement(ById.id("button2")).click();
		
		String actual = drv.findElement(ById.id("text")).getAttribute("value");
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void test_3() 
	{
		
		String expected = "3";
		
		drv.findElement(ById.id("button3")).click();
		
		String actual = drv.findElement(ById.id("text")).getAttribute("value");
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void test_4() 
	{
		
		String expected = "4";
		
		drv.findElement(ById.id("button4")).click();
		
		String actual = drv.findElement(ById.id("text")).getAttribute("value");
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void test_5() 
	{
		
		String expected = "5";
		
		drv.findElement(ById.id("button5")).click();
		
		String actual = drv.findElement(ById.id("text")).getAttribute("value");
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void test_6() 
	{
		
		String expected = "6";
		
		drv.findElement(ById.id("button6")).click();
		
		String actual = drv.findElement(ById.id("text")).getAttribute("value");
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void test_7() 
	{
		
		String expected = "7";
		
		drv.findElement(ById.id("button7")).click();
		
		String actual = drv.findElement(ById.id("text")).getAttribute("value");
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void test_8() 
	{
		
		String expected = "8";
		
		drv.findElement(ById.id("button8")).click();
		
		String actual = drv.findElement(ById.id("text")).getAttribute("value");
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void test_9() 
	{
		
		String expected = "9";
		
		drv.findElement(ById.id("button9")).click();
		
		String actual = drv.findElement(ById.id("text")).getAttribute("value");
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void test_0() 
	{
		
		String expected = "0";
		
		drv.findElement(ById.id("button0")).click();
		
		String actual = drv.findElement(ById.id("text")).getAttribute("value");
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void test_Min() 
	{
		
		String expected = "-";
		
		drv.findElement(ById.id("button-")).click();
		
		String actual = drv.findElement(ById.id("hiddenOper")).getAttribute("value");
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void test_Plus() 
	{
		
		String expected = "+";
		
		drv.findElement(ById.id("button+")).click();
		
		String actual = drv.findElement(ById.id("hiddenOper")).getAttribute("value");
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void test_Mult() 
	{
		
		String expected = "*";
		
		drv.findElement(ById.id("button*")).click();
		
		String actual = drv.findElement(ById.id("hiddenOper")).getAttribute("value");
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void test_Divis() 
	{
		
		String expected = "/";
		
		drv.findElement(ById.id("button/")).click();
		
		String actual = drv.findElement(ById.id("hiddenOper")).getAttribute("value");
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void test_Res() 
	{
		
		String expected = "=";
		
		drv.findElement(ById.id("button=")).click();
		
		String actual = drv.findElement(ById.id("hiddenOper")).getAttribute("value");
		
		assertEquals(expected, actual);
	}
	
}
