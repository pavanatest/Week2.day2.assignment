package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
public class LeafGroundLink {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		
		driver.get("https://leafground.com/link.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//Take me to dashboard
		
		driver.findElement(By.xpath("//a[text()='Go to Dashboard']")).click();
		Thread.sleep(5000);
		driver.navigate().back();
		
		//Total
		int size=driver.findElements(By.tagName("a")).size();
		System.out.println("total"+size);
		
		

	}

}
