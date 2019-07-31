package skeleton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Stepdefs {
	@Given("user open testmeapp online")
	public void user_open_testmeapp_online() {
		System.out.println("user opened TestMeApp");
	}

	@When("user enter username as {string} And password as {string}")
	public void user_enter_username_as_And_password_as(String un, String psd) {
		System.out.println("Entered username is "+un+" and password is "+psd);
	}

	@Then("click on Login button")
	public void click_on_Login_button() {
		System.out.println("click login");

	}

	@Then("verify login success")
	public void verify_login_success() {
		System.out.println("verified login success");

	}

	@When("user enter {string} in search field")
	public void user_enter_in_search_field(String product) {
		System.out.println("user searche for "+product);

	}

	@Then("verify testmeapp displays related items page")
	public void verify_testmeapp_displays_related_items_page() {
	  System.out.println("TestMeApp displayed related items");
	}

	@When("user clicks on logout button")
	public void user_clicks_on_logout_button() {
		System.out.println("user clicks Logout");

	}

	@Then("verify logout success")
	public void verify_logout_success() {
		System.out.println("Logout success");

	}


}
