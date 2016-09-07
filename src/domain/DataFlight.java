package domain;

import websiteAPI.AbstractPage;

public class DataFlight extends AbstractPage{
String origen;
String destination;
int numberOfPassenger;
int year;
int month;
int day;
    
    
public DataFlight(String origen, String destination, int numberOfPassenger, int year, int month, int day){
this.origen = origen;
this.destination = destination;
this.numberOfPassenger = numberOfPassenger;
this.day = day;
this.month = month;
this.year = year;
   
}
public int getYear() {
return year;
}


public void setYear(int year) {
this.year = year;
}


public int getMonth() {
return month;
}


public void setMonth(int month) {
this.month = month;
}


public int getDay() {
return day;
}


public void setDia(int dia) {
this.day = dia;
}


public void setNumberOfPassenger(int numberOfPassenger) {
this.numberOfPassenger = numberOfPassenger;
}

public String getOrigen() {
return origen;
}
public void setOrigen(String origen) {
this.origen = origen;
}
public String getDestination() {
return destination;
}
public void setDestination(String destination) {
this.destination = destination;
}
public int getNumberOfPassenger() {
return numberOfPassenger;
}
}

