package com.openenglish.step_definitions;

import com.openenglish.utilities.BrowserUtils;
import com.openenglish.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.devtools.v85.network.model.DataReceived;

public class AllPages {

    @Given("the user visit {string}")
    public void the_user_visit(String string) {
        Driver.get().get(string);
    }
    @Then("there is no broken image")
    public void there_is_no_broken_image() {
        BrowserUtils.check_broken_images();
    }

    @Then("there is no broken link")
    public void there_is_no_broken_link() {

       BrowserUtils.check_broken_links();
    }

    @Given("Page element  {string}  {string}  {string} is as expected")
    public void page_element_is_as_expected(String string, String expectedURL, String expectedTitle) {

    BrowserUtils.waitFor(3);
    Assert.assertEquals(Driver.get().getCurrentUrl(), expectedURL);
    Assert.assertTrue(Driver.get().getTitle().contains(expectedTitle));

    }
    @Given("Page element {string}  {string} is as expected")
    public void page_element_is_as_expected(String expectedURL, String expectedTitle) {
        Driver.get().get(expectedURL);
        BrowserUtils.waitFor(3);
        Assert.assertTrue(Driver.get().getTitle().contains(expectedTitle));

    }


    @Given("the user visit {string} and check broken image")
    public void the_user_visit_and_check_broken_image(String string) {
        Driver.get().get(string);
        BrowserUtils.waitFor(3);
        BrowserUtils.check_broken_images();

    }
    @Given("the user visit {string} and check broken link")
    public void the_user_visit_and_check_broken_link(String urls) {
        Driver.get().get(urls);
        BrowserUtils.waitFor(3);
        BrowserUtils.check_broken_links();

    }

    @Given("the user visit {string} and check broken images")
    public void the_user_visit_and_check_broken_images(String string) {
        Driver.get().get(string);
        BrowserUtils.waitFor(3);
    }
}
