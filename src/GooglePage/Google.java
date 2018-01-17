package GooglePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverBackedSelenium;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.thoughtworks.selenium.Selenium;

public class Google {
    public void search(String critery) {
        // You may use any WebDriver implementation. Firefox is used here as an example
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, 10);

        // A "base url", used by selenium to resolve relative URLs
        String baseUrl = "https://test.salesforce.com/";

        // Create the Selenium implementation
        Selenium selenium = new WebDriverBackedSelenium(driver, baseUrl);

     // Perform actions with selenium
        selenium.open("https://test.salesforce.com/");
        selenium.waitForPageToLoad("10000");
        selenium.type("id=username", "adrian@jalasoft.com.adrian01");
        selenium.type("id=password", "Admin1234");
        selenium.click("id=Login");
        selenium.waitForPageToLoad("10000");

        selenium.click("id=userNavLabel");
        //selenium.stop();
        driver.close();
    }
}
