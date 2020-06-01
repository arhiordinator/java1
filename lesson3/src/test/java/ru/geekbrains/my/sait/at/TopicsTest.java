package ru.geekbrains.my.sait.at;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TopicsTest extends BaseTest{

    @Test
    void navigationTest() {
        String header;
        driver.get(BASE_URL + "/topics");
        WebElement coursesNavItemButton = driver
                .findElement(By.cssSelector("nav > a[href='/topics']"));
        coursesNavItemButton.click();

        header = driver.findElement(By.className("gb-header__title")).getText();
        Assertions.assertEquals("Форум", header);
    }
}
