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

public class NavigationTest extends  BaseTest{


    @Test
    void navigationTest() {


        driver.get(BASE_URL + "/career");
        //driver.quit();
        String header;
        WebElement careerNavItemButton = driver
        .findElement(By.cssSelector("nav > a[href='/career']"));
        careerNavItemButton.click();

        header = driver.findElement(By.className("gb-header__title")).getText();
        Assertions.assertEquals("Карьера",header);

        WebElement coursesNavItemButton = driver
                .findElement(By.cssSelector("nav > a[href='/courses']"));
        coursesNavItemButton.click();

        header = driver.findElement(By.className("gb-header__title")).getText();
        Assertions.assertEquals("Курсы",header);


    }

}
