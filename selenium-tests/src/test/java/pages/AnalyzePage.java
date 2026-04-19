package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

public class AnalyzePage {

    WebDriver driver;
    WebDriverWait wait;

    public AnalyzePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    private By inputBox = By.cssSelector("[data-testid='input-text']");
    private By analyzeBtn = By.cssSelector("[data-testid='analyze-btn']");
    private By resultTitle = By.cssSelector("[data-testid='result-title']");

    public void enterText(String text) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(inputBox)).sendKeys(text);
    }

    public void clickAnalyze() {
        wait.until(ExpectedConditions.elementToBeClickable(analyzeBtn)).click();
    }

    public boolean isResultDisplayed() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(resultTitle)).isDisplayed();
    }

    public boolean isAnalyzeDisabled() {
        return !driver.findElement(analyzeBtn).isEnabled();
    }
}