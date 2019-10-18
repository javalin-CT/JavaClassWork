package com.cybertek.tests.Day_1_Basic_Navigation;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowserDemo {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        // open a website
        driver.get("https://cybertekschool.com/");

        Thread.sleep(1000);

        driver.navigate().to("https://amazon.com/");
        System.out.println(driver.getTitle());
        driver.navigate().back();

        Thread.sleep(1000);

        driver.navigate().forward();
        System.out.println(driver.getTitle());

    }
}
