package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import java.io.IOException;
import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;

public class baseTest {
   WebDriver driver;

@BeforeMethod
    public void setDriver() throws IOException {
    ResourceBundle r=ResourceBundle.getBundle("config");
    String browser=r.getString("browser");

    if (browser.equalsIgnoreCase("chrome")){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }
    if(browser.equalsIgnoreCase("edge")) {
        WebDriverManager.edgedriver().setup();
        driver= new EdgeDriver();
    }
    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    driver.manage().window().maximize();
        driver.get("https://open.spotify.com/");

     }
   @AfterMethod(alwaysRun = true)
      public void closeDriver() {
    driver.quit();
      }

}
