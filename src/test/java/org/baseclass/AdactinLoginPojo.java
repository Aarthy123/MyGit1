package org.baseclass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinLoginPojo extends NewBaseClass{

public AdactinLoginPojo(){
PageFactory.initElements(driver, this);
}

@FindBy(name ="username")
private WebElement username;

@FindBy(id ="password")
private WebElement password;

@FindBy(id ="login")
private WebElement login;


public WebElement getUsername() {
	return username;
}

public WebElement getPassword() {
	return password;
}

public WebElement getLogin() {
	return login;
}

}
