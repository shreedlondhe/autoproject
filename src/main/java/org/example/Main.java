package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.google.com");

        driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("aditya");
        Thread.sleep(3000);
        WebElement element = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]"));


JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", element);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//h3[text()='Aditya Narayan Jha (@adityanarayanofficial)']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@class='_aagw']")).click();
        System.out.println("Hello world!");
        driver.close();
    }
}