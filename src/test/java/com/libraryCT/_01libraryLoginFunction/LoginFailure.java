package com.libraryCT._01libraryLoginFunction;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginFailure {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://library2.cybertekschool.com/login.html");
        driver.manage().window().maximize();

        //find Email address box and send invalid keys
        WebElement eMailAddressBox = driver.findElement(By.id("inputEmail"));
        eMailAddressBox.submit();
        eMailAddressBox.sendKeys("test1234@gmail.com");
        Thread.sleep(2000);

        //find password box and send invalid keys
        WebElement addressBox = driver.findElement(By.id("inputPassword"));
        addressBox.submit();
        addressBox.sendKeys("12345");
        Thread.sleep(2000);

        //find sign in button and click it
        WebElement signInBtn = driver.findElement(new By.ByCssSelector("button"));
        if(signInBtn.isEnabled()){
            signInBtn.click();
        }else{
            System.out.println("This button is not clickable");
        }
        Thread.sleep(2000);

        //verify the error message
        WebElement errorMessage = driver.findElement(new By.ByCssSelector("[role]"));
        String expectedErrMsg = "Sorry, Wrong Email or Password";
        String actualErrMsg = errorMessage.getText();
        if (expectedErrMsg.equals(actualErrMsg)) {
            System.out.println("Test Passed - Expected and Actual Error Messages Match");
        }else{
            System.out.println("Test Failed");
            System.out.println("expectedErrMsg = " + expectedErrMsg);
            System.out.println("actualErrMsg = " + actualErrMsg);
        }

        driver.quit();
    }
}