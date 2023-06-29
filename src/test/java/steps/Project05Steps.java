package steps;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.Project05Page;
import utils.Driver;

import java.util.List;

public class Project05Steps {

    WebDriver driver;
    Project05Page project05Page;

    @Before
    public void setDriver(){
        driver = Driver.getDriver();
        project05Page = new Project05Page();
    }


    @Then("the user should see the {string} heading")
    public void the_user_should_see_the_main_heading(String mainHeadingText) {
        Assert.assertEquals(mainHeadingText, project05Page.mainHeading5.getText());
    }

    @And("the user should see the {string} subheading")
    public void theUserShouldSeeTheSubheading(String subheadingText) {
        Assert.assertEquals(subheadingText, project05Page.subHeading.getText());
    }

    @And("the user should see the {string} paragraph")
    public void theUserShouldSeeTheParagraph(String paragraphText) {
        Assert.assertEquals(paragraphText, project05Page.paragraph.getText());
    }

    @Then("the user should see the {string} button is disabled")
    public void theUserShouldSeeTheButtonIsDisabled(String button) {
       switch (button)   {
           case "Previous" :
               Assert.assertFalse(project05Page.previousButton.isEnabled());
           case "Next" :
               Assert.assertFalse(project05Page.nextButton.isEnabled());
       }
    }

    @And("the user should see the {string} button is enabled")
    public void theUserShouldSeeTheButtonIsEnabled(String button) {
        switch (button)   {
            case "Previous" :
                Assert.assertTrue(project05Page.previousButton.isEnabled());
            case "Next" :
                Assert.assertTrue(project05Page.nextButton.isEnabled());
        }
    }
    @When("the user clicks on the {string} button")
    public void theUserClicksOnTheButton(String button) {
        project05Page.nextButton.click();
    }


        @When("the user clicks on the {string} button till it becomes disabled")
    public void theUserClicksOnTheButtonTillItBecomesDisabled(String button) {
       do {
           project05Page.nextButton.click();
       }
       while(project05Page.nextButton.isEnabled());
        }


    @Then("the user should see {string} City with the info below and an image")
    public void theUserShouldSeeCityWithTheInfoBelowAndAnImage(List<String> cityText) {

        for (int i = 0; i < cityText.size(); i++) {
            Assert.assertEquals(cityText.get(i), project05Page.cityInfo.get(i).getText());
        }
    }

}

