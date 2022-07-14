package com.openenglish.step_definitions;

import com.openenglish.pages.HomePage;
import com.openenglish.utilities.BrowserUtils;
import com.openenglish.utilities.Driver;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Banner {
    HomePage homePage=new HomePage();
    @Given("Check banner color and text")
    public void check_banner_color_and_text() {
        homePage.checkBannerText();
        homePage.checkBannerColor();
        homePage.checkCTAtext();
    }
    @Given("Check CTA link")
    public void check_cta_link() {
        homePage.checkCTAButton();
    }


}
