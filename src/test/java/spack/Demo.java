package spack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo {

	public static void main(String[] args) {
		 ChromeDriver driver = new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 driver.get("https://www.facebook.com/reg/");
		 
		 WebElement firstNameField = driver.findElement(By.name("firstname"));
		 firstNameField.click();
		 firstNameField.sendKeys("Haripriya");
		 
		 WebElement surNameField = driver.findElement(By.name("lastname"));
		 surNameField.click();
		 surNameField.sendKeys("vayalpati");
		 
		 WebElement mobileOrEmailField = driver.findElement(By.name("reg_email__"));
		 mobileOrEmailField.click();
		 mobileOrEmailField.sendKeys("vayalpati.priyareddy5@gmail.com");
		 
		 WebElement reenterEmailField = driver.findElement(By.name("reg_email_confirmation__"));
		 reenterEmailField.click();
		 reenterEmailField.sendKeys("vayalpati.priyareddy5@gmail.com");
		 
		 WebElement newPasswordField = driver.findElement(By.name("reg_passwd__"));
		 newPasswordField.click();
		 newPasswordField.sendKeys("Gautham@8324");
		 
	    Select date =new Select(driver.findElement(By.id("day")));
	    date.selectByVisibleText("23");
	    
	    Select month=new Select(driver.findElement(By.id("month")));
	    month.selectByVisibleText("Oct");
	    
	    Select year=new Select(driver.findElement(By.id("year")));
	    year.selectByVisibleText("1986");
	    
	    WebElement genderField = driver.findElement(By.xpath("//input[@name='sex'][@value='1']"));
	    genderField.click();
	    
	   WebElement signupField = driver.findElement(By.name("websubmit"));
	   signupField.click();	    
	  
	    
	   
		 
		    
	}

}