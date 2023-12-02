package org.example.Lesson12;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class TestingPageTest {
  public static void main(String[] args) throws InterruptedException {
    WebDriver browser = new ChromeDriver();
    browser.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    TestingPage PageTest = new TestingPage(browser);
    PageTest.openPage()
        .checkCoursesListLocatorPage()
        .checkListOfAdditionalCourses()
        .checkWhyShouldYouBecome()
        .checkProgrammingButton()
        .checkManagementButton()
        .checkMarketingButton()
        .checkDesignButton()
        .checkChildrenSCoursesButton();
        browser.quit();
  }
}
