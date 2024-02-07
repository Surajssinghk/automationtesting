package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import baseclss.Main;

public class filter extends Main {

	public void check_filter_button(){
			
		   // driver.findElement(By.xpath("//select[@class='product_sort_container']")).click();
		    
			WebElement ele = driver.findElement(By.xpath("//select[@class='product_sort_container']"));
			
			ele.click();
			
			select_method_dropdown(ele , "visibletext", "Price (low to high)");
			
			
			 
	}
			
}