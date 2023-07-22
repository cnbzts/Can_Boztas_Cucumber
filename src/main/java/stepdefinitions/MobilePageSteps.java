package stepdefinitions;

import wrappers.GenericWrappers;
import Pages.MobilePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MobilePageSteps extends GenericWrappers {
	
	MobilePage mobilepage = new MobilePage();
	
	@Then ("Click Order Now")
	public void Click_Order_Now () {
		mobilepage.clickOrderNow();
		
	}
	
	@And ("Click Contunie")
	public void click_Contunie() {
		mobilepage.clickContunie();
	}
	
	@When ("Validate If Added")
	public void validate_If_Added() {
		mobilepage.validateIfAdded();
	}
	@Then ("Click Checkout")
	public void click_Checkout() {
		mobilepage.clickCheckout();
	}
@And ("Click Complete Order")
public void click_Complete_Order() {
	mobilepage.clickCompleteOrder();
}
}
