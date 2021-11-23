package org.baseclass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinConfirmationPojo extends NewBaseClass{
	public AdactinConfirmationPojo() {
		
		PageFactory.initElements(driver, this);
		
		
	}

@FindBy(id="order_no")
private WebElement confirmation;

public WebElement getConfirmation() {
	return confirmation;
}




}