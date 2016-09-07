package websiteAPI;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class AbstractPage {
protected WebDriver driver;
protected void click(By element){
driver.findElement(element).click();
}
protected void click(WebElement element){
element.click();
}
protected void sendKeys(By element, String text){
driver.findElement(element).sendKeys(text);
Actions a=new Actions(driver);
a.sendKeys(Keys.DOWN);
a.build().perform();
   try {
	Thread.sleep(1000);
	a.sendKeys(Keys.ENTER).build().perform();
	} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	} 
	         
	         
	}
	protected void sendKeys(WebElement element, String text){
	element.sendKeys(text);
	}
	}



