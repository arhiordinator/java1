package ru.geekbrains.my.sait.at;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class TestsTest extends BaseTest{

    @Test
    void navigationTest() {

        //driver.quit();
        String header;
        driver.get(BASE_URL + "/tests");
        WebElement careerNavItemButton = driver
                .findElement(By.cssSelector("nav > a[href='/tests']"));
        careerNavItemButton.click();

        header = driver.findElement(By.className("gb-header__title")).getText();
        Assertions.assertEquals("Тесты", header);
    }
}
