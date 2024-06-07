package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BrowserSetup {
    public WebDriver browser;

    @BeforeSuite
    public void startBrowser() throws InterruptedException {
        browser = new ChromeDriver();

        browser.manage().window().maximize();
        browser.get("https://www.rokomari.com/book");
        browser.findElement(By.xpath("//a[@href='/login']")).click();


        browser.findElement(By.xpath("//input[@placeholder='Email or phone']")).sendKeys("tizufa@gmail.com");
        browser.findElement(By.xpath("//button[text()='Next']")).click();
        Thread.sleep(2000);
        browser.findElement(By.xpath("//input[@type='password']")).sendKeys("z2501a1993");
        browser.findElement(By.xpath("//button[text()='Login']")).click();

    }


    @AfterSuite
    public void quitBrowser() {
        browser.findElement(By.xpath("//a[@class='logged-in-user-menu-btn dropdown-toggle']")).click();
        browser.findElement(By.xpath("//a[@href='/logout']")).click();
        browser.quit();
    }

    public WebElement getElement(By locator) {
        return browser.findElement(locator);
    }

    public void writeOnElement(By locator, String text) {
        getElement(locator).clear();
        getElement(locator).sendKeys(text);
    }

    public Boolean displayStatus(By locator) {
        return getElement(locator).isDisplayed();
    }

    public void clickOnElement(By locator) {
        getElement(locator).click();
    }
}

