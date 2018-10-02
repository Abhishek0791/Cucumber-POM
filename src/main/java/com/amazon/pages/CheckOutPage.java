package com.amazon.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.base.TestBase;

public class CheckOutPage extends TestBase {
	public CheckOutPage() throws IOException {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//b[contains(text(),\"Kumud Pandey\")]")
	WebElement recipientLabel;
	public boolean verifyOrderItemDisplay() {
		boolean checkOutItemVerify=recipientLabel.isDisplayed();
		return checkOutItemVerify;
	}
}
