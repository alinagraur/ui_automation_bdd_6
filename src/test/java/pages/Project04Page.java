package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.util.List;

public class Project04Page {

    public Project04Page(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "div[class='mb-5'] > h1")
    public WebElement inventoryHeading;

    @FindBy(css = "#product_table > thead > tr > th")
    public List<WebElement> headersTable;

    @FindBy(css = "#product_table > tbody > tr")
    public List<WebElement> rowsFromTable;

    @FindBy(id = "add_product_btn")
    public WebElement addProductButton;

    @FindBy(id = "total_amount")
    public WebElement totalText;



}
