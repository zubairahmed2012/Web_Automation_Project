package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


public class Book_Select extends BrowserSetup{
    @Test
    public void Book_section_process() throws InterruptedException {
        //browser.get("https://www.rokomari.com/book?ref=nm");

        Actions actions = new Actions(browser);
        //Thread.sleep(10000);
        WebElement hoverElement = getElement(By.xpath("//a[@id='js--authors']"));
        //Thread.sleep(1000);
        actions.clickAndHold(hoverElement).build().perform();
        Thread.sleep(1000);

        browser.findElement(By.xpath("//ul[@id='js--authors-menu']/div[1]/div[1]/li[1]/a[1]")).click();

        WebElement current_novel = getElement(By.xpath("//input[@name='categoryIds']/following-sibling::label"));
        actions.scrollToElement(current_novel).build().perform();
        current_novel.click();

        WebElement next_page = getElement(By.xpath("html[1]/body[1]/div[6]/div[1]/div[1]/div[1]/section[3]/div[3]/a[4]"));
        actions.scrollToElement(next_page).build().perform();
        next_page.click();

        WebElement book_selection = getElement(By.xpath("//a[@href='/book/1264/jol-jochna']"));
        actions.scrollToElement(book_selection).build().perform();
        actions.clickAndHold(book_selection).build().perform();

        browser.findElement(By.xpath("//button[@product-id='1264']")).click();
        Thread.sleep(2000);



    }
}