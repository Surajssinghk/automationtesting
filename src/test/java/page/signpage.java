package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import baseclss.Main;

public class signpage extends Main {

	public void enter_valide_username_and_password(String string, String string2) {

		WebElement user = driver.findElement(By.xpath("//input[@id='user-name']"));

		user.sendKeys(string);

		WebElement pass = driver.findElement(By.cssSelector("input#password"));

		pass.sendKeys(string2);

	}

	public void validate_click_functionality() {

		WebElement click = driver.findElement(By.xpath("//input[@id='login-button']"));

		explicitwait(10, "clickable", click);

		clickOnelement(click);

	}
	
	
		
	} 


