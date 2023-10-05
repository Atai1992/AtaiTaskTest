package org.example.app.uipage.element_helper;

import com.codeborne.selenide.SelenideElement;



public class WebElementActions {
    public WebElementActions input(SelenideElement element,String txt){
        element.setValue(txt);
        return this;
    }


}
