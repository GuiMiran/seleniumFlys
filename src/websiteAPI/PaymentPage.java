package websiteAPI;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

	
	
	public class PaymentPage extends AbstractPage{
	  By Tarjeta = By.name("CONTROLGROUPPAYMENTBOTTOM$ControlGroupPaymentInputViewPaymentView$paymentMethodSelectCombobox");
	  By Titular = By.name("CONTROLGROUPPAYMENTBOTTOM$ControlGroupPaymentInputViewPaymentView$TextBoxCC::AccountHolderName");
	  By NumeroDeTarjeta = By.name("CONTROLGROUPPAYMENTBOTTOM$ControlGroupPaymentInputViewPaymentView$TextBoxACCTNO");
	  By FechaDecaducidad = By.name("CONTROLGROUPPAYMENTBOTTOM$ControlGroupPaymentInputViewPaymentView$TextBoxEXPDAT_MONTH_YEAR");
	  By Cvv = By.name("CONTROLGROUPPAYMENTBOTTOM$ControlGroupPaymentInputViewPaymentView$TextBoxCC::VerificationCode");
	  By Payment = By.xpath("//*[@id=\"CONTROLGROUPPAYMENTBOTTOM_ControlGroupPaymentInputViewPaymentView_LinkButtonSubmit\"]");
	  
	public PaymentPage(WebDriver driver){
	        this.driver = driver;
	}
	public void tipoDeTarjeta() throws InterruptedException{
	Actions a =new Actions(driver);
	a .sendKeys(Keys.DOWN).build().perform();
	Thread.sleep(1000);

	a.sendKeys(Keys.ENTER).build().perform();
	click(Tarjeta);

	}
	/*public void tipoDeTarjeta(String tarjeta){
	sendKeys(Tarjeta, tarjeta);
	}*/
	public void titularDeTarjeta(String titular){
	sendKeys(Titular, titular);
	}
	public void numeroDeTarjeta(String numeroDeTarjeta) {
	sendKeys(NumeroDeTarjeta, numeroDeTarjeta);
	}
	public void fechaDeCaducidad(String fechaDecaducidad){
	sendKeys(FechaDecaducidad, fechaDecaducidad);
	}
	     public void cvvNumero(String cvv){
	    sendKeys(Cvv, cvv);
	   
	     }  
	    public void paymentButton(){
	    click(Payment);

	    }
	     }



