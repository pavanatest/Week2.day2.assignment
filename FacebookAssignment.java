package week2.day2;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Step 1: Download and set the path 
		WebDriverManager.chromedriver().setup();
		
		//step2: Launch the chromebrowser
		ChromeDriver driver = new ChromeDriver();
		
		//step 3: Load the URL https://en-gb.facebook.com/
		driver.get("https://en-gb.facebook.com/");
		
		//step 4: maximize the window
		
		driver.manage().window().maximize();
		
		//step 5:Add implicit wait .
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//step 6 :click on create New account button 
		
		driver.findElement(By.xpath("//a[@ajaxify='/reg/spotlight/']")).click();
		
		// step7: enter first name 
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Pavana");
		
		//step 8 : enter last name 
		
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("R");
		
		//step 9 : enter mobile number 
		
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("123456789");
		
		//step 10 : enter password 
		
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Happy123");
		
		//step 11: handle all the three drop down
		
		WebElement daydown = driver.findElement(By.xpath("//select[@id='day']"));
		Select s= new Select(daydown);
		s.selectByValue("23");
		
		WebElement Monthdown = driver.findElement(By.xpath("//select[@id='month']"));
		Select m = new Select (Monthdown);
		m.selectByVisibleText("Aug");
		
		WebElement yeardown =driver.findElement(By.xpath("//select[@id='year']"));
		Select y = new Select(yeardown);
		y.selectByIndex(32);
		
		//step 12:select the radio button "female"
		
		driver.findElement(By.xpath("//span[@class='_5k_2 _5dba']/input")).click();
		
		
				
		
		
		

		

	}

}
