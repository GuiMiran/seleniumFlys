package websiteAPI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SchedulePage extends AbstractPage{
By submitButton = By.xpath("//*[@id=\"scheduleSelectSubmitButton\"]"); 
public SchedulePage(WebDriver driver){
this.driver = driver;
}

public void selectFirstFlight(){
int position = 1;
boolean exit = false;
do{
try{
By basic = By.cssSelector("#ControlGroupScheduleSelectView_AvailabilityInputScheduleSelectView_RadioButtonMkt1Fare"+position);
if(!driver.findElement(basic).isEnabled())
position += 3;
else{
click(basic);
exit = true;
}
}catch(Exception e){
exit = true;
}
}while(!exit);
try {
Thread.sleep(2000);
} catch (InterruptedException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}

} 
public void selectSecondFlight(){
int position = 1;
boolean exit = false;
do{
try{
By basic = By.cssSelector("#ControlGroupScheduleSelectView_AvailabilityInputScheduleSelectView_RadioButtonMkt2Fare"+position);
if(!driver.findElement(basic).isEnabled())
position += 3;
else{
click(basic);
exit = true;
}
}catch(Exception e){
exit = true;
}
}while(!exit);
try {
Thread.sleep(2000);
} catch (InterruptedException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}

}

public ContactPage submitButton() {
click(submitButton);
return new ContactPage(driver);
}
public void selectFirstFlightOptima(){
int position = 2;
boolean exit = false;
do{
try{
By optima = By.cssSelector("#ControlGroupScheduleSelectView_AvailabilityInputScheduleSelectView_RadioButtonMkt1Fare"+position);
if(!driver.findElement(optima).isEnabled())
position += 3;
else{
click(optima);
exit = true;
}
}catch(Exception e){
exit = true;
}
}while(!exit);
try {
Thread.sleep(3000);
} catch (InterruptedException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
}
public void selectSecondFlightOptima(){
int position = 2;
boolean exit = false;
do{
try{
By optima = By.cssSelector("#ControlGroupScheduleSelectView_AvailabilityInputScheduleSelectView_RadioButtonMkt2Fare"+position);
if(!driver.findElement(optima).isEnabled())
position += 3;
else{
click(optima);
exit = true;
}
}catch(Exception e){
exit = true;
}
}while(!exit);
try {
Thread.sleep(2000);
} catch (InterruptedException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
}
public void selectFirstFlightExcellence(){
int position = 3;
boolean exit = false;
do{
try{
By excellence = By.cssSelector("#ControlGroupScheduleSelectView_AvailabilityInputScheduleSelectView_RadioButtonMkt1Fare"+position);
if(!driver.findElement(excellence).isEnabled())
position += 3;
else{
click(excellence);
exit = true;
}
}catch(Exception e){
exit = true;
}
}while(!exit);
try {
Thread.sleep(2000);
} catch (InterruptedException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
}
public void selectSecondFlightExcellence(){
int position = 3;
boolean exit = false;
do{
try{
By excellence = By.cssSelector("#ControlGroupScheduleSelectView_AvailabilityInputScheduleSelectView_RadioButtonMkt2Fare"+position);
if(!driver.findElement(excellence).isEnabled())
position += 3;
else{
click(excellence);
exit = true;
}
}catch(Exception e){
exit = true;
}
}while(!exit);
try {
Thread.sleep(2000);
} catch (InterruptedException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
}
}
