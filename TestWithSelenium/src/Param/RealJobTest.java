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
public class RealJobTest 
{
	static int numberDriver = 0;
	static WebDriver drv = null;
	
	private static int testCount = 8;
	private static int count = 1;
	
	public RealJobTest (int a)
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
	public void test_operPlus() 
	{
		
		String expected = "39";
		
		drv.findElement(ById.id("button2")).click();
		drv.findElement(ById.id("button4")).click();
		
		drv.findElement(ById.id("button+")).click();
		
		drv.findElement(ById.id("button1")).click();
		drv.findElement(ById.id("button5")).click();
		
		drv.findElement(ById.id("button=")).click();
		
		String actual = drv.findElement(ById.id("text")).getAttribute("value");
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void test_operMinus() 
	{
		
		String expected = "9";
		
		drv.findElement(ById.id("button2")).click();
		drv.findElement(ById.id("button4")).click();
		
		drv.findElement(ById.id("button-")).click();
		
		drv.findElement(ById.id("button1")).click();
		drv.findElement(ById.id("button5")).click();
		
		drv.findElement(ById.id("button=")).click();
		
		String actual = drv.findElement(ById.id("text")).getAttribute("value");
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void test_operMult() 
	{
		
		String expected = "240";
		
		drv.findElement(ById.id("button2")).click();
		drv.findElement(ById.id("button4")).click();
		
		drv.findElement(ById.id("button*")).click();
		
		drv.findElement(ById.id("button1")).click();
		drv.findElement(ById.id("button0")).click();
		
		drv.findElement(ById.id("button=")).click();
		
		String actual = drv.findElement(ById.id("text")).getAttribute("value");
		
		assertEquals(expected, actual);
	}
	
	
	@Test
	public void test_operDivis() 
	{
		
		String expected = "2";
		
		drv.findElement(ById.id("button2")).click();
		drv.findElement(ById.id("button2")).click();
		
		drv.findElement(ById.id("button/")).click();
		
		drv.findElement(ById.id("button1")).click();
		drv.findElement(ById.id("button1")).click();
		
		drv.findElement(ById.id("button=")).click();
		
		String actual = drv.findElement(ById.id("text")).getAttribute("value");
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void test_operPlus1() 
	{
		
		String expected = "39";
		
		drv.findElement(ById.id("button0")).click();
		drv.findElement(ById.id("button2")).click();
		drv.findElement(ById.id("button4")).click();
		
		drv.findElement(ById.id("button+")).click();
		
		drv.findElement(ById.id("button0")).click();
		drv.findElement(ById.id("button1")).click();
		drv.findElement(ById.id("button5")).click();
		
		drv.findElement(ById.id("button=")).click();
		
		String actual = drv.findElement(ById.id("text")).getAttribute("value");
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void test_operMinus1() 
	{
		
		String expected = "9";
		
		drv.findElement(ById.id("button0")).click();
		drv.findElement(ById.id("button2")).click();
		drv.findElement(ById.id("button4")).click();
		
		drv.findElement(ById.id("button-")).click();
		
		drv.findElement(ById.id("button0")).click();
		drv.findElement(ById.id("button1")).click();
		drv.findElement(ById.id("button5")).click();
		
		drv.findElement(ById.id("button=")).click();
		
		String actual = drv.findElement(ById.id("text")).getAttribute("value");
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void test_operMult1() 
	{
		
		String expected = "240";
		
		drv.findElement(ById.id("button0")).click();
		drv.findElement(ById.id("button2")).click();
		drv.findElement(ById.id("button4")).click();
		
		drv.findElement(ById.id("button*")).click();
		
		drv.findElement(ById.id("button0")).click();
		drv.findElement(ById.id("button1")).click();
		drv.findElement(ById.id("button0")).click();
		
		drv.findElement(ById.id("button=")).click();
		
		String actual = drv.findElement(ById.id("text")).getAttribute("value");
		
		assertEquals(expected, actual);
	}
	
	
	@Test
	public void test_operDivis1() 
	{
		
		String expected = "2";
		
		drv.findElement(ById.id("button0")).click();
		drv.findElement(ById.id("button2")).click();
		drv.findElement(ById.id("button2")).click();
		
		drv.findElement(ById.id("button/")).click();
		
		drv.findElement(ById.id("button0")).click();
		drv.findElement(ById.id("button1")).click();
		drv.findElement(ById.id("button1")).click();
		
		drv.findElement(ById.id("button=")).click();
		
		String actual = drv.findElement(ById.id("text")).getAttribute("value");
		
		assertEquals(expected, actual);
	}
	
	
}
