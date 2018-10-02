package com.amazon.pages;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.base.TestBase;

public class LaunchPage extends TestBase {

	public LaunchPage() throws IOException {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//a[contains(@class,\"nav-sprite nav-logo-tagline nav-prime-try\")]")
	WebElement logoLink;
	
	@FindBy(xpath="//input[contains(@id,\"twotabsearchtextbox\")]")
	WebElement textBox;
	@FindBy(xpath="//img[contains(@alt,\"Titan Regalia Analog Black Dial Men's Watch -NK1163BM02\")]")
	WebElement searchDisplay;
	@FindBy(xpath="//h2[contains(text(),\"Titan Regalia Analog Black Dial Men's Watch -NK1163BM02\")]")
	WebElement searchDisplayText;
	@FindBy(xpath="//span[contains(text(),\"Titan Regalia Analog Black Dial Men's Watch -NK1163BM02\")]")
	WebElement textDisplayItemPage;
	@FindBy(xpath="//input[contains(@class,\"a-button-input\")]")
	WebElement addToCart;
	@FindBy(xpath="//a[contains(@class,\"a-button-text\")]")
	WebElement cartButton;
	@FindBy(xpath="//span[contains(@class,\"a-size-medium sc-product-title a-text-bold\")]")
	WebElement cartItemVerify;
	@FindBy(xpath="//input[contains(@name,\"proceedToCheckout\")]")
	WebElement proceedToCheckOut;
	/*@FindBy(xpath="//input[@id=\"ap_email\"]")
	WebElement loginEmail;
	@FindBy(xpath="//input[@id=\"ap_password\"]")
	WebElement loginPwd;*/
	//@FindBy(xpath="//input[@type=submit]")
	//WebElement loginButton;
	
	public boolean verifyAmazonLogoLink() {
		boolean logoPresenceVerify=logoLink.isDisplayed();
		return logoPresenceVerify;
	}
	
	public void SearchOnHomePage(String searchString) {
		textBox.sendKeys(searchString);
		textBox.sendKeys(Keys.ENTER);
	}
	
	public boolean verifySearchResults() {
		boolean searchResultsVerify=searchDisplayText.isDisplayed();
		return searchResultsVerify;
	}
	
	public boolean verifySelectedSearchItem() {
		boolean textDisplayVerify=textDisplayItemPage.isDisplayed();
		return textDisplayVerify;
	}
	public void clickOnItemDisplayed() {
		textDisplayItemPage.click();
	}
	public void addItemToCart() {
		addToCart.click();
	}
	public boolean verifyItemAddedToCart() {
		boolean cartItemValidate=cartItemVerify.isDisplayed();
		return cartItemValidate;
	}
	public void proceedCheckOut() {
		proceedToCheckOut.click();
	}
	/*public CheckOutPage login(String username, String pwd) throws IOException {
		loginEmail.sendKeys(username);
		loginEmail.submit();
		loginPwd.sendKeys(pwd);
		loginPwd.submit();
		return new CheckOutPage();
	}*/
	
	
	
}
