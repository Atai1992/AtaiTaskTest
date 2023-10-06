package app.ui;

import com.codeborne.selenide.*;
import org.example.app.uipage.GoogleSearchPage;
import org.testng.annotations.BeforeClass;


import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

public class BaseUiTest {
    public GoogleSearchPage googleSearchPage= new GoogleSearchPage();



    @BeforeClass
    public void setUp() {
        open("https://www.google.ru/");
    }

    @BeforeClass
    public void setUpBrowser(){
        Configuration.holdBrowserOpen=false;
        Configuration.browserSize="1920x1080";
        googleSearchPage= new GoogleSearchPage();
    }
}






