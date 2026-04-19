package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AnalyzePage;
import pages.NavigationPage;

public class FullFlowTest extends BaseTest {

    @Test
    public void testCompleteFlow() throws InterruptedException {

        AnalyzePage analyze = new AnalyzePage(driver);
        NavigationPage nav = new NavigationPage(driver);

        // Analyze
        analyze.enterText("Earn ₹5000 daily!!! Limited offer click now");
        Thread.sleep(2000); // Wait 2 seconds
        
        analyze.clickAnalyze();
        Thread.sleep(3000); // Wait 3 seconds for analysis to complete

        Assert.assertTrue(analyze.isResultDisplayed(),
                "Analysis failed");

        Thread.sleep(2000); // Wait 2 seconds
        
        // Navigate
        nav.goToReports();
        Thread.sleep(2000); // Wait 2 seconds
        
        nav.goToAwareness();
        Thread.sleep(2000); // Wait 2 seconds
        
        nav.goToTrends();
        Thread.sleep(2000); // Wait 2 seconds
    }
}