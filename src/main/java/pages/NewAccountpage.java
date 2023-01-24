package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class NewAccountpage {
	WebDriver driver;
	
	public NewAccountpage(WebDriver driver) {
		this.driver = driver;
	}
//	Elements library
	
	@FindBy(how=How.XPATH, using= "//input[@id='account']")
	public WebElement AccountTitle;
	@FindBy(how=How.XPATH, using= "//input[@id='description']")
	public WebElement Description;
	@FindBy(how=How.XPATH, using= "//input[@id='balance']")
	public WebElement InitialBalance;
	@FindBy(how=How.XPATH, using= "//input[@id='account_number']")
	public WebElement AccountNumber;
	@FindBy(how=How.XPATH, using= "//input[@id='contact_phone']")
	public WebElement ContactPhone;
	@FindBy(how=How.XPATH, using= "//input[@id='contact_person']")
	public WebElement ContactPerson;
	@FindBy(how=How.XPATH, using= "//input[@id='ib_url']")
	public WebElement InternetBankingUrl;
	@FindBy(how=How.XPATH, using="//button[text()=' Submit']")
	public WebElement  submit;
	@FindBy(how=How.XPATH, using="//*[@id=\"page-wrapper\"]/div[3]/div[1]")
	public WebElement NewAccountCreated;
	
	public void enteraccountTitle(String accountTitle) {
		AccountTitle.sendKeys(accountTitle);
	}
	public void enterDescription(String description) {
		Description.sendKeys(description);
	}
	public void enterInitialBalance(String initialBalance) {
		InitialBalance.sendKeys(initialBalance);
	}
	public void enterAccountNumber(String accountNumber) {
		AccountNumber.sendKeys(accountNumber);
	}
	public void enterContactPerson(String contactPerson) {
		ContactPerson.sendKeys(contactPerson);
	}
	public void enterPhone(String Phone) {
		ContactPhone.sendKeys(Phone);
	}
	public void enterIBurl(String internetBankingURL) {
		InternetBankingUrl.sendKeys(internetBankingURL);
	}
}
