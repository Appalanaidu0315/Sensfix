package com.sensfix.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sensfix.base.TestBase;

public class LoginPage extends TestBase
{
	@FindBy(xpath="//input[@placeholder='example@sensfix.com']")
	WebElement username;
	
	@FindBy(xpath="//input[@type='password']")
	WebElement password;
	
	
	@FindBy(xpath="//button[@type='button']")
	WebElement LoginButton;

	public LoginPage(){
		PageFactory.initElements(driver, this);}
	
		public void HomePage_login(String un, String pwd){
			username.sendKeys(un);
			password.sendKeys(pwd);
			LoginButton.click();
		
	}
	
}
