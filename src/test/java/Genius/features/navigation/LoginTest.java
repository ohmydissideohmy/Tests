package Genius.features.navigation;

import Genius.steps.BasePageSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class LoginTest  {

    @Steps
    BasePageSteps user;

    @Managed
    WebDriver browser;

    @Test
    public void loginTest() {
        //given
        user.isOnHomePage();
        //when
        user.Login();
        //then
        user.shoudSeeLoggedNavbar();
    }
}
