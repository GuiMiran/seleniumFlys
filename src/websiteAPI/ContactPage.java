package websiteAPI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class ContactPage extends AbstractPage{
//
By Sr = By.xpath("//*[@id=\"ControlGroupMainContact_PassengerInputViewContactView_DropDownListTitle_0Div\"]/div/div/fieldset[1]/label");  
By Sra = By.xpath("//*[@id=\"ControlGroupMainContact_PassengerInputViewContactView_DropDownListTitle_0Div\"]/div/div/fieldset[2]/label");
By Name = By.id("ControlGroupMainContact_PassengerInputViewContactView_TextBoxFirstName_0");
           //*[@id="ControlGroupMainContact_PassengerInputViewContactView_TextBoxFirstName_0"]
By SurName = By.id("ControlGroupMainContact_PassengerInputViewContactView_TextBoxLastName_0");
By Sr1 = By.name("ControlGroupMainContact$PassengerInputViewContactView$DropDownListTitle_1");
By Name1 = By.name("ControlGroupMainContact$PassengerInputViewContactView$TextBoxFirstName_1");
By Surname1 = By.name("ControlGroupMainContact$PassengerInputViewContactView$TextBoxLastName_1");
By Country = By.id("ControlGroupMainContact_ControlGroupContactControls_ContactInputView_DropDownListCountry");
By City = By.id("ControlGroupMainContact_ControlGroupContactControls_ContactInputView_TextBoxCity");
By Prefix = By.id("ControlGroupMainContact_ControlGroupContactControls_ContactInputView_DropDownListPrefix");
By Telephone = By.id("ControlGroupMainContact_ControlGroupContactControls_ContactInputView_TextBoxHomePhone");
By Email = By.id("ControlGroupMainContact_ControlGroupContactControls_ContactInputView_TextBoxEmailAddress");
By Condition = By.cssSelector("#contactArticle > div > div.sectionSolid.padding15.bc_greyUltraSoft.marginRight20.marginBottom40.clearfix > div > div.column_10.column_12-xs.sectionTable_cell.txtAlignMiddle > div > fieldset");
By ContactSubmit = By.cssSelector("#ControlGroupMainContact_LinkButtonSubmit");


public ContactPage(WebDriver driver){
this.driver = driver;
}

public void passengerInfo(boolean IsMan){
if(IsMan)
click(Sr);
else
click(Sra);
}

public void clickSenor(){
click(Sr);
}

public void clickSenora(){
click(Sra);
}

public void nameSendKeys(String name){
sendKeys(Name, name);
}

public void SurnameSendKeys(String surname){
sendKeys(SurName, surname);
}

public void countrySendKeys(String pais){
Select s=new Select(driver.findElement(By.name("ControlGroupMainContact$ControlGroupContactControls$ContactInputView$DropDownListCountry")));
   s.selectByVisibleText("España");
}

public void cityOfCountry(String city){
sendKeys(City, city);
}

public void prefixCountry(String prefix){
Select s1=new Select(driver.findElement(By.name("ControlGroupMainContact_ControlGroupContactControls_ContactInputView_DropDownListPrefix")));
   s1.selectByValue("+34");
}

public void telefonoPais(String telephone){
sendKeys(Telephone, telephone);
}

public void emailpasajero(String email){
    sendKeys(Email, email);
    }
 
    public void clickCondition(){
click(Condition);
    }

    public ServicePage contactSubmit() {
click(ContactSubmit);
return new ServicePage(driver);
}
    
    }

