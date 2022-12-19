package com.sauce.StepDefs;

import com.sauce.pages.LoginPage;
import com.sauce.pages.ProductsPage;
import com.sauce.utilities.BrowserUtils;
import com.sauce.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class LoginPositiveNegative_StepDef {

    LoginPage loginPage = new LoginPage();
    ProductsPage productsPage=new ProductsPage();

    @When("When The user is enters {string} and {string}")
    public void when_the_user_is_enters_and(String username, String password) {

        loginPage.login(username, password);
        BrowserUtils.waitFor(1);
    }

    @Then("Then The user should be able to Login and See {string} header")
    public void then_the_user_should_be_able_to_login_and_see_header(String expectedText) {

        Assert.assertEquals("Verify that header is ", expectedText, productsPage.productsText.getText());
    }

    @Then("The User take a error {string}")
    public void theUserTakeAError(String errorText) {

        Driver.get().findElement(By.xpath("//h3[text()='"+errorText+"']")).getText();
    }
}
