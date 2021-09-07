package com.cybertek;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Homework {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://facebook.com");

        WebElement email= driver.findElement(By.id("email"));
        email.sendKeys("some email here");

        WebElement pass= driver.findElement(By.id("pass"));
        pass.sendKeys("bla bla");

        WebElement loginBtn= driver.findElement(By.name("login"));
        loginBtn.click();

        Thread.sleep(1500);

        driver.navigate().back();

        WebElement forget= driver.findElement(By.className("_6ltj"));
        forget.click();
        WebElement mobile = driver.findElement(By.id("identify_email"));
        mobile.sendKeys("3467686775");
        WebElement search= driver.findElement(By.id("did_submit"));
        search.click();
        Thread.sleep(1500);
        WebElement cancel= driver.findElement(By.xpath("//*[@id=\"identify_yourself_flow\"]/div/div[3]/div/div[1]/a"));
        cancel.click();
        Thread.sleep(1500);
        driver.quit();
    }

}

/*
1. Open Chrome and Navigate to https://facebook.com
2. Enter username `invalid username` into username box
3. Enter password `some password` password box
4. Click on the login button and wait few seconds until error comes back
5. Navigate back to log in screen
6. Click on `forget password` link
7. Enter `something` into Mobile number text box `123456789`
8. Click on the search button
9. Click on the cancel button
10. Quit the browser
 */
