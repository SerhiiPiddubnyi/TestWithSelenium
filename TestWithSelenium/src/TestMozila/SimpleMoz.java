package TestMozila;
import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SimpleMoz {

	private static WebDriver drv;
	
	@BeforeClass
	public static void startDriver()
	{
		String driverFile =  System.getProperty("user.dir"); 
		driverFile = driverFile.replace("\\", "/") + "/ResForTest/geckodriver.exe";
		
		System.setProperty("webdriver.gecko.driver", driverFile);
		
		String calcFile =  System.getProperty("user.dir"); 
		calcFile = "file:///" + calcFile.replace("\\", "/") + "/ResForTest/Calculator.html";
		
		drv = new FirefoxDriver();
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
