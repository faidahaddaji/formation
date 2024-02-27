package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PageFormulaire {
  
	WebDriver driver;
	
	//creation de constructeur
	public PageFormulaire (WebDriver driver) {
 	this.driver=driver;
 	PageFactory.initElements(driver,this);
	}
	//identification des elements 
	@FindBy (how = How.ID, using="id_gender1")
	public static WebElement Bt_title;
	
	@FindBy (how=How.ID, using="password")
	public static WebElement Pass;
	
	@FindBy (how=How.XPATH, using ="//select[@id='days']")
	public static WebElement Day;
	
	@FindBy (how=How.XPATH, using ="//select[@id='months']")
	public static WebElement Month;
	
	@FindBy (how=How.XPATH, using ="//select[@id='years']")
	public static WebElement year;
	
	@FindBy (how=How.ID, using ="newsletter")
	public static WebElement newsletter;
	
	@FindBy (how=How.ID, using ="optin")
	public static WebElement offer;
	
	@FindBy (how=How.NAME, using ="first_name")
	public static WebElement First_Name;
	
	@FindBy (how=How.NAME, using ="last_name")
	public static WebElement Last_Name;
	
	@FindBy (how=How.NAME, using ="company")
	public static WebElement compagny;
	
	@FindBy (how=How.NAME, using ="address1")
	public static WebElement Address1;
	
	@FindBy (how=How.NAME, using ="address2")
	public static WebElement Address2;
	
	@FindBy (how=How.NAME, using ="country")
	public static WebElement country;
	
	@FindBy (how=How.NAME, using ="state")
	public static WebElement State;
	
	@FindBy (how=How.NAME, using ="city")
	public static WebElement city;
	
	@FindBy (how=How.ID, using ="zipcode")
	public static WebElement Zipcode;
	
	@FindBy (how=How.NAME, using ="mobile_number")
	public static WebElement Mobile;
	
	@FindBy (how=How.XPATH, using ="")
	public static WebElement create_button;
	
	@FindBy (how=How.XPATH, using ="")
	public static WebElement message_affiche;
	
	
	//creation methode
	public void cliquer_BT_title() {
	Bt_title.click();
	}
	public void cliquer_newsletter() {
	newsletter.click();
	}
	public void cliquer_offer() {
	offer.click();
	}
	public void cliquer_create_button() {
	create_button.click();
	}
	public void saisir_Pass(String text) {
	Pass.sendKeys(text);
	}
	public void saisir_First_Name(String text) {
	First_Name.sendKeys(text);
	}
	public void saisir_Last_Name(String text) {
	Last_Name.sendKeys(text);
	}
	public void saisir_compagny(String text) {
	compagny.sendKeys(text);
	}
	public void saisir_Address1(String text) {
	Address1.sendKeys(text);
	}
	public void saisir_Address2(String text) {
	Address2.sendKeys(text);
	}
	public void saisir_city(String text) {
	city.sendKeys(text);
	}
	public void saisir_State(String text) {
	State.sendKeys(text);
	}
	public void saisir_Zipcode(String text) {
	Zipcode.sendKeys(text);
	}
	public void saisir_Mobile(String text) {
	Mobile.sendKeys(text);
	}
	public void select_day(String txt) {
	Select select = new Select(Day);
	select.selectByValue(txt);
	}
	public void select_Month(String txt) {
	Select select = new Select(Month);
	select.selectByValue(txt);
	}
	public void select_year(String txt) {
	Select select = new Select(year);
	select.selectByValue(txt);
	}
	public void select_country(String txt) {
	Select select = new Select(country);
	select.selectByValue(txt);
	}
	
	public String resultat_obtenu() {
	String t;
	t= message_affiche.getText();
	return t;
	}
}
