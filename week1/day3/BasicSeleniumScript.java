package week1.day3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicSeleniumScript {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("http://leaftaps.com/opentaps");
	
	WebElement eleUsername = driver.findElementById("username");
	eleUsername.sendKeys("Demosalesmanager");
	driver.findElementById("password").sendKeys("crmsfa");
	driver.findElementByClassName("decorativeSubmit").click();
	
	driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.linkText("Create Lead")).click();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*driver.findElementByLinkText("CRM/SFA").click();
	driver.findElementByLinkText("Leads").click();
	driver.findElementByLinkText("Create Lead").click();
	
	driver.findElementById("createLeadForm_companyName").sendKeys("Trident");
	driver.findElementById("createLeadForm_firstName").sendKeys("Balaji");
	driver.findElementById("createLeadForm_lastName").sendKeys("C",Keys.ENTER);
	String title = driver.getTitle();
	System.out.println(title);*/
	
	driver.close();
}

}
