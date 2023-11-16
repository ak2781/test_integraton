package io.cucumber.skeleton;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class StepDefinitions {
    @Given("I have {int} cukes in my belly")
    public void I_have_cukes_in_my_belly(int cukes) {
        Belly belly = new Belly();
        belly.eat(cukes);
    }
    @When("I wait {int} hour")
    public int I_wait_hour(int hour) {
     System.out.print("When");	
     int i = 10;
     return i;
    	
    }
    
  @Then("I am Happy")
    public void I_am_Happy() {
    	 // System.out.print("Then");	
    	  Belly belly = new Belly();
          belly.happy();
    	
    }


@Given("^Users open GW application$")
public void abc() {
    // Write code here that turns the phrase above into concrete actions
   // throw new io.cucumber.java.PendingException();
}
@When("User enters username")
public void user_enters_username() {
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
}
@When("User enters Password")
public void user_enters_password() {
    // Write code here that turns the phrase above into concrete actions
   // throw new io.cucumber.java.PendingException();
}
@When("User clicks Login")
public void user_clicks_login() {
    // Write code here that turns the phrase above into concrete actions
   // throw new io.cucumber.java.PendingException();
}
@Then("User should land on HomePage")
public void user_should_land_on_home_page() {
    // Write code here that turns the phrase above into concrete actions
   // throw new io.cucumber.java.PendingException();
}
}
