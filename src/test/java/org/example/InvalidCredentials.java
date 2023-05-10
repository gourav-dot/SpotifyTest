package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InvalidCredentials extends baseTest {

    @Test
    public void emptyCredentials() throws InterruptedException {
        SpotifyPageObject spo = new SpotifyPageObject(driver);
        driver.findElement(By.xpath("//span[contains(text(),'Log in')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[@class='ButtonInner-sc-14ud5tc-0 cJdEzG encore-bright-accent-set']")).click();
        boolean isEmptyFieldsLoginSuccessful = driver.getCurrentUrl().contains("login");
        Assert.assertEquals(isEmptyFieldsLoginSuccessful,true);
        driver.close();
    }
}
