package Pages;

import wrappers.GenericWrappers;

public class LoginPage extends GenericWrappers {
	
	public LoginPage enterEmail() {
		enterById("inputEmail", "canboztas@gmail.com");
		return this;
	}
	
	public LoginPage enterPassowrd() {
		enterById("inputPassword", "Cnbzts_34");
		return this;
	}
	
	public LoginPage clickCaptcha() throws InterruptedException {
		clickByXpath("//div[@class='g-recaptcha']");
		Thread.sleep(20000);
		return this;
	}
	
	public ClientAreaPage clickLogin() throws InterruptedException {
		Thread.sleep(5000);
		clickById("login");
		return new ClientAreaPage();
	}	
}
