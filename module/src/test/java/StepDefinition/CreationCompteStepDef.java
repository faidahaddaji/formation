package StepDefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import Hooks.SetUp;
import PageObject.Login;
import PageObject.PageAccueil;
import PageObject.PageFormulaire;
import io.cucumber.java.en.*;



public class CreationCompteStepDef {
	
	WebDriver driver = SetUp.driver;
	
			
	//initialisation des pages objects
	PageAccueil accueil = new PageAccueil (driver);
	PageFormulaire formule = new  PageFormulaire(driver);
	Login login= new Login(driver);
	
	@Given("saisir URL {string}")
	public void saisir_url(String string) {
	 accueil.saisieURL(string); 
	}

	@When("Click to Signup_Login")
	public void click_to_signup_login() {
	 accueil.cliqueBt_signup1();  
	}

	@When("whrite Name {string}")
	public void whrite_name(String string) {
	 accueil.creerName(string);   
	}

	@When("whrite mail {string}")
	public void whrite_mail(String string) {
	accueil.crremail(string);    
	}

	@When("Click to the button Signup")
	public void click_to_the_button_signup() {
	accueil.cilquerBt_signup2();   
	}

	@Then("Verification information account")
	public void verification_information_account() {
	    
	}

	@When("Fill title")
	public void fill_title() {
	formule.cliquer_BT_title();    
	}

	@When("Fill Password {string}")
	public void fill_password(String string) {
	 formule.saisir_Pass(string); 
	}

	@When("Fill Date of birth {string} , {string} et {string}")
	public void fill_date_of_birth_et(String string, String string2, String string3) {
	 formule.select_day(string); 
	 formule.select_Month(string2);
	 formule.select_year(string3);
	}

	@When("Select checkbox Sign up newsletter")
	public void select_checkbox_sign_up_newsletter() {
	 formule.cliquer_newsletter();  
	}

	@When("Select checkbox Receive special offers partners")
	public void select_checkbox_receive_special_offers_partners() {
	 formule.cliquer_offer();   
	}

	@When("Fill First name:{string}, Last name:{string}, Company:{string}, Address:{string}, Address2:{string}")
	public void fill_first_name_last_name_company_address_address2(String string, String string2, String string3, String string4, String string5) {
	formule.saisir_First_Name(string);
	formule.saisir_Last_Name(string2);
	formule.saisir_compagny(string3);
	formule.saisir_Address1(string4);
	formule.saisir_Address2(string5);
	}

	@When("Fill again Country:{string}, State:{string}, City:{string}, Zipcode:{string}, Mobile Number:{string}")
	public void fill_again_country_state_city_zipcode_mobile_number(String string, String string2, String string3, String string4, String string5) {
	 formule.select_country(string); 
	 formule.saisir_State(string2);
	 formule.saisir_city(string3);
	 formule.saisir_Zipcode(string4);
	 formule.saisir_Mobile(string5);
	}

	@When("Click Create Account button")
	public void click_create_account_button() {
	formule.cliquer_create_button();  
	}

	@Then("Verify that {string} is visible")
	public void verify_that_account_created_is_visible(String string) {
	Assert.assertTrue(formule.resultat_obtenu().contains(string));
	}
	@When("saisir le mail {string}")
	public void saisir_le_mail(String string) {
	login.saisir_email();
	}

	@When("saisir le password pour le login {string}")
	public void saisir_le_password_pour_le_login(String string) {
	login.saisir_password();    
	}

	@When("cliquer sur le bouton login2")
	public void cliquer_sur_le_bouton_login2() {
	login.cliquer_bouton_login();    
	}
}
