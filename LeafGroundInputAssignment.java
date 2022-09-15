package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundInputAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		
		driver.get("https://leafground.com/input.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//Enter name
		WebElement nameIP = driver.findElement(By.xpath("//div[@class='col-12']/input[@name='j_idt88:name']"));
		nameIP.sendKeys("pavana");
		
		
		//append Country 
		
		driver.findElement(By.xpath("//input[@value='Chennai']")).sendKeys("  India");
		
	    //verify if text box is disabled
		
		boolean enabled = driver.findElement(By.id("j_idt88:j_idt93")).isEnabled();
		System.out.println(" text box = " +enabled);
		
		
		//clear the typed text
		driver.findElement(By.name("j_idt88:j_idt95")).clear();
		
		//retrieve the typed text 
		
		String a = driver.findElement(By.name("j_idt88:j_idt97")).getAttribute("value");
		System.out.println("attribute fetched=" +a);
		Thread.sleep(3000);
		
		//email and tab
		
		String oTitle = driver.getTitle();
		System.out.println("old title =" +oTitle);
		
		driver.findElement(By.xpath("//input[@name='j_idt88:j_idt99']")).sendKeys("3456789123",Keys.TAB);
		Thread.sleep(3000);
		String ntitle = driver.getTitle();
		System.out.println("new title="+ntitle);
		
		if(oTitle.equals(ntitle))
		{
			System.out.println(" control doesnot move to next");
		}
		else
		{
			System.out.println("control moves to next");
		}
		
		
		//type about yourself
		
		WebElement textarea= driver.findElement(By.xpath("//textarea[@name='j_idt88:j_idt101']"));
		textarea.sendKeys("I am a developer");
		
		
		


	}

}
