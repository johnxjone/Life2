package Stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import OrangePack.BasePage;
import OrangePack.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Stefdefenation {
	 WebDriver driver;
   	LoginPage loginPage1;
	public Stefdefenation(){
		
		this.driver = BasePage.getDriver();
		loginPage1 = PageFactory.initElements(driver, LoginPage.class );		
	}
	
	@Given("user shoud give the name of user box")
	public void user_shoud_give_the_name_of_user_box() {
		
		loginPage1.name_loginbox("Admin");

	}

	@Given("user shoud give the pasword of pasword box")
	public void user_shoud_give_the_pasword_of_pasword_box() {
		
		loginPage1.Password_Box("admin123");
	    
	}

	@When("user shoud click the login")
	public void user_shoud_click_the_login() {
		
		
	}




}
