package simple;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;

public class locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.com/");
		Thread.sleep(1000);
		WebElement e1=driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
		//Thread.sleep(500);
		e1.sendKeys("mobiles");
		e1.sendKeys(Keys.ENTER);
		Thread.sleep(500);
		
		WebElement e2=driver.findElement(By.xpath("//span[contains(text(),'Samsung Galaxy S26 Ultra, Unlocked Android Smartph')]"));
		Thread.sleep(500);
		e2.click();
		
		
		
		
		
		
		
		
		

	}

}
