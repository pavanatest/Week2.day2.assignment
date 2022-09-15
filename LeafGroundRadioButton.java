package week2.day2;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundRadioButton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		
		driver.get("https://leafground.com/radio.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		// your most favorite browser
		driver.findElement(By.xpath("//table[@id='j_idt87:console1']//div")).click();
		
		// unselectableElem
		
		WebElement c1 = driver.findElement(By.xpath("//label[text()='Bengaluru']"));
		c1.click();
		Thread.sleep(3000);
		
		WebElement c2=driver.findElement(By.xpath("//label[text()='Bengaluru']"));
		c2.click();
		Thread.sleep(2000);
		boolean unselecte2= c2.isSelected();
		if(unselecte2)
		{
			System.out.println("after second click, it is selected");
		}
		else
		{
			System.out.println("element not selected");
		}
		
		
		//Default select 
		
		boolean defaultRadio= driver.findElement(By.xpath("table[@id='j_idt87:console2']//input[@id='j_idt87:console2:2']")).isSelected();
		System.out.println(defaultRadio);
		if(defaultRadio)
		{
			System.out.println("safari is the default browser");
			
		}
		else
			
		{
			System.out.println("safari is not defualt browser");
		}
		
		
		//age group 
		
		WebElement ageel=driver.findElement(By.xpath("//div[@class='ui-radiobutton ui-widget']//input[@id='j_idt87:age:1']"));
		boolean agee = ageel.isSelected();
		System.out.println(agee);
		if(agee)
		{
			System.out.println("age group 21-40 is default ");
		}
		
		else
		{
			System.out.println("age group 21-40 is not deafult");
		}
	}

}
