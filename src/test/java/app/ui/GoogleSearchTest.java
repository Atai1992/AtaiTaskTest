package app.ui;


import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.Condition;
import org.testng.annotations.Test;

public class GoogleSearchTest extends BaseUiTest{

    @Test
    public void testSearchByName() {

        // Perform a search by name
        googleSearchPage.searchField.click();
        googleSearchPage.inputFullName("John Wick");
        // Assert that the search field contains "John Wick"
        googleSearchPage.searchField.shouldHave(Condition.value("John Wick"));
        googleSearchPage.searchButton.click();
       // checking if entire page has text "John Wick"
        Selenide.$("html").shouldHave(Condition.matchText("John Wick"));

    }



    @Test
    public void testClickLogoEmptyResultsArea() {
        googleSearchPage.searchField.click();
        googleSearchPage.inputFullName("John Wick");
        googleSearchPage.searchButton.click();
        // Click on the Google logo in the upper left side
        googleSearchPage.logoIcon.click();
        // check if after clicking logo it goes to right page and the page title contains "Google"
        Selenide.title().contains("Google");

    }
}

