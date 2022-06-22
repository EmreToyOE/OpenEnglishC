package pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import utilities.BrowserUtils;

public class LeadForm extends BasePage{
    @FindBy(id = "firstname-input")
    public WebElement firstname;

    @FindBy(id = "lastname-input")
    public WebElement lastname;

    @FindBy(id = "emailaddress-input")
    public WebElement email;

    @FindBy (id="city-select")
    protected WebElement citySelect;

    @FindBy(xpath = "//*[@id=\"phone-format-selector\"]/label[1]")
    public WebElement mobile;

    @FindBy(id = "phone-inputs")
    public WebElement phoneNumber;

    @FindBy (xpath = "//*[@id=\"phone-inputs\"]/input[1]")
    protected WebElement prefix1;

    @FindBy (xpath = "//*[@id=\"phone-inputs\"]/input[2]")
    protected WebElement prefix2;

    @FindBy (xpath = "//*[@id=\"phone-inputs\"]/input[3]")
    protected WebElement prefix3;

    @FindBy (xpath = "//*[@id=\"phone-inputs\"]/input[4]")
    protected WebElement prefix4;

    @FindBy(id="country-select")
    protected static WebElement countrySelect;

    @FindBy (id="state-select")
    protected WebElement stateSelect;

    @FindBy(id = "agerange-select")
    public WebElement age;

    @FindBy(id = "sharemarketing-input")
    public WebElement checkBox1;

    @FindBy(id = "acceptterms-input")
    public WebElement checkBox2;

    @FindBy(id = "submit-button")
    public WebElement submitBtn;

    @FindBy(className= "hero-ty-page__h2-small")
    public WebElement thankYouPgVerify;

    @FindBy(xpath = "//*[@class=\"hero-ty-page__h2\"]")
    public WebElement tesekkurler;

    public void fillLeadForm(){
        Select select=new Select(age);
        Faker faker=new Faker();

        BrowserUtils.waitFor(3);
        firstname.sendKeys(faker.name().firstName()+"test");
        lastname.sendKeys(faker.name().lastName()+"test");
        email.sendKeys("tester.openenglish+"+faker.internet().emailAddress());
        mobile.click();
        // phoneNumber.sendKeys(faker.phoneNumber().cellPhone());
        prefix2.sendKeys("555");
        prefix3.sendKeys(faker.number().digits(3));
        prefix4.sendKeys(faker.number().digits(4));
        select.selectByIndex(6);
        checkBox1.click();
        checkBox2.click();
        submitBtn.click();



    }
}
