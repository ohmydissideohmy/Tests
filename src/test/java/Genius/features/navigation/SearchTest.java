package Genius.features.navigation;


import Genius.steps.BasePageSteps;
import Genius.steps.SearchPageSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class SearchTest {

    @Steps
    BasePageSteps basePage;
    SearchPageSteps searchPage;

    @Managed
    WebDriver browser;

    @Test
    public void searchTest() {
        basePage.isOnHomePage();
        basePage.userIsSearching();
        searchPage.shouldSeeCorrectSearchResult();
    }
}
