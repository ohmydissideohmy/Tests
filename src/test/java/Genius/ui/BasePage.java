package Genius.ui;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactoryFinder;

@DefaultUrl("https://genius.com/")
public class BasePage extends PageObject {

    @FindBy(css = "a.header-action:nth-child(2)")
    private WebElement signInButton;

    @FindBy(css = "input.square_input:nth-child(3)")
    private WebElement loginBox;

    @FindBy(css = "input.square_input:nth-child(4)")
    private WebElement passwordBox;

    @FindBy(css = "button.square_button")
    private WebElement loginFormSignInButton;

    @FindBy(css = ".header-actions")
    private WebElement loggedNavbar;

    @FindBy(css = "a.feed_dropdown-item:nth-child(4)")
    private WebElement logoutButton;

    @FindBy(css = "html.snarly.bagon_song_page--enabled.song_stories_public_launch--enabled.ios_spotify_auth--enabled.web_spotify_auth--disabled.clean_up_lyrics_for_sync--disabled.sync_lyrics--disabled.approve_synced_lyrics--disabled.flag_synced_lyrics--disabled.finalize_synced_lyrics--disabled.windows body.act-show.cont-home.snarly div.header div.header-primary.active header-actions mutually-exclusive-switches div.header-actions header-admin div.header-action")
    private WebElement userAvatar;

    @FindBy(css = ".quick_search")
    private WebElement searchBox;

    public void searchBoxInput() {
        searchBox.sendKeys("Metallica");
    }

    public void searchBoxSubmit() {
        searchBox.submit();
    }


    public void pressSignInButton() {
        signInButton.click();
    }

    public void loginBoxInput() {
        loginBox.sendKeys("ohmywizard");
    }

    public void passwordBoxInput() {
        passwordBox.sendKeys("dankpassword123");
    }

    public void pressSignInButtonOnLoginForm() {
        loginFormSignInButton.click();
    }

    public void loginCheck() {
        Assert.assertTrue(loggedNavbar.isDisplayed());
    }

    public void SignOut() {
        logoutButton.click();
    }

    public void logoutCheck() {
        Assert.assertTrue(signInButton.isDisplayed());
    }

    public void openUserMenu() {
        userAvatar.click();
    }
}
