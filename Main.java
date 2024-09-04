package com.greetsu;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Main {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\adity\\Desktop\\GreetsU\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();    
        driver.get("https://www.greetsu.com");
        System.out.println(driver.getTitle());
        Thread.sleep(1000);
       // driver.quit();
    }
}