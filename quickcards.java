package com.greetsu;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;
public class quickcards {
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
        WebElement quickLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(), 'Quick Cards')]")));
        quickLink.click();

        WebElement congrats = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(), 'Congratulations')]")));
        congrats.click();

        WebElement card1 = wait.until(ExpectedConditions.elementToBeClickable(By.className( "_cardImage_1xff0_167")));

        Actions actions = new Actions(driver);
        actions.moveToElement(card1).perform();
        System.out.println("Card was hovered over,but button not clicked yet");

        WebElement chooseCard = wait.until(ExpectedConditions.elementToBeClickable(By.className("_chooseButton_1xff0_249")));
        System.out.println("Choose Card button is visible.");

        chooseCard.click();
        System.out.println("Button was clicked.");

        WebElement cont = wait.until(ExpectedConditions.elementToBeClickable(By.className("skip__cta")));
        cont.click();
        

        WebElement chooseimg = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span//img[@src='/assets/CongratsCard1-ku1oP9L1.webp']")));
        chooseimg.click();
        System.out.println("Image was chosen");


        WebElement checkCondition = wait.until(ExpectedConditions.elementToBeClickable(By.className("card-header")));
        checkCondition.click();
        System.out.println("Checking if greeting card is being made orderwise...");

        WebElement chooseBackgroundButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(@class, 'nav-options-menu') and normalize-space()='Pick a Background']")));

        Thread.sleep(1000);
        
        chooseBackgroundButton.click();
        System.out.println("Clicked the 'Pick a Background' button.");
        

        WebElement Continue = wait.until(ExpectedConditions.elementToBeClickable(By.className("continue-button")));
        Continue.click();
        System.out.println("Continue to envelop...");

        WebElement chooseEnvelope = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span//img[@src='/assets/envelope-2-Hv7SSlZ7.png']")));
        chooseEnvelope.click();
        System.out.println("Envelope was chosen");

        // WebElement flip = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("flip-envelop-container")));
        // flip.click();
        // System.out.println("Envelop was flipped");

        WebElement Continue2 = wait.until(ExpectedConditions.elementToBeClickable(By.className("continue-button")));
        Continue2.click();
        System.out.println("Continue to final greeting...");

        WebElement chooseBg = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span//img[@src='https://ngwkupedppzavcmlpmif.supabase.co/storage/v1/object/public/greeting-card-images/bg/bg-color-1.svg']")));
        chooseBg.click();
        System.out.println("Background was chosen");

        WebElement finish = wait.until(ExpectedConditions.elementToBeClickable(By.className("continue-button")));
        finish.click();
        System.out.println("Finish the card");
        
        // WebElement share = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button//img[@src='/assets/copy-link-icon-pZpTc-TE.svg']")));
        // share.click();
        // System.out.println("Link Copied!");

        // WebElement remake = wait.until(ExpectedConditions.elementToBeClickable(By.className("create-another-card")));
        // remake.click();
        // System.out.println("Card remake in progress");

        WebElement back = wait.until(ExpectedConditions.elementToBeClickable(By.className("back-to-home-cta")));
        back.click();
        System.out.println("Back to home page");
        
        
        Thread.sleep(5000);
        driver.quit();
    }
}
