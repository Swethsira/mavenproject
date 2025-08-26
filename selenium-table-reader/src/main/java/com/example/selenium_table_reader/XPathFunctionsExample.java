package com.example.selenium_table_reader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
 
public class XPathFunctionsExample {
   public static void main(String[] args) {
      
WebDriver driver = new ChromeDriver();
       driver.get("file:///C:/Users/Siras/OneDrive/Desktop/wiprotask/demo.html");
 
       // Example of contains() - locate username field using partial placeholder text
       WebElement usernameField = driver.findElement(By.xpath("//input[contains(@placeholder,'username')]"));
       usernameField.sendKeys("testuser");


 
        // Example of contains() - locate password field using partial attribute value
       WebElement passwordField = driver.findElement(By.xpath("//input[contains(@placeholder,'password')]"));
       passwordField.sendKeys("testpass");
 
       // Example of text() - locate link by the visible text
       WebElement forgotLink = driver.findElement(By.xpath("//a[text()='Forgot Password?']"));
      forgotLink.click();
 
       driver.quit();
      

    	
   }
}