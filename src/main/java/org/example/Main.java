package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
//        ****** For Manually adding the driver of browser **********
//        System.setProperty("webdriver.edge.driver","C:\\Users\\Ashik\\Downloads\\edgedriver_win64\\msedgedriver.exe");

        WebDriver driver = new EdgeDriver();

        driver.get(("http://www.google.com"));
        driver.get(("http://www.youtube.com"));
        driver.quit();
    }
}