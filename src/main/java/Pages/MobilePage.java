package Pages;

import org.openqa.selenium.WebElement;

import Pages.MobilePage;
import wrappers.GenericWrappers;

public class MobilePage extends GenericWrappers {
	
	public MobilePage clickOrderNow() {
		clickById("product1-order-button");
		return this;

	}
	    public MobilePage clickContunie() {
		clickByXpath("//button[@class='btn btn-primary btn-lg']");
		return this;
	}
	    public MobilePage validateIfAdded() {
		verifyTextContainsByXpath("//span[contains(text(),'Mobile Applications')]", "Mobile Applications");
		return this;
	}
	    public MobilePage clickCheckout() {
		clickByXpath("//a[contains(text(),'Checkout')]");
		return this;
	}
	    public InvoicePage clickCompleteOrder() {
			WebElement element = getElementByXpath("//button[@id='btnCompleteOrder']");
			scrollToElement(element);
			clickByXpath("//button[@id='btnCompleteOrder']");
			return new InvoicePage();

	}

}
