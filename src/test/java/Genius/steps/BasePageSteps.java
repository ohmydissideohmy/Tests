package Genius.steps;

import Genius.ui.BasePage;

import Genius.ui.SearchPage;
import Genius.ui.SongPage;
import net.thucydides.core.annotations.Step;

import static org.assertj.core.api.Assertions.assertThat;


public class BasePageSteps {
    protected BasePage basePage;
    protected SearchPage searchPage;
    protected SongPage songPage;

    @Step
    public void isOnHomePage() {
        basePage.open();
    }
    @Step
    public void Login() {
        basePage.pressSignInButton();
        basePage.loginBoxInput();
        basePage.passwordBoxInput();
        basePage.pressSignInButtonOnLoginForm();
    }

    @Step
    public void shoudSeeLoggedNavbar() {
        basePage.loginCheck();
    }

    @Step
    public void isLoggingOut() {
        basePage.openUserMenu();
        basePage.SignOut();
    }

    @Step
    public void shouldSeeSignInButton() {
        basePage.logoutCheck();
    }

    @Step
    public void userIsSearching() {
        basePage.searchBoxInput();
        basePage.searchBoxSubmit();
    }
}
