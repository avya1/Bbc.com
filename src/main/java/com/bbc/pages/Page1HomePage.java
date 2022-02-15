package com.bbc.pages;

import com.bbc.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Page1HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(Page1HomePage.class.getName());

    public Page1HomePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath= "(//div[@class='gel-layout gel-layout--center'])[2]")
    List<WebElement> frame;
    @FindBy(className= "se-searchbox__submit")
    WebElement searchButton;
    @FindBy(id="orb-search-q")
    WebElement searchtab;
    @FindBy(id="se-searchbox-input-field")
    WebElement searchtab1;


    public void getAllGamesOnPage(){
        List<WebElement> list = driver.findElements(By.xpath("//div[@data-reactid='.ijj2g76zm8.2.0.0.2.0']//a"));
        for (WebElement link : list) {
            System.out.println(link.getText());   }

    }

    public void serchByText(String searchText){
      pmMouseHoverAndClick(searchtab);
        pmSendTextToElement(searchtab,searchText);
   }

   public void clickOnSearchButton(){
        pmClickOnElement(searchButton);
   }

}
