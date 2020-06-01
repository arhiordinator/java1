package ru.geekbrains.my.sait.at;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class SearchTest  extends  BaseTest{




    @Test
    void SearchJavaTest() {

        String[] subStr;
        // Разделитель
        String delimiter = "・";
        driver.get(BASE_URL + "/courses");
        ///driver.findElement(By.xpath("//div/div/button[*]")).click();
        WebElement searchButton = driver.findElement(By.cssSelector(" ul > li > .show-search-form"));
        searchButton.click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebElement searchInput = driver.findElement(By.cssSelector(".search-panel__search-field"));
        searchInput.sendKeys("Java");

        //профессии
       WebElement professionsTab = driver.findElement(By.cssSelector("ul.search-page-tabs > li > a[data-tab='professions']"));
        subStr = professionsTab.getText().split(delimiter);
        if (Integer.parseInt(subStr[1]) < 2)  {
          System.out.println("Профессий меньше двух");
        }
//курсы
        WebElement coursesTab = driver.findElement(By.cssSelector("ul.search-page-tabs > li > a[data-tab='courses']"));

        subStr = coursesTab.getText().split(delimiter);
        if (Integer.parseInt(subStr[1]) > 15)  {
            System.out.println("Курсов больше 15");
        }

        //вебинары
        WebElement webinarsTab = driver.findElement(By.cssSelector("ul.search-page-tabs > li > a[data-tab='webinars']"));

        subStr = webinarsTab.getText().split(delimiter);
        if (Integer.parseInt(subStr[1]) > 180 & Integer.parseInt(subStr[1]) < 300)   {
            System.out.println("Вебинаров больше 180, но меньше 300");
        }


        WebElement blogsTab = driver.findElement(By.cssSelector("ul.search-page-tabs > li > a[data-tab='blogs']"));
        subStr = blogsTab.getText().split(delimiter);
        if (Integer.parseInt(subStr[1]) > 300){
            System.out.println("Блогов больше 300");
        }

        WebElement forumsTab = driver.findElement(By.cssSelector("ul.search-page-tabs > li > a[data-tab='forums']"));
        subStr = forumsTab.getText().split(delimiter);
        if (Integer.parseInt(subStr[1]) != 350){
            System.out.println("Форумов не 350");
        }

        WebElement testsTab = driver.findElement(By.cssSelector("ul.search-page-tabs > li > a[data-tab='tests']"));
        subStr = testsTab.getText().split(delimiter);
        if (Integer.parseInt(subStr[1]) != 0){
            System.out.println("Тестов не 0");
        }
    }

}
