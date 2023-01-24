package steps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pages.DashboardPage;
import pages.LoginPage;
import pages.NewAccountpage;
import pages.TestBase;


public class LoginStepDefination extends TestBase{
	LoginPage loginPage;
	DashboardPage dashboardPage;
	NewAccountpage newAccountpage;
	
	
	@Before
	public void beforeRun() {
		init();
		loginPage = PageFactory.initElements(driver, LoginPage.class );
		dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
		newAccountpage = PageFactory.initElements(driver, NewAccountpage.class);
	}
	
	@Given("^User is on the techfios login page$")
	public void user_is_on_the_techfios_login_page()  {
		 driver.get("https://www.techfios.com/billing/?ng=admin/");
	}

	@When("^User enters the \"([^\"]*)\" in the \"([^\"]*)\" field$")
	public void user_enters_the_in_the_field(String Userinfo, String field)  {
	 if (field.equalsIgnoreCase("Username")){
		 loginPage.enterUsername(Userinfo);
		 
	 }else if(field.equalsIgnoreCase("Password")) {
		 loginPage.enterPassword(Userinfo);
	 } 
	 else {
		 System.out.println("INVALID USERNAME AND PASSWORD");
		 
	 }
		}

	@When("^User clicks on \"([^\"]*)\"$")
	public void user_clicks_on_(String clickButtonOrLink){
	  if(clickButtonOrLink.equalsIgnoreCase("login")) {
		  clickOnButton(loginPage.SignInButton);
	  }else if(clickButtonOrLink.equalsIgnoreCase("bankCash")) {
		  clickOnButton(dashboardPage.bankandCashLink);
	  }else if(clickButtonOrLink.equalsIgnoreCase("newAccount")) {
		  clickOnButton(dashboardPage.newAccountlink);
	  }
	  else if(clickButtonOrLink.equalsIgnoreCase("submit")){
		  clickOnButton(newAccountpage.submit); 
		 }
	  else {
		  System.out.println("Unable to find button or link");
	  }
	  
	}

	@Then("^User should land on Dashboard page$")
	public void user_should_land_on_Dashboard_page() {
		String ExpectedTitle = "Dashboard- iBilling";
		String ActualTitle =driver.getTitle();
		Assert.assertEquals(ExpectedTitle, ActualTitle);
	   
	}
	@When("^User enters \"([^\"]*)\" in the \"([^\"]*)\" field in accounts page$")
	public void user_enters_in_the_field_in_accounts_page(String newAccountDetails, String field) {
	  switch (field) {
	  case "accountTitle": 
		  newAccountpage.enteraccountTitle(newAccountDetails + generatedNumber() );
		break;
	  case "description":
		  newAccountpage.enterDescription(newAccountDetails);
		break;
	  case "initialBalance":
		  newAccountpage.enterInitialBalance(newAccountDetails);
		  break;
	  case "accountNumber":
		  newAccountpage.enterAccountNumber(newAccountDetails);
	  break;
	  case "contactPerson":
		  newAccountpage.enterContactPerson(newAccountDetails);
	  break;
	  case "Phone":
		  newAccountpage.enterPhone(newAccountDetails);
	  break;
	  case "internetBankingURL":
		  newAccountpage.enterIBurl(newAccountDetails);
	  break;
	  default:
		  System.out.println("Wrong Account Details");
	  
	  }
		}

	@Then("^User should be able to validate account created successfully$")
	public void user_should_be_able_to_validate_account_created_successfully()  {
		String ExpectedTitle = "Accounts- iBilling";
		String ActualTitle =driver.getTitle();
		Assert.assertEquals(ExpectedTitle, ActualTitle);
	  
	}



}
