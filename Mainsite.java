package com.greetsu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

public class Mainsite {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\adity\\Desktop\\GreetsU\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();    
        driver.get("https://www.google.com");
        System.out.println(driver.getTitle());
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
           WebElement searchBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("gLFyf")));
        searchBox.sendKeys("GreetsU");
        driver.findElement(By.name("btnK")).submit();
        WebElement hyperLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h3[contains(text(), 'GreetsU')]")));
        hyperLink.click();
        Thread.sleep(5000);
        driver.quit();
    }
}
