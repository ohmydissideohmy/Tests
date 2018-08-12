package Genius.ui;

import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends BasePage {

    @FindBy(xpath = "html.snarly.bagon_song_page--enabled.song_stories_public_launch--enabled.ios_spotify_auth--enabled.web_spotify_auth--disabled.clean_up_lyrics_for_sync--disabled.sync_lyrics--disabled.approve_synced_lyrics--disabled.flag_synced_lyrics--disabled.finalize_synced_lyrics--disabled.windows body.act-show.cont-searches.snarly routable-page ng-outlet search-results-page div.u-xx_large_vertical_margins div.column_layout div.column_layout-column_span.column_layout-column_span--secondary div search-result-section div div search-result-items div search-result-item div.u-quarter_vertical_margins.u-clickable mini-artist-card a.mini_card div.mini_card-info.mini_card-info--centered div.mini_card-title")
    private WebElement searchResult;

    public void searchCheck() {
        //Assert.assertEquals("Metallica", searchResult.getText());
        //Assert.assertTrue(searchResult.isDisplayed());
        searchResult.click();
    }
}
