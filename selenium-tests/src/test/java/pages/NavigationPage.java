package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationPage {

    WebDriver driver;

    public NavigationPage(WebDriver driver) {
        this.driver = driver;
    }

    private By reportsTab = By.cssSelector("[data-testid='nav-reports']");
    private By awarenessTab = By.cssSelector("[data-testid='nav-awareness']");
    private By trendsTab = By.cssSelector("[data-testid='nav-trends']");

    public void goToReports() {
        driver.findElement(reportsTab).click();
    }

    public void goToAwareness() {
        driver.findElement(awarenessTab).click();
    }

    public void goToTrends() {
        driver.findElement(trendsTab).click();
    }
}