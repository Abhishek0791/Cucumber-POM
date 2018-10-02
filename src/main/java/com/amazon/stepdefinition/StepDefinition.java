package com.amazon.stepdefinition;

import java.io.IOException;
import java.util.List;

import com.amazon.base.TestBase;
import com.amazon.pages.CheckOutPage;
import com.amazon.pages.LaunchPage;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class StepDefinition extends TestBase {
	CheckOutPage checkPage;
	LaunchPage startPage;
	public StepDefinition() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Given("^User loads amazon site$")
	public void user_loads_amazon_site()  {
	    // Write code here that turns the phrase above into concrete actions
		initialization();
		driver.get(prop.getProperty("url"));

	}

	@When("^User is on amazon landing page$")
	public void user_is_on_amazon_landing_page()  {
	    // Write code here that turns the phrase above into concrete actions
		String title=driver.getTitle();
		System.out.println("title of the page is:"+ title);
	}

	@Then("^User verifies amazon link is correct$")
	public void user_verifies_amazon_link_is_correct()  {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(startPage.verifyAmazonLogoLink());
	}

	@Then("^user search for a product$")
	public void user_search_for_a_product()  {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
		/*List<String> data=arg1.raw();
		driver.findElement(By.xpath("//input[contains(@id,\\\"twotabsearchtextbox\\\")]")).sendKeys(data.get(0));*/
		startPage.SearchOnHomePage("Titan Regalia Analog Black Dial Men's Watch -NK1163BM02");
	}

	@Then("^user verifies whether product are displayed$")
	public void user_verifies_whether_product_are_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertTrue("Test failed", startPage.verifySearchResults());
	}

	@Then("^user clicks on the product$")
	public void user_clicks_on_the_product()  {
	    // Write code here that turns the phrase above into concrete actions
	   startPage.clickOnItemDisplayed();
	}

	@Then("^user add the product to the cart$")
	public void user_add_the_product_to_the_cart() {
	    // Write code here that turns the phrase above into concrete actions
	    startPage.addItemToCart();
	}

	@Then("^user click on cart and verifies whether item is displayed$")
	public void user_click_on_cart_and_verifies_whether_item_is_displayed()  {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertTrue("Test failed", startPage.verifyItemAddedToCart());
		
	}
	@Then("^Proceed to Check out$")
	public void proceed_to_Check_out() {
	    // Write code here that turns the phrase above into concrete actions
	   startPage.proceedCheckOut();
	}

	@Then("^enter username and password$")
	public void enter_username_and_password(DataTable arg1) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
		List<List<String>> data=arg1.raw();
		driver.findElement(By.xpath("//input[@id=\\\"ap_email\\\"]")).sendKeys(data.get(0).get(0).toString());
		driver.findElement(By.xpath("//input[@id=\\\"ap_email\\\"]")).click();
		driver.findElement(By.xpath("//input[@id=\\\"ap_password\\\"]")).sendKeys(data.get(0).get(1).toString());
		driver.findElement(By.xpath("//input[@id=\\\"ap_password\\\"]")).click();
	}

	@Then("^Verify recipient name$")
	public void verify_recipient_name() {
	    // Write code here that turns the phrase above into concrete actions
	    Assert.assertTrue("Test failed", checkPage.verifyOrderItemDisplay());
	}
}
