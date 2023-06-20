package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.Project04Page;
import utils.Driver;
import utils.TableHandler;

import java.util.List;

public class Project04Steps {

    WebDriver driver;
    Project04Page project04Page;

    @Before
    public void setDriver() {
        driver = Driver.getDriver();
        project04Page = new Project04Page();
    }
        ///TEST1
        @Given("the user is on {string}")
        public void theUserIsOnTechGlobalTrainingComFrontendProject (String string){
            Assert.assertEquals(driver.getCurrentUrl(), "https://techglobal-training.com/frontend/project-4");
        }

        @Then("the user should see the {string} heading")
        public void theUserShouldSeeTheInventoryHeading (String header) {
            Assert.assertEquals(header, project04Page.inventoryHeading.getText());
        }

        @And("the user should see the table with the headers below")
        public void theUserShouldSeeTheTableWithTheHeadersBelow (DataTable dataTable){
        List<String> expected = dataTable.asList();

        for (int i = 0; i < expected.size(); i++) {
        Assert.assertEquals(expected.get(i), project04Page.headersTable.get(i).getText());

    }
}
//////TEST2
        @And("the user should see the table with the rows below")
        public void theUserShouldSeeTheTableWithTheRowsBelow (DataTable dataTable) {


        }


    @And("the user should see the “ADD PRODUCT” button is enabled")
        public void theUserShouldSeeTheADDPRODUCTButtonIsEnabled () {
        Assert.assertTrue(project04Page.addProductButton.isEnabled());
        }

        @And("the user should see the “Total = ${double}” text displayed")
        public void theUserShouldSeeTheTotal$TextDisplayed (String str){
        Assert.assertTrue(project04Page.totalText.isDisplayed());
        Assert.assertEquals(project04Page.totalText.getText(), str);

        }


    @When("the user clicks on the “X” button")
    public void theUserClicksOnTheXButton() {
    }

    @Then("the user should not see the “Add New Product” modal")
    public void theUserShouldNotSeeTheAddNewProductModal() {
    }

    @And("the user enters the quantity as “{int}”")
    public void theUserEntersTheQuantityAs(int arg0) {
    }

    @And("the user enters the product as “Mouse”")
    public void theUserEntersTheProductAsMouse() {
    }

    @And("the user enters the price as “{int}”")
    public void theUserEntersThePriceAs(int arg0) {
    }

    @And("the user clicks on the “SUBMIT” button")
    public void theUserClicksOnTheSUBMITButton() {
    }

    @Then("the user should see the table with the new row below")
    public void theUserShouldSeeTheTableWithTheNewRowBelow() {
    }
}

