package simple;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebWementMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
		driver.get("https://www.amazon.com/");
		Thread.sleep(2000);
		WebElement e1=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		WebDriverWait w =new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement a= w.until(ExpectedConditions.visibilityOf(e1));
		System.out.println(a);
		Thread.sleep(2000);
		e1.sendKeys("Mobiles");
		e1.sendKeys(Keys.ENTER);
		Thread.sleep(10000);
//		boolean s2= e1.isDisplayed();
//		System.out.println("++++++++++++++++++++++"+s2);
		WebElement e2=driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]"));
		
		boolean s3= e2.isDisplayed();
		System.out.println("++++++++++++++++++++++"+s3);

	}

}
