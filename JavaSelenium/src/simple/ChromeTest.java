package simple;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
         ChromeDriver driver=new ChromeDriver();
         driver.get("https://www.flipkart.com/");


	}

}
