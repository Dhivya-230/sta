package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.NavigationPage;
import pages.ReportsPage;

public class NavigationTest extends BaseTest {

    @Test
    public void testReportsNavigation() {

        NavigationPage nav = new NavigationPage(driver);
        ReportsPage reports = new ReportsPage(driver);

        nav.goToReports();

        Assert.assertTrue(reports.isReportsPageLoaded(),
                "Reports page not loaded");
    }
}