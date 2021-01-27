package NopCom;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DemoStepdef extends Utils {
    DemoPage demoPage = new DemoPage();

    @Given("^User has Advertise banner on page$")
    public void user_has_Advertise_banner_on_page()  {
        demoPage.LaunchDemoPage();
        demoPage.CheckAdvertisementIsVisible();

    }

    @When("^I click on that banner$")
    public void i_click_on_that_banner() {
        demoPage.ClickTheAdvertisement();

    }

    @Then("^it should open up the webpage in new window$")
    public void it_should_open_up_the_webpage_in_new_window() {

    }

}
