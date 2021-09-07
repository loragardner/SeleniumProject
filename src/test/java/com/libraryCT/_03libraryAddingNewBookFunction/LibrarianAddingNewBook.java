package com.libraryCT._03libraryAddingNewBookFunction;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LibrarianAddingNewBook {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://library2.cybertekschool.com/login.html");
        driver.manage().window().maximize();

        //find Email address box and send valid keys
        WebElement eMailAddressBox = driver.findElement(By.id("inputEmail"));
        eMailAddressBox.submit();
        eMailAddressBox.sendKeys("librarian53@library");
        Thread.sleep(2000);

        //find password box and send valid keys
        WebElement addressBox = driver.findElement(By.id("inputPassword"));
        addressBox.submit();
        addressBox.sendKeys("Sdet2022*");
        Thread.sleep(2000);

        //find sign in button and click it
        WebElement signInBtn = driver.findElement(new By.ByCssSelector("button"));
        if(signInBtn.isEnabled()){
            signInBtn.click();
        }else{
            System.out.println("This button is not clickable");
        }
        Thread.sleep(1200);

        //find books and click
        WebElement booksModule = driver.findElement(new By.ByCssSelector("#menu_item .nav-item:nth-of-type(3) .title"));
        booksModule.click();
        Thread.sleep(2000);

        //find and add book and click
        WebElement addBookBtn = driver.findElement(new By.ByCssSelector(".portlet-title [aria-hidden]"));
        addBookBtn.click();

        //find book name box and click and send keys
        WebElement bookNameBox = driver.findElement(new By.ByCssSelector("input[name='name']"));
        bookNameBox.click();
        bookNameBox.sendKeys("Gone with the wind");
        Thread.sleep(1000);

        //find isbnBox and click and send keys
        WebElement isbnBox = driver.findElement(new By.ByCssSelector("input[name='isbn']"));
        isbnBox.click();
        isbnBox.sendKeys("12345");
        Thread.sleep(1000);

        //find year box and click and send keys
        WebElement yearBox = driver.findElement(new By.ByCssSelector("input[name='year']"));
        yearBox.click();
        yearBox.sendKeys("1936");
        Thread.sleep(1000);


        //find the author box and click and send keys
        WebElement authorBox = driver.findElement(new By.ByCssSelector("input[name='author']"));
        authorBox.click();
        authorBox.sendKeys("Mitchell");
        Thread.sleep(1000);


        //choose book category
        WebElement bookCategory = driver.findElement(new By.ByCssSelector("select#book_group_id"));
        bookCategory.click();
        Thread.sleep(1000);
        WebElement romance = driver.findElement(new By.ByCssSelector("select#book_group_id > option[value='16']"));
        romance.click();
        Thread.sleep(1000);
        // find the save changes button and click
        WebElement saveChangesBtn = driver.findElement(new By.ByCssSelector(".modal-footer .btn-primary"));
        saveChangesBtn.click();
        Thread.sleep(2000);


        //verify new book added
        //  The book has been created.
        String expectedToastMsg = "The book has been created.";
        WebElement actualToastMsg = driver.findElement(new By.ByCssSelector(".toast-message"));
        if(expectedToastMsg.equals(actualToastMsg.getText())){
            System.out.println("-------------------------------------");
            System.out.println("Test Passed");
            System.out.println("actualToastMsg = " + actualToastMsg.getText());
            System.out.println("expectedToastMsg = " + expectedToastMsg);
        }else{
            System.out.println("-------------------------------------");
            System.out.println("Test Failed");
            System.out.println("actualToastMsg = " + actualToastMsg);
            System.out.println("expectedToastMsg = " + expectedToastMsg);
        }
        Thread.sleep(1000);
        System.out.println("-------------------------------------");


        driver.quit();

    }
}