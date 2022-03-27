package com.epam.cucumber.invoker.implementation;

import com.epam.cucumber.invoker.WebDriverInvoker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocalChromeInvoker implements WebDriverInvoker {
    @Override
    public WebDriver invokeWebDriver() {
        WebDriverManager.chromedriver()
                .browserVersion("latest")
                .setup();

        return new ChromeDriver();
    }
}
