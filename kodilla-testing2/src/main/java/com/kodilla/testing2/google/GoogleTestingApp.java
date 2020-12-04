package com.kodilla.testing2.google;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleTestingApp {

    public static final String SEARCHFIELD = "lst-ib";

public static void main(String[] args) {
    //System.setProperty("webdriver.gecko.driver","c:\\Selenium-drivers\\Firefox\\geckodriver.exe");
    //System.setProperty("webdriver.chrome.driver","c:\\Selenium-drivers\\Chrome\\chromedriver.exe");

    WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
    driver.get("https://google.com");

    WebElement searchField = driver.findElement(By.name(SEARCHFIELD));
    searchField.sendKeys("Kodilla");
    searchField.submit();
}
}
