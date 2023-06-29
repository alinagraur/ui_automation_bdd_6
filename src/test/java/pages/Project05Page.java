package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.util.List;

public class Project05Page {
    public Project05Page(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "div/div[2]/div/div/div/div/div[5]/div[1]/h1")
    public WebElement mainHeading5;

      @FindBy(id = "sub_heading")
    public WebElement subHeading;

      @FindBy(id = "content")
    public WebElement paragraph;

      @FindBy(id = "previous")
    public WebElement previousButton;

      @FindBy(id = "next")
    public WebElement nextButton;


      @FindBy(css = "p[class*='_info'] ] ")
    public List<WebElement> cityInfo;



}
