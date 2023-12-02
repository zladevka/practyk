package org.example.Lesson12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class TestingPage {
  private static final String MAIN_URL = "https://ithillel.ua/courses/testing ";
  private static final String coursesListLocatorPageCSS = "#categories > div.profession > div > ul > li > div > div:nth-child(2) > ul";
  private static final String listOfAdditionalCoursesCSS = "#categories > div.profession > div > ul > li > div > div:nth-child(3) > ul";
  private static final String whyShouldYouBecomeCSS = "#body > div.site-wrapper > main > section.section.-opportunities";
  private static final String PROGRAMMIN_Button = "#categories > div > ul > li:nth-child(1) > a";
  private static final String MANAGEMENT_Button = "#categories > div > ul > li:nth-child(3)";
  private static final String MARKETING_Button = "#categories > div > ul > li:nth-child(4)";
  private static final String DESIGN_Button = "#categories > div > ul > li:nth-child(5)";
  private static final String CHILDRENS_COURSES_Button = " #categories > div > ul > li:nth-child(6)";

  private WebDriver driver;
  private WebElement coursesListLocatorPage;
  private WebElement listOfAdditionalCourses;
  private WebElement whyShouldYouBecome;
  private WebElement programmingButton;
  private WebElement managementButton;
  private WebElement marketingButton;
  private WebElement designButton;
  private WebElement childrenSCoursesButton;

  public TestingPage(WebDriver driver) {
    this.driver = driver;
    driver.get(MAIN_URL);
  }

  public TestingPage openPage() {
    driver.get(MAIN_URL);
    return this;
  }

  public TestingPage checkCoursesListLocatorPage() {
    if (coursesListLocatorPage == null) {
      coursesListLocatorPage = driver.findElement(By.cssSelector(coursesListLocatorPageCSS));
      coursesListLocatorPage.findElements(By.className("block-profession_item"));
    }
    return this;
  }

  public TestingPage checkListOfAdditionalCourses() {
    if (listOfAdditionalCourses == null) {
      listOfAdditionalCourses = driver.findElement(By.cssSelector(listOfAdditionalCoursesCSS));
      listOfAdditionalCourses.findElements(By.className("block-profession_item"));
    }
    return this;
  }

  public TestingPage checkWhyShouldYouBecome() {
    if (whyShouldYouBecome == null) {
      whyShouldYouBecome = driver.findElement(By.cssSelector(whyShouldYouBecomeCSS));
      whyShouldYouBecome.findElements(By.className("opportunities_item"));
    }
    return this;
  }

  public TestingPage checkProgrammingButton() {
    if (programmingButton == null) {
      programmingButton = driver.findElement(By.cssSelector(PROGRAMMIN_Button));

    }
    programmingButton.click();
    return this;
  }

  public TestingPage checkManagementButton() {
    if (managementButton == null) {
      managementButton = driver.findElement(By.cssSelector(MANAGEMENT_Button));

    }
    managementButton.click();
    return this;
  }

  public TestingPage checkMarketingButton() {
    if (marketingButton == null) {
      marketingButton = driver.findElement(By.cssSelector(MARKETING_Button));

    }
    marketingButton.click();
    return this;
  }

  public TestingPage checkDesignButton() {
    if (designButton == null) {
      designButton = driver.findElement(By.cssSelector(DESIGN_Button));

    }
    designButton.click();
    return this;
  }

  public TestingPage checkChildrenSCoursesButton() {
    if (childrenSCoursesButton == null) {
      childrenSCoursesButton = driver.findElement(By.cssSelector(CHILDRENS_COURSES_Button));

    }
    childrenSCoursesButton.click();
    return this;
  }


}
