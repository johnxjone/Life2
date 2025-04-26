package OrangePack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	WebDriver driver;
	
public	LoginPage(WebDriver driver){
	
	 this.driver = driver;
}
	
@FindBy(xpath = "//*[@name='username']")

WebElement name;


@FindBy(xpath = "//*[@type='password']")

WebElement Pass;


@FindBy(xpath = "//*[@type='submit']")

WebElement loginbutton;

public void name_loginbox(String Name) {
	
	name.sendKeys(Name);
	
}

public void Password_Box(String passwords) {
	
	Pass.sendKeys(passwords);
	
}
protected void Click_Next() {
	
	loginbutton.click();
	
}
}
