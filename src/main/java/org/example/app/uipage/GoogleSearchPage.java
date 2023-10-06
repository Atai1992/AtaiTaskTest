package org.example.app.uipage;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class GoogleSearchPage extends BasePage {
    public SelenideElement searchField = $(byId("APjFqb"));
    public SelenideElement searchButton=$(byXpath("//input[@class='gNO89b']"));
    public SelenideElement logoIcon=$(By.xpath("//*[@id='logo']"));

    public GoogleSearchPage inputFullName(String str){
        elementActions.input(searchField,str);
        return this;
}


}
