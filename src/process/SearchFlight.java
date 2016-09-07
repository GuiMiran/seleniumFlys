package process;

import java.util.ArrayList;

import org.apache.commons.logging.Log;
import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import com.thoughtworks.selenium.webdriven.commands.Submit;

import domain.DataFlight;
import domain.Passenger;
import websiteAPI.*;
import domain.DataPayment;

public class SearchFlight{
WebDriver driver;
DataFlight data;
Passenger passenger;
DataPayment payment;
    
public SearchFlight(WebDriver driver, DataFlight data, Passenger passenger, DataPayment payment){
this.driver = driver;
this.data = data;
this.passenger = passenger;
this.payment = payment;
}
public void SearchFlight() throws InterruptedException{
SchedulePage selectPage = introduceData();
ContactPage contactPage = elegirVuelo(selectPage);

pasajeroInfo(contactPage);
System.out.println("out function passejero");
ServicePage service = new  ServicePage(driver);
ServicePage servicePage = PaginaPago(service);
PaymentPage dataPayment = new  PaymentPage(driver);
PaymentPage paymentPage = FinalPage(dataPayment);
   
}   


private ServicePage service() {
// TODO Auto-generated method stub
return null;
}

private SchedulePage introduceData() {
HomePage home = new HomePage(driver);
//home.clickIdaYvueltaButton();
home.origenSendKeys(data.getOrigen());
home.destinoSendKeys(data.getDestination());
home.calendarioClick();
home.noOfpassengerClick(data.getNumberOfPassenger());
return home.clickBuscarVuelo();
}
private ContactPage elegirVuelo(SchedulePage selectPage){
selectPage.selectFirstFlight();
selectPage.selectSecondFlight();

return selectPage.submitButton();

}
    
  public void pasajeroInfo(ContactPage contact)
  {
	  System.out.println("in function passenger info");
	  
    if(passenger.Isman())
    {
    	System.out.println("in function IsMan");
    	contact.clickSenor();
    }
    else
    {contact.clickSenora();}
        
        contact.nameSendKeys(passenger.getName());
        contact.SurnameSendKeys(passenger.getSurname());
        contact.countrySendKeys(passenger.getCountry());   
        contact.cityOfCountry(passenger.getCity()); 
        contact.prefixCountry(passenger.getPrefix());
        contact.telefonoPais(passenger.getTelephone());
        contact.emailpasajero(passenger.getEmail());
        contact.clickCondition();
        contact.contactSubmit();
             
    }

 private ServicePage PaginaPago(ServicePage service) throws InterruptedException{
	 System.out.println("en ServicePage service PAGINAPAgo /"+ Log.class.getName().toString());
	 
      service.clickNoAsiento();
      System.out.println("after clicknoasiento");
     // service.SelectSeat();
     // service.clickMaleta();
     // service.añadirMaleta(contingencyPage.getAñadirMaleta());
      service.clickSinseguro();
           service.clickserviceButton();
           return service;
    }
           
   

    public PaymentPage FinalPage(PaymentPage dataPayment) throws InterruptedException{

    dataPayment.tipoDeTarjeta();
//datospago.tipoDeTarjeta(pago.getTarjeta());
    Thread.sleep(1000);
    dataPayment.titularDeTarjeta(payment.getTitle());
    dataPayment.numeroDeTarjeta(payment.getCardNumber());
    dataPayment.fechaDeCaducidad(payment.getexpiryDate());
    dataPayment.cvvNumero(payment.getCvv());
    dataPayment.paymentButton();
    Thread.sleep(5000);
    return dataPayment;
    }
         
    }
