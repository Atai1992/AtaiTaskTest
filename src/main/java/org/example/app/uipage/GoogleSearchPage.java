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
    public SelenideElement searchResult=$(By.xpath("//*[@id=\"rcnt\"]/div[2]/div/div/div[3]/div[1]/div/div[2]/div/div/div/div[1]/span"));

    public GoogleSearchPage inputFullName(String str){
        elementActions.input(searchField,str);
        return this;
}


}
