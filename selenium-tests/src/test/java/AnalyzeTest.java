package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AnalyzePage;

public class AnalyzeTest extends BaseTest {

    @Test
    public void testAnalyzeFeature() {

        AnalyzePage page = new AnalyzePage(driver);

        page.enterText("URGENT: Your bank account will be blocked! Click now!");

        page.clickAnalyze();

        Assert.assertTrue(page.isResultDisplayed(),
                "Result not displayed after analysis");
    }

    @Test
    public void testButtonDisabled() {

        AnalyzePage page = new AnalyzePage(driver);

        Assert.assertTrue(page.isAnalyzeDisabled(),
                "Analyze button should be disabled initially");
    }
}