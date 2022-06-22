package pages;

import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import utilities.ConfigurationReader;
import utilities.Driver;

public class HomePage extends BasePage{

    @FindBy(className = "cookie-button")
    public WebElement cookieBtn;

    @FindAll({
            @FindBy (id="phone_tel_number"),
            @FindBy (id="oip-phone_tel_number-new"),// most of pages
            @FindBy (id="phone_tel_n")//OE.com/es-ES mobile page
    })
    public static WebElement iconPhone;

    @FindAll(
            {@FindBy(className = "phone_holder"),
                    @FindBy(className = "phone_holder-new"),// most of pages;
                    @FindBy(className = "phone_h"), //OE.com/es-ES page;
            })
    static WebElement txtPhoneLabelDesktopOE;


    @FindBy (xpath = "//*[@id='promoWrapper']/div/p")
    static WebElement bannerText;

    public void goHomePage(){
        Driver.get().get(ConfigurationReader.get("urlprod"));
        cookieBtn.click();
    }
}
