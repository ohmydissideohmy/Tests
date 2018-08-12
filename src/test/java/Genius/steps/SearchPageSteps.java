package Genius.steps;


import Genius.ui.SearchPage;
import net.thucydides.core.annotations.Step;

public class SearchPageSteps extends BasePageSteps {

    @Step
    public void shouldSeeCorrectSearchResult() {
        searchPage.searchCheck();
    }
}
