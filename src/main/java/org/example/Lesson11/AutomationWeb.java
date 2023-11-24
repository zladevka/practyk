package org.example.Lesson11;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class AutomationWeb {

  public static void main(String[] args) throws InterruptedException {
    WebDriver browser = new ChromeDriver();

    browser.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    browser.get("https://ithillel.ua/");


    WebElement coursesButton = browser.findElement(By.cssSelector(".site-nav-menu_item:nth-child(2) > .site-nav-link"));
    coursesButton.click();


    WebElement programmingButton = browser.findElement(By.cssSelector(".cats-list_item:nth-child(2) > .cats-list_btn"));
    programmingButton.click();


    WebElement frontButton = browser.findElement(By.cssSelector("#block-202987 .course-list_item:nth-child(1) .course-label_type"));
    frontButton.click();

    ((JavascriptExecutor) browser).executeScript("scrollTo(0, 4000)");


    WebElement click = browser.findElement(By.cssSelector(".coaches_show"));
    click.click();
    Thread.sleep(Long.parseLong("3000"));

    WebElement couchSection = browser.findElement(By.id("coachesSection"));
    List<WebElement> names = couchSection.findElements(By.className("coach-card_name"));
    for (WebElement name : names) {
      System.out.println("Викладач :" + name.getText());
    }


    browser.quit();


  }


}