package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Login {

	
	WebDriver driver;
    
    // creation de constructeur
    public Login (WebDriver driver) {
    this.driver=driver;
    PageFactory.initElements(driver,this);
    }
    // identification des elements
    @FindBy (how = How.XPATH,using="//input[@data-qa='login-email']")
    public static WebElement email;
    @FindBy (how = How.XPATH,using="//input[@placeholder='Password']")
    public static WebElement password;
    @FindBy (how = How.XPATH,using="//button[normalize-space()='Login']")
    public static WebElement login;
    
    //creation methode
  	public void saisir_email() {
  	email.sendKeys();
  	}
  	public void saisir_password() {
  	password.sendKeys();
  	}
  	public void cliquer_bouton_login() {
  	login.sendKeys();
  	}
}
