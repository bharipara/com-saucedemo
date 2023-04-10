package saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiBrowserTest {
    static String baseUrl = " https://www.saucedemo.com/";
    static String browser = "FireFox";
    static WebDriver driver;

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Chrome")){
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("FireFox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        }else {
            System.out.println("Wrong browser name");
        }
        driver.manage().window().maximize();
        driver.get(baseUrl);
        System.out.println(driver.getTitle());

        // get the current url
        System.out.println("Current Url :" + driver.getCurrentUrl());

        // get the page source
        System.out.println("Page source :" + driver.getPageSource());

        // find the login link element
        //WebElement loginlink = driver.findElement(By.linkText("Log in"));
        //loginlink.click();

        //Find the email element and type email
        WebElement emailField = driver.findElement(By.id("user-name"));
        emailField.sendKeys("Prime123@gmail.com");

        // find the password field element and type the password
        driver.findElement(By.name("password")).sendKeys("Prime123@");

        // close the browser
        driver.close();

    }

}



