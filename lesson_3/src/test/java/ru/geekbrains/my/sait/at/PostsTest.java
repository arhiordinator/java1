package ru.geekbrains.my.sait.at;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PostsTest extends BaseTest{

    @Test
    void navigationTest() {
        driver.get(BASE_URL + "/posts");
        //driver.quit();
        String header;
        WebElement careerNavItemButton = driver
                .findElement(By.cssSelector("nav > a[href='/posts']"));
        careerNavItemButton.click();

        header = driver.findElement(By.className("gb-header__title")).getText();
        Assertions.assertEquals("Блог", header);
    }
}
