package Chrome;
import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Existence {

	private static WebDriver drv;

	@BeforeClass
	public static void startDriver()
	{
		String driverFile =  System.getProperty("user.dir"); 
		driverFile = driverFile.replace("\\", "/") + "/ResForTest/chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", driverFile);
		
		String calcFile =  System.getProperty("user.dir"); 
		calcFile = "file:///" + calcFile.replace("\\", "/") + "/ResForTest/Calculator.html";
		
		drv = new ChromeDriver();
		drv.get(calcFile);
	}

	@AfterClass
	public static void quitDriver() 
	{
		drv.quit();
	}

	@Before
	public void refresh() 
	{
		drv.navigate().refresh();
	}


	
	@Test
	public void test_text() 
	{
		
		String expected = "1";
		String actual = drv.findElement(ById.id("button1")).getAttribute("value");
		
		assertEquals(expected, actual);

	}
	
	@Test
	public void test_1() 
	{
		
		String expected = "1";
		String actual = drv.findElement(ById.id("button1")).getAttribute("value");
		
		assertEquals(expected, actual);

	}
	
	@Test
	public void test_2() 
	{
		
		String expected = "2";
		String actual = drv.findElement(ById.id("button2")).getAttribute("value");
		
		assertEquals(expected, actual);

	}
	
	@Test
	public void test_3() 
	{
		
		String expected = "3";
		String actual = drv.findElement(ById.id("button3")).getAttribute("value");
		
		assertEquals(expected, actual);

	}
	
	@Test
	public void test_4() 
	{
		
		String expected = "4";
		String actual = drv.findElement(ById.id("button4")).getAttribute("value");
		
		assertEquals(expected, actual);

	}
	
	@Test
	public void test_5() 
	{
		
		String expected = "5";
		String actual = drv.findElement(ById.id("button5")).getAttribute("value");
		
		assertEquals(expected, actual);

	}
	
	@Test
	public void test_6() 
	{
		
		String expected = "6";
		String actual = drv.findElement(ById.id("button6")).getAttribute("value");
		
		assertEquals(expected, actual);

	}
	
	@Test
	public void test_7() 
	{
		
		String expected = "7";
		String actual = drv.findElement(ById.id("button7")).getAttribute("value");
		
		assertEquals(expected, actual);

	}
	
	@Test
	public void test_8() 
	{
		
		String expected = "8";
		String actual = drv.findElement(ById.id("button8")).getAttribute("value");
		
		assertEquals(expected, actual);

	}
	
	@Test
	public void test_9() 
	{
		
		String expected = "9";
		String actual = drv.findElement(ById.id("button9")).getAttribute("value");
		
		assertEquals(expected, actual);

	}
	
	@Test
	public void test_0() 
	{
		
		String expected = "0";
		String actual = drv.findElement(ById.id("button0")).getAttribute("value");
		
		assertEquals(expected, actual);

	}
	
	@Test
	public void test_Plus() 
	{
		
		String expected = "+";
		String actual = drv.findElement(ById.id("button+")).getAttribute("value");
		
		assertEquals(expected, actual);

	}
	
	@Test
	public void test_Minus() 
	{
		
		String expected = "-";
		String actual = drv.findElement(ById.id("button-")).getAttribute("value");
		
		assertEquals(expected, actual);

	}
	
	@Test
	public void test_Mult() 
	{
		
		String expected = "*";
		String actual = drv.findElement(ById.id("button*")).getAttribute("value");
		
		assertEquals(expected, actual);

	}
	
	@Test
	public void test_Division() 
	{
		
		String expected = "/";
		String actual = drv.findElement(ById.id("button/")).getAttribute("value");
		
		assertEquals(expected, actual);

	}
	
	@Test
	public void test_res() 
	{
		
		String expected = "=";
		String actual = drv.findElement(ById.id("button=")).getAttribute("value");
		
		assertEquals(expected, actual);

	}
	
	@Test
	public void test_Hidden() 
	{
		
		String expected = "";
		String actual = drv.findElement(ById.id("hiddenOper")).getAttribute("value");
		
		assertEquals(expected, actual);

	}
}
