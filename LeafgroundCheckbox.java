package week2.day2;

	import java.time.Duration;

	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;

	import io.github.bonigarcia.wdm.WebDriverManager;
	public class LeafgroundCheckbox {

		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();
			
			
			driver.get("https://leafground.com/checkbox.xhtml");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
			//Basic Checkbox
			driver.findElement(By.xpath("//div[@id='j_idt87:j_idt89']")).click();
			//ajax
			driver.findElement(By.xpath("//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default']")).click();
			//verify
			boolean enabled = driver.findElement(By.xpath("//span[@class='ui-chkbox-icon ui-icon ui-icon-blank ui-c']/parent::div[@class='ui-ckbox-box ui-widget ui-corner-all ui-state-default ui-state-disabled ui-state-disabled']")).isEnabled();
			System.out.println("checkout="+enabled);

	}

}
