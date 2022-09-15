package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;


public class LeafGroundButton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		
		driver.get("https://leafground.com/button.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//Verify title
		
		String oTitle = driver.getTitle();
		System.out.println(oTitle);
		
		//click button 
		
		driver.findElement(By.xpath("//button[@id='j_idt88:j_idt90']")).click();
		String NewTitle = driver.getTitle();
		System.out.println(NewTitle);
		
		if(oTitle.equals(NewTitle))
		{
			System.out.println("Title is not changed");
			
		}
		else
		{
			System.out.println("title s changed");
		}
driver.navigate().back();

//to check button is disabled

boolean buttonEn = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt92']")).isEnabled();
System.out.println("button" +buttonEn);


//find the position of submit 

Point location = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt94']")).getLocation();
int x = location.getX();
int y = location .getY();
System.out.println(" the x position is "+ x);
System.out.println("the y postion is "+ y);

//to find the colour

String colourButton = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt96']")).getCssValue("colour");
System.out.println("colour"+ colourButton);

	//Height of button 

Dimension  size= driver.findElement(By.xpath("//button[@id='j_idt88:j_idt98']")).getSize();
int height= size.getHeight();
int width= size.getWidth();
System.out.println(" heightis "+ height);
System.out.println("width is "+ width);

//Mouse Move over 

WebElement Mouseover = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt100']"));
String valbMouse = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt100']")).getCssValue("background-color");
System.out.println("the value before="+valbMouse);

Actions action= new Actions(driver);
action.moveToElement(Mouseover).build().perform();
Thread.sleep(5000);
WebElement AMouseOver = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt100']/span"));
String valamouse= AMouseOver.getCssValue("background-color");
System.out.println("the value after " +valamouse);


if (valbMouse.equals(valamouse))
	
{
	System.out.println("failed");
	
}
else
{
	System.out.println("success");
	
}
driver.findElement(By.xpath("//button[@id='j_idt88:j_idt102:imageBtn']")).click();
driver.findElement(By.xpath("//img[@id='j_idt88:j_idt102:j_idt104']")).click();

		
		
}
	}


