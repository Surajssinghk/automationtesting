package stepdefintion;

import io.cucumber.java.en.And;
import page.filter;

public class filterpage {
	
	  filter filter = new filter();
	  
	 
		@And("check filter button")
		public void check_filter_button() {
			
			filter.check_filter_button();
		}
		

}
