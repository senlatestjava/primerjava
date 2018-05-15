package com.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class PageYoutube {

    private WebDriver driver;

    By searchInput= By.id("search");
    By searchBtn = By.xpath("//button[@id='search-icon-legacy']");
    By inputKeyboard = By.xpath("//a[@class='gsst_a']");


   public PageYoutube(WebDriver driver) {
        this.driver=driver;
   }

   public void typeSearchLine(){
       driver.findElement(searchInput).sendKeys("Видео");
   }

   public void clickSearchBtn(){
       driver.findElement(searchBtn).click();
   }

}
