package Genius.features.navigation;


import Genius.steps.BasePageSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class LogoutTest {

    @Steps
    BasePageSteps basePage;


    @Managed
    WebDriver browser;

    @Test
    public void loggingOut() {
        //given
            basePage.isOnHomePage();
            basePage.Login();
        //when
            basePage.isLoggingOut();
        //then
            basePage.shouldSeeSignInButton();
    }
}
