package pages;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	public static WebDriver driver;
	
	public void init() {
		System.setProperty("webdriver.chrome.driver", "driver109\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
	
	public void clickOnButton(WebElement ele) {
		ele.click();
		
	}
	public String getTitle(String driver) {
		return driver;
	}
	
	public int generatedNumber() {
		Random rand = new Random();
		int int_random = rand.nextInt(999);
		return int_random;
		}
	
	public void teardown() {
		driver.close();
		driver.quit();
	}
		
	}

