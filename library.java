package com.greetsu;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

    
public class library {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\adity\\Desktop\\GreetsU\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();    
        driver.manage().window().maximize(); 
        driver.get("https://www.google.com");
        System.out.println(driver.getTitle());
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
           WebElement searchBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("gLFyf")));
        searchBox.sendKeys("GreetsU");
        driver.findElement(By.name("btnK")).submit();
        WebElement hyperLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h3[contains(text(), 'GreetsU')]")));
        hyperLink.click();

        WebElement register = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(), 'Register Now!')]")));
        register.click();

        WebElement signUpBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("signup__text")));
        signUpBox.click();

        WebElement email = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("identifierId")));
        email.sendKeys("sample.29071234@gmail.com");

        WebElement nextButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button//span[contains(text(), 'Next')]")));
        nextButton.click();
        System.out.println("Clicked 'Next' after entering the email.");

}
}
