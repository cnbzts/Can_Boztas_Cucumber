package stepdefinitions;

import Pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import wrappers.GenericWrappers;

public class LoginSteps extends GenericWrappers{
	
	LoginPage loginPage = new LoginPage();
	
	@And ("Enter Email")
	public void Enter_Email () {
		loginPage.enterEmail();
	}
		
	@And ("Enter Password")	
	public void Enter_Passowrd() {
		loginPage.enterPassowrd();
}
		
@Then ("Click Captcha")
public void Click_Captcha() throws InterruptedException {
	loginPage.clickCaptcha();
}
	@When ("Click Login")	
	public void Click_Login () throws InterruptedException {
	loginPage.clickLogin();
		
		
		
	}
}

