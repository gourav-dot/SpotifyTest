package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class baseTest {

   ChromeDriver driver;
 //  public SpotifyPageObject spo;

 SpotifyPageObject spo;

@BeforeMethod
    public void setDriver() throws IOException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://open.spotify.com/");
        SpotifyPageObject spo= new SpotifyPageObject(driver);
     }


   @AfterMethod(alwaysRun = true)
      public void closeDriver() {

          driver.quit();

      }

}
