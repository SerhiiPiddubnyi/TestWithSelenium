package Chrome;
import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RealJob {

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
