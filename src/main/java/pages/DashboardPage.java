package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DashboardPage {
	
	@FindBy(how=How.XPATH, using="/html/head/title")
	public WebElement  dashboardPageHeader;
	
	@FindBy(how=How.XPATH, using="//span[text()='Bank & Cash']")
	public WebElement  bankandCashLink;
	
	@FindBy(how=How.XPATH, using="//a[text()='New Account']")
	public WebElement  newAccountlink;
	
	
}
