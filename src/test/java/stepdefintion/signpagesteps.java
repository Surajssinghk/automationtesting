package stepdefintion;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import page.signpage;

public class signpagesteps {
	
 signpage sign = new signpage();
	
	@And("enter valide username {string} and password {string}")
	public void enter_valide_username_and_password(String x, String y) {
	    
	    sign.enter_valide_username_and_password(x, y);
	}

	@When("validate click functionality")
	public void validate_click_functionality()  {
	 
		sign.validate_click_functionality();
		
		
	}

}
