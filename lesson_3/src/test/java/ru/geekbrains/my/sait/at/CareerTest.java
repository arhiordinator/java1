package ru.geekbrains.my.sait.at;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CareerTest extends BaseTest{

    @Test
    void navigationTest() {
        driver.get(BASE_URL + "/career");
        //driver.quit();
        String header;
        //String footer;

        WebElement careerNavItemButton = driver
                .findElement(By.cssSelector("nav > a[href='/career']"));
        careerNavItemButton.click();

        header = driver.findElement(By.className("gb-header__title")).getText();
        Assertions.assertEquals("Карьера", header);

    }
}
