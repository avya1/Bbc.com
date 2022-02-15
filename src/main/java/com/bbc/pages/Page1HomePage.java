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
    @FindBy(xpath= "//span[normalize-space()='Paris Saint Germain']")
    WebElement click;


    public void getAllGamesOnPage(){
       List<WebElement> allgames;
        allgames = driver.findElements(By.xpath("(//div[@class='gel-layout gel-layout--center'])[2]"));
        System.out.println(allgames);
    }

    public void click(){
        pmClickOnElement(click);
   }

}
