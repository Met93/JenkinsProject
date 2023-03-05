package pages;

import cydeo.Driver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AcceptButton {
    public AcceptButton(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

}
