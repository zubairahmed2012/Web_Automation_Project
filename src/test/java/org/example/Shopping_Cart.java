package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Shopping_Cart extends Book_Select {

    @Test
    public void book_cart() throws InterruptedException {

        browser.findElement(By.xpath("//a[@href='/cart/new']")).click();
        browser.findElement(By.xpath("//a[contains(@class,'btn cart-btn-new')]//span[1]")).click();
        Thread.sleep(2000);
        //browser.findElement(By.xpath("//button[text()=' Add new address ']")).click();

        browser.findElement(By.xpath("//input[@name='addressType']/following-sibling::label")).click();

        WebElement name = browser.findElement(By.xpath("//input[@name='name']"));
        name.clear();
        name.sendKeys("Zubair Hussain");
        Thread.sleep(4000);
        name.clear();
        name.sendKeys("zubair ahmed");


        WebElement phone = browser.findElement(By.xpath("//input[@id='phone']"));
        phone.clear();
        phone.sendKeys("01716810674");
        Thread.sleep(4000);
        phone.clear();
        phone.sendKeys("01677307120");

        WebElement phone2 = browser.findElement(By.xpath("//input[@id='phone2']"));
        phone2.clear();
        phone2.sendKeys("01677307120");
        Thread.sleep(4000);
        phone2.clear();
        phone2.sendKeys("01716810674");


        browser.findElement(By.xpath("//*[text() = 'Australia']")).click();
        Thread.sleep(4000);
        browser.findElement(By.xpath("//*[text() = 'Bangladesh']")).click();


        browser.findElement(By.xpath("//option[@data-lang-eng='Khulna']")).click();
        Thread.sleep(4000);
        browser.findElement(By.xpath("//option[@data-lang-eng='Dhaka']")).click();



        Thread.sleep(4000);
        browser.findElement(By.xpath("//*[@id=\"js--area\"]/option[135]")).click();
        Thread.sleep(4000);
        browser.findElement(By.xpath("//*[@id=\"js--area\"]/option[137]")).click();

        WebElement address = browser.findElement(By.xpath("//textarea[@name='address']"));
        address.clear();
        address.sendKeys("plot-40/1(7th floor),lane-3,block-A,section-6 , mirpur , dhaka");
        Thread.sleep(4000);
        address.clear();
        address.sendKeys("plot-40/1(2nd floor),lane-3,block-A,section-6 , mirpur , dhaka");


        Thread.sleep(4000);

        Actions actions = new Actions(browser);
        WebElement Cash_On = getElement(By.xpath("//label[@for='COD']"));
        actions.scrollToElement(Cash_On).build().perform();
        Cash_On.click();
        //   browser.findElement(By.xpath("//label[@for='COD']")).click();

    }

}
