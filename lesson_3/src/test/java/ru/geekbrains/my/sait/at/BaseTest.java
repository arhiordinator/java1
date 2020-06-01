package ru.geekbrains.my.sait.at;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public abstract class BaseTest {

    protected WebDriver driver;
    protected final String BASE_URL = "https://geekbrains.ru";

    @BeforeEach
    void setUp() {
        System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-notifications");
        options.addArguments("disable-popup-blocking");
        driver = new ChromeDriver(options);

    }
    @AfterEach
    void tearDown () {
       // driver.quit();
    }
}
