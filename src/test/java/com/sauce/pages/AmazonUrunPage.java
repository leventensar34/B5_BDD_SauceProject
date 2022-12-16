package com.sauce.pages;

import com.sauce.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class AmazonUrunPage extends BasePage {


    @FindBy(id = "nav-search-submit-button")
    public WebElement aramaSearchBox;

    @FindBy(xpath = "(//*[@class='a-button-input'])[1]")
    public WebElement changeAddressBtn;

    @FindBy(id = "twotabsearchtextbox")
    public WebElement searchBox;

    @FindBy(id = "searchDropdownBox")
    public WebElement kategoriList;

    @FindBy(className = "a-price-whole")
    public List<WebElement> tumFiyatlar;

    @FindBy(xpath = "//*[@data-component-type='s-search-result']")
    public List<WebElement> tumUrunler;


    public void allList(String tab) {

        Driver.get().findElement(By.id("searchDropdownBox")).click();
        Select select = new Select(kategoriList);
        select.selectByVisibleText(tab);
    }

    public void urunFiyat(){

        try {
            for (WebElement element : tumUrunler) {
                WebElement fiyat=element.findElement(By.className("a-price-whole"));
                System.out.println("element.getText() = " + element.getText());
            }
        }catch (Exception e){

        }

    }
}
