package com.intabella.step_definitions;

import com.intabella.pages.DashboardPage;
import com.intabella.pages.HowToUserPinbarPage;
import com.intabella.utilities.BrowserUtils;
import com.intabella.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.List;

public class US3_StepDefs {
    DashboardPage dashboardPage = new DashboardPage();
    HowToUserPinbarPage howToUserPinbarPage = new HowToUserPinbarPage();

    @And("the user click on the {string} link")
    public void theUserClickOnTheLink(String str) {
        dashboardPage.waitUntilLoaderScreenDisappear();
        dashboardPage.learnHowToUseThisSpaceLink.click();
    }


    @Then("the user should see pinbar texts")
    public void theUserShouldSeePinbarTexts() {
        String expectedText1 = "How To Use Pinbar";
        String expectedText2 = "Use pin icon on the right top corner of page to create fast access link in the pinbar.";
        Assert.assertEquals(expectedText1, howToUserPinbarPage.howToUsePinbarText.getText());
        Assert.assertEquals(expectedText2, howToUserPinbarPage.usePinIconText.getText());

    }

    @Then("the users should see an image on the page")
    public void theUsersShouldSeeAnImageOnThePage() {
        String actualSrc = Driver.getDriver().findElement(By.xpath("//img")).getAttribute("src").split("com/")[1];
        String expectedSrc = "bundles/oronavigation/images/pinbar-location.jpg";

        Assert.assertEquals(expectedSrc, actualSrc);
    }
}
