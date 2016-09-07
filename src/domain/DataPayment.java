package domain;

import websiteAPI.AbstractPage;

public class DataPayment extends AbstractPage{

String title;
String cardNumber;
String expiryDate;
String cvv;


public DataPayment(String title, String cardNumber, String expiryDate, String cvv){
this.title = title;
this.cardNumber = cardNumber;
this.expiryDate = expiryDate;
this.cvv = cvv;
}


public String getTitle() {
return title;
}

public void setTitle(String title) {
this.title = title;
}

public String getCardNumber() {
return cardNumber;
}

public void setNumeroDeTarjeta(String cardNumber) {
this.cardNumber = cardNumber;
}

public String getexpiryDate() {
return expiryDate;
}


public void setExpiryDate(String expiryDate) {
this.expiryDate = expiryDate;
}


public String getCvv() {
return cvv;
}


public void setCvv(String cvv) {
this.cvv = cvv;
}

}
