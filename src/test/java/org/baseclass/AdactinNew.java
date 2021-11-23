package org.baseclass;

import java.io.IOException;

import org.openqa.selenium.WebElement;

public class AdactinNew extends NewBaseClass {

	public static void main(String[] args) throws IOException {
		
		browserLaunch("http://adactinhotelapp.com/");
		AdactinLoginPojo a = new AdactinLoginPojo();
		String takeusername = a.excelRead("C:\\Users\\madhubalan\\Desktop\\Maven\\Adactin.xlsx", "Adact", 0, 0);
		WebElement typeusername = a.locators("name", "username");
		enterText(typeusername, takeusername);
	
	String takepassword = a.excelRead("C:\\Users\\madhubalan\\Desktop\\Maven\\Adactin.xlsx", "Adact", 0, 1);
	WebElement typepassword = a.locators("id", "password");
	enterText(typepassword, takepassword);
	
	WebElement login = a.getLogin();
	btnclick(login);
	
	AdactinLocationPojo al = new AdactinLocationPojo();

		String takeLocation = excelRead("C:\\Users\\madhubalan\\Desktop\\Maven\\Adactin.xlsx", "Adact", 0, 2);
		int parLocation = Integer.parseInt(takeLocation);
		WebElement element = al.getLocation();
		selectByIndexMethod(element, parLocation);

		String takeHotels = excelRead("C:\\Users\\madhubalan\\Desktop\\Maven\\Adactin.xlsx", "Adact", 0, 3);
		int parHotels = Integer.parseInt(takeHotels);
		WebElement elementGetHptel = al.getHotels();
		selectByIndexMethod(elementGetHptel, parHotels);

		String takeRoomType = excelRead("C:\\Users\\madhubalan\\Desktop\\Maven\\Adactin.xlsx", "Adact", 0, 4);
		int parRoomType = Integer.parseInt(takeRoomType);
		WebElement elementGetRoom = al.getRoomType();
		selectByIndexMethod(elementGetRoom, parRoomType);

		String numberOfRooms = excelRead("C:\\Users\\madhubalan\\Desktop\\Maven\\Adactin.xlsx", "Adact", 0, 5);
		WebElement elementNoOfRooms = al.getNumberOfRooms();
		selectByValue(elementNoOfRooms, numberOfRooms);

		WebElement gettClear = al.getCheckInClear();
			clear(gettClear);
			String checkInDate = excelRead("C:\\Users\\madhubalan\\Desktop\\Maven\\Adactin.xlsx", "Adact", 0, 6);
		WebElement elementCheckIn = al.getCheckInDate();
		enterText(elementCheckIn, checkInDate);

		WebElement elementClear2 = al.getCheckOutDate();
		clear(elementClear2);
		String checkOutDate = excelRead("C:\\Users\\madhubalan\\Desktop\\Maven\\Adactin.xlsx", "Adact", 0, 7);
		WebElement elementCheckOut = al.getCheckOutDate();
		enterText(elementCheckOut, checkOutDate);
	
		String excelNoOfAdults = excelRead("C:\\Users\\madhubalan\\Desktop\\Maven\\Adactin.xlsx", "Adact", 0, 8);
		WebElement numberOfAdults = al.getAdultsPerRoom();
		selectByValue(numberOfAdults, excelNoOfAdults);

		String excelNumberOfKids = excelRead("C:\\Users\\madhubalan\\Desktop\\Maven\\Adactin.xlsx", "Adact", 0, 9);
		WebElement numberOfKids = al.getChildPerRoom();
		selectByValue(numberOfKids, excelNumberOfKids);
		
		WebElement submit = al.getGetLogin();
		btnclick(submit);
		
		AdactinPage3Pojo ad = new AdactinPage3Pojo();
		WebElement rdbtn = ad.getRdbtn();
		btnclick(rdbtn);
		
		WebElement btnContinue = ad.getBtnContinue();
		btnclick(btnContinue);

		
		AdactinPojoDetails ada = new AdactinPojoDetails();
		String xlFirstName = excelRead("C:\\Users\\madhubalan\\Desktop\\Maven\\Adactin.xlsx", "Adact", 2, 0);
		WebElement firstName = ada.getFirstName();
		enterText(firstName, xlFirstName);
		
		String xlLastName = excelRead("C:\\Users\\madhubalan\\Desktop\\Maven\\Adactin.xlsx", "Adact", 2, 1);
		WebElement lastName = ada.getLastName();
		enterText(lastName, xlLastName);
		
		String xlAddress = excelRead("C:\\Users\\madhubalan\\Desktop\\Maven\\Adactin.xlsx", "Adact", 2, 2);
		WebElement address = ada.getAddress();
		enterText(address, xlAddress);
		
		String xlCCNum = excelRead("C:\\Users\\madhubalan\\Desktop\\Maven\\Adactin.xlsx", "Adact", 2, 3);
		WebElement ccNum = ada.getCcNum();
		enterText(ccNum, xlCCNum);
		
		String xlCCType = excelRead("C:\\Users\\madhubalan\\Desktop\\Maven\\Adactin.xlsx", "Adact", 2, 4);
		int parCCType = Integer.parseInt(xlCCType);
		WebElement ccType = ada.getCcType();
		selectByIndexMethod(ccType, parCCType);
		
		String xlCCExpMonth = excelRead("C:\\Users\\madhubalan\\Desktop\\Maven\\Adactin.xlsx", "Adact", 2, 5);
		WebElement ccExpMonth = ada.getCcExpMonth();
		selectByValue(ccExpMonth, xlCCExpMonth);
		
		String xlCCExpYear = excelRead("C:\\Users\\madhubalan\\Desktop\\Maven\\Adactin.xlsx", "Adact", 2, 6);
		WebElement ccExpYear = ada.getCcExpYear();
		selectByValue(ccExpYear, xlCCExpYear);
		
		String xlCCV = excelRead("C:\\Users\\madhubalan\\Desktop\\Maven\\Adactin.xlsx", "Adact", 2, 7);
		WebElement getcCV = ada.getcCV();
		enterText(getcCV, xlCCV);
		
		WebElement btnBookNow = ada.getBtnBookNow();
		btnclick(btnBookNow);
		
		
	
		
		
	}}
