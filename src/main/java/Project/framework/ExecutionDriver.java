package Project.framework;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.io.File;
import java.io.IOException;

public class ExecutionDriver {
    public static WebDriver driver;
    public static final Logger logger= LogManager.getLogger(ExecutionDriver.class);
    @BeforeSuite
    public void ExecutionDriver(){
        try{
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            logger.info("Webdriver setup successfully");
            driver.manage().window().maximize();
            driver.get("https://www.calculator.net");
            logger.info("calculator page open successfully");
        } catch (Exception e) {
            logger.error("Exception occurred while webdriver open of url opening: "+e);
        }
    }
    @AfterSuite
    public void aftersuit(){
        logger.info("Closing WebDriver...");
        driver.quit();
    }
}

