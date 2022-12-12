package Com.frontend2.november22;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Hello world!
 *
 */
public class App 
{
	public static WebDriver driver;
    public static void main( String[] args ) throws InterruptedException 
    {
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\seleniumprject1\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();  // opening browser	
		
		driver.get("https://www.amazon.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		
	WebElement menu=	driver.findElement(By.xpath("//*[text()='Early Black Friday Deals']"));
		
Actions ob = new Actions (driver);
ob.keyDown(Keys.CONTROL).build().perform();
	
menu.click();
	
ob.keyUp(Keys.CONTROL).build().perform();


Set<String> winsession=  driver.getWindowHandles();
Iterator<String> itr= winsession.iterator();

String tab1= itr.next();
String tab2= itr.next();

System.out.println(tab1);
System.out.println(tab2);

driver.switchTo().window(tab2);

Thread.sleep(5000);
driver.findElement(By.xpath("//*[text()='Best Sellers']")).click();
		
		Thread.sleep(5000);
		
		
       driver.quit();

	
    }
}
