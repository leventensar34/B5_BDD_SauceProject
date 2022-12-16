package com.sauce.StepDefs;

import com.sauce.pages.AmazonUrunPage;
import com.sauce.utilities.BrowserUtils;
import com.sauce.utilities.ConfigurationReader;
import com.sauce.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmazonUrun_StepDefs {

    AmazonUrunPage amazonUrunPage=new AmazonUrunPage();

    @Given("The User login Amazon page")
    public void the_user_login_amazon_page() {
        Driver.get().get(ConfigurationReader.get("url2"));

    }
    @When("The User click fortfahren button")
    public void the_user_click_fortfahren_button() {

        amazonUrunPage.changeAddressBtn.click();
    }

    @When("The User to choose {string}")
    public void the_user_to_choose(String tab) {

        BrowserUtils.waitFor(1);
        amazonUrunPage.allList(tab);
    }
    @When("The User choose a {string}")
    public void the_user_choose_a(String urun) {

        BrowserUtils.waitFor(1);
        amazonUrunPage.searchBox.sendKeys(urun);

    }
    @When("The user click searchbox")
    public void the_user_click_searchbox() {

        amazonUrunPage.aramaSearchBox.click();

    }
    @Then("The User take all price")
    public void the_user_take_all_price() {

        amazonUrunPage.urunFiyat();
    }


}
