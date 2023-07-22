package Pages;

import wrappers.GenericWrappers;

public class ClientAreaPage extends GenericWrappers{
	
	
	
	public ClientAreaPage clickService() {
		clickByXpath("(//a[@data-toggle='dropdown'])[1]");
		return this;
		
			
		}
	
	public StorePage clickOrderNewservices() {
		clickByXpath("//a[contains(text(),'Order New Services')]");
		return new StorePage();
	
	}
}
