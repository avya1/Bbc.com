package com.bbc.pages;

import com.bbc.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SearchResultPage extends Utility {

    private static final Logger log = LogManager.getLogger(SearchResultPage.class.getName());

    public SearchResultPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath= "(//div[@class='gel-layout gel-layout--center'])[2]")
    List<WebElement> frame;
}
