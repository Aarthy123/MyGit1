package org.baseclass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinPage3Pojo extends NewBaseClass {
public AdactinPage3Pojo() {
	PageFactory.initElements(driver, this);
}
@FindBy(id= "radiobutton_0")	
private WebElement rdbtn;
	
	@FindBy(id = "continue")
private WebElement btnContinue;

	public WebElement getRdbtn() {
		return rdbtn;
	}

	public WebElement getBtnContinue() {
		return btnContinue;
	}
}
