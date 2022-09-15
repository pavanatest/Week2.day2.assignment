package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		 
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		
		//1.Launch the browser
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//2.Enter the username
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoCSR");
		//3.Enter the password
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		//4	Click Login
		
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		// 5.Click crm/sfa link
		
		
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		
		// 6	Click Leads link
		
		driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
		
		// 7	Click Find leads button
		driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]")).click();
		
		
		//8	Click on Phone
		
		driver.findElement(By.xpath("//span[@class='x-tab-strip-inner']/span[text()='Phone']")).click();
		
		//9	Enter phone number
		
		driver.findElement(By.xpath("//input[@id='ext-gen270']")).sendKeys("7418529630");
		
		//10	Click find leads button
		
		driver.findElement(By.xpath("//td[@class='x-btn-center']//button[text()='Find Leads']")).click();
		Thread.sleep(3000);
		
		//11	Capture lead ID of First Resulting lead
		

		
	  WebElement firstResult = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
	  Thread.sleep(3000);
	  String textf = firstResult.getText();
	  System.out.println("record="+ textf);
	  
	  //12	Click First Resulting lead
		
		firstResult.click();
		
		
		//13	Click Delete
		
		driver.findElement(By.xpath("//a[@class='subMenuButtonDangerous']")).click();
		//14	Click Find leads
		driver.findElement(By.xpath("//ul[@class='shortcuts']//a[textf()='Find Leads']")).click();
	//15. enter cap lead id 
		
		driver.findElement(By.xpath("//div[@class='x-form-element']/input[@name='id']")).sendKeys(textf);
	//16. click find  find leads button
		
		
		
		driver.findElement(By.xpath("//td[@class='x-btn-center']//button[textf()='find Leads']")).click();
		
		//17	Verify message "No records to display" in the Lead List. This message confirms the successful deletion

		WebElement vermsg=driver.findElement(By.xpath("//div[textf()='no record to display']"));
		String ver=vermsg.getText();
		System.out.println("verify Message" +ver);
		
		if(ver.equals("no records to sisplay"))
		{
			System.out.println(" successful deletion");
		}
		else
		{
			System.out.println(" not deleted");
		}
		//18	Close the browser (Do not log out)


	}

}
