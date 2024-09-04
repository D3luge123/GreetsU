package com.greetsu;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;
public class cardmaker {
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

        WebElement createCard = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(), 'Explore Our Cards')]")));
        createCard.click();

        WebElement chooseCategory = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(), 'Thank You')]")));
        chooseCategory.click();

        WebElement card = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@src='/assets/ThankYouCard2-UvaQqHuv.webp']")));
         Actions actions = new Actions(driver);
        actions.moveToElement(card).perform();
        System.out.println("Card was hovered over,but button not clicked yet");

        // WebElement chooseCard = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(), 'Choose Card')]")));
        // System.out.println("Choose Card button is visible.");

        WebElement chooseCard = wait.until(ExpectedConditions.elementToBeClickable(By.className("_chooseButton_1xff0_249")));
        System.out.println("Choose Card button is visible.");

        chooseCard.click();
        System.out.println("Button was clicked.");

        WebElement card2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@src='/assets/ThankYouCard2-UvaQqHuv.webp']")));
        card2.click();

        WebElement continueElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("continue-button")));
        continueElement.click();
    }
}
