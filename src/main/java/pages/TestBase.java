package pages;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
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
	
	public void takeScreenShot(WebDriver driver) {
		TakesScreenshot ts =(TakesScreenshot)driver ;
		try {
			SimpleDateFormat formatter = new SimpleDateFormat("MMddyy_HHmmss");
			Date date = new Date();
			String label =  formatter.format(date);
			
			FileUtils.copyFile(ts.getScreenshotAs(OutputType.FILE), new File(System.getProperty("user.dir")+("/screenshot/")+label+".png"));
		} catch (WebDriverException | IOException e) {
			e.printStackTrace();
		}
		
		
	}
		
	}

