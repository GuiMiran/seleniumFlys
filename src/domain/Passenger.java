
package domain;

import websiteAPI.AbstractPage;

public class Passenger extends AbstractPage{
String name;
boolean Isman;
String surname;
String country;
String city;
String prefix;
String telephone;
String email;


public Passenger(String name, boolean isman,String surname,String country, String city, String prefix, String telephone, String email){
this.name = name;
this.Isman = isman;
this.surname = surname;
this.country = country;
this.city = city;
this.prefix = prefix;
this.telephone = telephone;
this.email = email;
       
        
}


public String getEmail() {
return email;
}


public void setEmail(String email) {
this.email = email;
}


public String getTelephone() {
return telephone;
}


public void setTelefono(String telephone) {
this.telephone = telephone;
}


public String getPrefix() {
return prefix;
}


public void setPrefix(String prefix) {
this.prefix = prefix;
}


public String getCity() {
return city;
}


public void setCity(String city) {
this.city = city;
}


public String getCountry() {
return country;
}


public void setCountry(String country) {
this.country = country;
}




public boolean Isman() {
	return Isman;
}


public void setIsman(boolean isman) {
	Isman = isman;
}


public void setNombre(String name) {
this.name = name;
}

public String getSurname() {
return surname;
}

public void setSurname(String surname) {
this.surname = surname;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


}




