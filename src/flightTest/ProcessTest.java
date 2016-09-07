package flightTest;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import domain.*;
import process.SearchFlight;
import websiteAPI.ServicePage;



	public class ProcessTest {

	@Test
	public void Test() throws InterruptedException{
	//public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver.exe");
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--incognito");
	options.addArguments("start-maximized");
	DesiredCapabilities capabilities = DesiredCapabilities.chrome();
	capabilities.setCapability(ChromeOptions.CAPABILITY, options);
	//TestReader reader = new TestReader();
	//List<Object[]> test = reader.readFile("src/test/TestDataVueling",FileType.XLSX);
	/*
	//for(int i=0;i<test.size();i++){*/
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.vueling.com/es");
	
	driver.manage().window().maximize();

	
	DataFlight test1 = new DataFlight("Madrid", "Barcelona", 2, 2016, 5, 29);
			
	Passenger passenger1 = new Passenger("Guido", true, "Miranda","España","Barcelona","España +34", "666666666","s@s.com");
	//ContingencyPage contingency1 = new ContingencyPage("1 Maletas");
	DataPayment payment = new DataPayment("Compañia Corp", "1234567891234568", "1118", "999");
	SearchFlight process = new SearchFlight(driver, test1, passenger1, payment);
	
	//ServicePage sp = new SearchFlight(driver, test1, passenger1, payment);
	process.SearchFlight();
	
	
	
	driver.close();
	    
	}
	}


	 

