package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ReportsPage {

    WebDriver driver;

    public ReportsPage(WebDriver driver) {
        this.driver = driver;
    }

    private By reportsTitle = By.cssSelector("[data-testid='reports-title']");

    public boolean isReportsPageLoaded() {
        return driver.findElement(reportsTitle).isDisplayed();
    }
}