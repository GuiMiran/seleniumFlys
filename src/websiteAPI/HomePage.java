package websiteAPI;

import java.util.List;

import javax.swing.plaf.synth.SynthSeparatorUI;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomePage extends AbstractPage{
By idaYvuelta = By.id("AvailabilitySearchInputXmlSearchView_RoundTrip");
By origen = By.name("AvailabilitySearchInputXmlSearchView$TextBoxMarketOrigin1");
By destino = By.name("AvailabilitySearchInputXmlSearchView$TextBoxMarketDestination1");
By buscarVuelo = By.id("AvailabilitySearchInputXmlSearchView_btnClickToSearchNormal");
By buscadorIda = By.id("vuelo_ida");
//fecha de vuelta cambiar por parametros relativos 
							
By fechaVuelta = By.cssSelector("#datePickerContainer > div.ui-datepicker-group.ui-datepicker-group-first > table > tbody > tr:nth-child(3) > td:nth-child(5)");
//By fechaVuelta = By.cssSelector("#datePickerContainer > div.ui-datepicker-group.ui-datepicker-group-last > table > tbody > tr:nth-child(1) > td:nth-child(5) > a");
                            
By fechaIda = By.cssSelector("#datePickerContainer > div.ui-datepicker-group.ui-datepicker-group-last > table > tbody > tr:nth-child(5) > td:nth-child(6)");

public HomePage(WebDriver driver)
{
	this.driver = driver;
}


public void clickIdaYvueltaButton()
{
	click(idaYvuelta);
}

public void origenSendKeys(String origenInput)
{
	sendKeys(origen, origenInput);
}
public void destinoSendKeys(String destinoInput)
{
	sendKeys(destino, destinoInput);
}


/*
 * los parametros de fecha ida y vuelta estaban invertidos, falta parametrizar la fecha de vuelta
 * los sleepe funcionana correctamente
 * */
public void calendarioClick()
{
	Actions a =new Actions(driver);
	a.sendKeys(Keys.DOWN).build().perform();
	try {
		Thread.sleep(2000);
		} 
	catch (InterruptedException e) 
		{
		e.printStackTrace();
		} 
	a.sendKeys(Keys.ENTER).build().perform();
	try{
	   Thread.sleep(5000);
	   
	   System.out.println(fechaVuelta);
	   
	   click(fechaVuelta);
	   
	   Thread.sleep(5000);
	      
	   System.out.println(fechaIda);   
	
	   click(fechaIda);
	
	   Thread.sleep(3000);
	
	   
		//HECHO! 
		//REPAIR THIS ISSUE
		//click(fechaVuelta);
		////System.out.println(click().toString());    
		//Thread.sleep(5000);
	    
		} 
	catch (InterruptedException e) 
		{
		// TODO Auto-generated catch block
		e.printStackTrace();
		} 
	a.sendKeys(Keys.ENTER).build().perform();
    
}

public void noOfpassengerClick(int number){
click(By.id("DropDownListPassengerType_ADT_1"));
}
public SchedulePage clickBuscarVuelo(){
if(driver.findElement(buscarVuelo).isEnabled()){
click(buscarVuelo);
return new SchedulePage(driver);
}
else{
return null;
}
}
}