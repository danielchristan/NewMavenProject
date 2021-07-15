package org.test.hcl;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.DoubleClickAction;

public class Sample2 extends Sample1 {

	public static void main(String[] args) throws Exception {
		
		
		browserConfig();
		openUrl("https://adactinhotelapp.com/");
		maxWindow();
		
		WebElement txtUserName = driver.findElement(By.id("username"));
		type(txtUserName, excelRead("C:\\Users\\ELCOT\\eclipse-workspace\\Booking\\Excel\\sample.xlsx", "Sheet1", 1, 1));
		
		WebElement txtPass = driver.findElement(By.id("password"));
		type(txtPass, excelRead("C:\\Users\\ELCOT\\eclipse-workspace\\Booking\\Excel\\sample.xlsx", "Sheet1", 1, 2));
		
		WebElement btnLogin = driver.findElement(By.id("login"));
		click(btnLogin);
		
		WebElement ddnLocation = driver.findElement(By.id("location"));
		dropDown(ddnLocation, "Melbourne");
		
		WebElement ddnHotel = driver.findElement(By.id("hotels"));
		dropDown(ddnHotel, "Hotel Sunshine");
		
		WebElement ddnRoom = driver.findElement(By.id("room_type"));
		dropDown(ddnRoom, "Double");
		
		WebElement ddnNumber = driver.findElement(By.id("room_nos"));
		dropDown1(ddnNumber, "2");
		
		WebElement ddnAdult = driver.findElement(By.id("adult_room"));
		dropDown1(ddnAdult, "2");
		
		WebElement ddnChild = driver.findElement(By.id("child_room"));
		dropDown1(ddnChild, "1");
		
		WebElement btnSearch = driver.findElement(By.id("Submit"));
		click(btnSearch);
		
		WebElement btnRadio = driver.findElement(By.id("radiobutton_0"));
		click(btnRadio);
		
		WebElement btnCon = driver.findElement(By.id("continue"));
		click(btnCon);
		
		WebElement txtFirstName = driver.findElement(By.id("first_name"));
		type(txtFirstName, excelRead("C:\\Users\\ELCOT\\eclipse-workspace\\Booking\\Excel\\sample.xlsx", "Sheet1", 1, 3));
		
		WebElement txtLastName = driver.findElement(By.id("last_name"));
		type(txtLastName, excelRead("C:\\Users\\ELCOT\\eclipse-workspace\\Booking\\Excel\\sample.xlsx", "Sheet1", 1, 4));
		
		WebElement txtAddress = driver.findElement(By.id("address"));
		type(txtAddress, excelRead("C:\\Users\\ELCOT\\eclipse-workspace\\Booking\\Excel\\sample.xlsx", "Sheet1", 1, 5));
		
		WebElement txtCreditCardNum = driver.findElement(By.id("cc_num"));
		type(txtCreditCardNum, excelRead("C:\\Users\\ELCOT\\eclipse-workspace\\Booking\\Excel\\sample.xlsx", "Sheet1", 1, 6));
		
		WebElement ddnCreditType = driver.findElement(By.id("cc_type"));
		dropDown1(ddnCreditType, "VISA");
		
		WebElement ddnExpMonth = driver.findElement(By.id("cc_exp_month"));
		dropDown1(ddnExpMonth, "4");
		
		WebElement ddnExpYear = driver.findElement(By.id("cc_exp_year"));
		dropDown1(ddnExpYear, "2022");
		
		WebElement txtCvv = driver.findElement(By.id("cc_cvv"));
		type(txtCvv, excelRead("C:\\Users\\ELCOT\\eclipse-workspace\\Booking\\Excel\\sample.xlsx", "Sheet1", 1, 7));
		
		WebElement btnBookNow = driver.findElement(By.id("book_now"));
		click(btnBookNow);
		
		WebElement txtLogout = driver.findElement(By.xpath("//h4[text()='About Adactin']"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguements[0].scrollIntoView(true)", txtLogout);
		
		
		
		
	}
	
	
}
