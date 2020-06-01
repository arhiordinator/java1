package ru.geekbrains.my.sait.at;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CoursesTest extends BaseTest{

    @Test
    void navigationTest() {

        String header;
        driver.get(BASE_URL + "/courses");
        WebElement coursesNavItemButton = driver
                .findElement(By.cssSelector("nav > a[href='/courses']"));
        coursesNavItemButton.click();

        header = driver.findElement(By.className("gb-header__title")).getText();
        Assertions.assertEquals("Курсы", header);
    }
}
