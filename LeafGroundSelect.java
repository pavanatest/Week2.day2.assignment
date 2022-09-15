package week2.day2;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundSelect {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		
		driver.get("https://leafground.com/select.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

//favorite UI
		WebElement Tool= driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
		Select auto=new Select(Tool);
		auto.selectByVisibleText("Selenium");
//country
		
		driver.findElement(By.xpath("//label[@id='j_idt87:country_label']")).click();
		driver.findElement(By.xpath("//ul[@id='j_idt87:country_items']/li[text()='India']")).click();
		
		//course
		
		WebElement course= driver.findElement(By.xpath("//span[@class='ui-button-icon-primary ui-icon ui-icon-triangle-1-s']"));
		course.click();
		driver.findElement(By.xpath("//span[@id='j_idt87:auto-complete_panel']//li[text()='PostMan']")).click();
      //language
		
		driver.findElement(By.xpath("//div[@id='j_idt87:lang']/label[@id='j_idt87:lang_label']")).click();
		driver.findElement(By.xpath("//ul[@id='j_idt87:lang_items']/li[text()='English']")).click();
		
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[text()='Select Values']")).click();
		driver.findElement(By.xpath("//ul[@id='j_idt87:value_items']/li[@id='j_idt87:value_1']")).click();
	}

}
