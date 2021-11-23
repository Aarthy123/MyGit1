package org.baseclass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinLocationPojo extends NewBaseClass{

public AdactinLocationPojo(){
PageFactory.initElements(driver, this);
}

@FindBy(id = "location")
private WebElement location;

@FindBy(id="hotels")
private WebElement hotels;

@FindBy(id="room_type")
private WebElement roomType;

public WebElement getLocation() {
	return location;
}

public WebElement getHotels() {
	return hotels;
}

public WebElement getRoomType() {
	return roomType;
}

public WebElement getNumberOfRooms() {
	return numberOfRooms;
}

public WebElement getCheckInDate() {
	return checkInDate;
}

public WebElement getCheckOutDate() {
	return checkOutDate;
}

public WebElement getAdultsPerRoom() {
	return adultsPerRoom;
}

public WebElement getChildPerRoom() {
	return childPerRoom;
}

public WebElement getGetLogin() {
	return getLogin;
}

@FindBy(id="room_nos")
private WebElement numberOfRooms;

@FindBy(id = "datepick_in")
private WebElement checkInDate;

@FindBy(id="datepick_out")
private WebElement checkOutDate;

@FindBy(id="adult_room")
private WebElement adultsPerRoom;

@FindBy(id="child_room")
private WebElement childPerRoom;

@FindBy(id="Submit")
private WebElement getLogin;

@FindBy(id = "datepick_in")
private WebElement checkInClear;

public WebElement getCheckInClear() {
	return checkInClear;
}

















}
