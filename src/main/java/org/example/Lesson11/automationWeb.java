package org.example.Lesson11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class automationWeb {

  public static void main(String[] args) throws InterruptedException {
    WebDriver browser = new ChromeDriver();
    browser.get("https://ithillel.ua/");


    WebElement coursesButton = browser.findElement(By.cssSelector("#body > div.site-wrapper > div.site-header.-no-logo.-online > div.site-header_nav.site-nav > div > div > nav > ul > li:nth-child(2) > button"));
    coursesButton.click();

    Thread.sleep(3000);

    WebElement programmingButton = browser.findElement(By.cssSelector("#coursesMenuControlPanel > ul > li:nth-child(2) > button"));
    programmingButton.click();

    Thread.sleep(3000);

    WebElement frontButton = browser.findElement(By.cssSelector("#block-202987 > div > ul > li:nth-child(1) > a"));
    frontButton.click();


    Thread.sleep(3000);
    browser.quit();
  }

}