package SeleniumWebDriverCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class browserCommands {

	public static void main(String[] args) {
		//selenium  java in telugu part-26
		ChromeDriver driver = new ChromeDriver(); //for opening Google chrome
		FirefoxDriver driver1 = new FirefoxDriver(); //for opening firefox
		
		//selenium java in telugu part-27
		driver.manage().window().maximize(); //to maximize the open window
		driver.get("https://tutorialsninja.com/demo/"); //used to open specified URL webpage
		driver1.manage().window().minimize(); //to minimize the open window
		
		
		//core java in telugu part-28
		 driver.findElement(By.name("search")).click();  //to find element in any value like name,class,id,css selector etc
		 //used to perform click elements on different UI elements
 
		 //sendKeys() is used to enter text into text fields like text box,text area,password fields etc
		 driver.findElement(By.name("search")).sendKeys("HP");
		 
		                           //or
		 WebElement searchBoxField = driver.findElement(By.name("search"));
		 searchBoxField.click();
		 searchBoxField.sendKeys("HP");
		 
		 //isDisplayed is used to find whether the element is displayed on the page before performing operations on it
		 
		 

			//core java in telugu part-29 continuation of click,id and send keys
		 
		//core java in telugu part-28
		 /*clear() used to clear the text available in the text box or text area fields.
		   getText() used to retrieve the elements text(i.e., the text between the starting and ending tags of HTML elements)
		   getTitle() used to retrieve the title of the current web page we can directly use driver.gettitle() without using webelement.
		   getURL() used to retrieve the URL of the current web page we can directly use driver.getURL() without using webelement.*/
		 
		 
		 
		 
	}

}
