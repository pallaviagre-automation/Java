package simple;



//import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;


public class WebdriverMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		String s1=driver.getTitle();
		System.out.println("gettitle of teh page:   "+s1);
		String s2= driver.getCurrentUrl();
		System.out.println("currenturl:  "+s2);
		String s3= driver.getPageSource();
		System.out.println("pagesource :   "+s3);
		//driver.navigate().back();
		WebElement e1=driver.findElement(By.xpath("/html/body/div[5]/div/span"));
		e1.click();
		WebElement e2=driver.findElement(By.name("q"));
		e2.sendKeys("kids dress");
		e2.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
	  WebElement e3 =driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[2]/div/div[1]/div/div/a[1]"));
		e3.click();
		
		//WebElement e4=driver.findElement(By.xpath("//*[@id=\"slot-list-container\"]/div/div[2]/div/div/div/div[1]/div/div[2]/div/div[15]/div/div/div/div/div/div/div/div/div/div/div[2]/div/div/div/div[1]"));
		//Actions a= new Actions(driver);
		//a.moveToElement(e4).click().perform();
		//e4.click();
		
		driver.navigate().back();
		driver.quit();
		
		
	 
		
		
		
	
		
		
		
		
		
		
	}

}
