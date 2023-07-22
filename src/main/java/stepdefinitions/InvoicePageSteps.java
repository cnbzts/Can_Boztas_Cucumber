package stepdefinitions;

import wrappers.GenericWrappers;
import Pages.InvoicePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class InvoicePageSteps extends GenericWrappers {
	
	InvoicePage invoicepage = new InvoicePage();
	
	
	@Then ("Get Invoice Number")
	public void get_Invoice_Number() {
		invoicepage.getInvoiceNumber();
		
	}
	@And ("Close Browser")
	public void close_Browser() {
		driver.close();
	}
	
}
