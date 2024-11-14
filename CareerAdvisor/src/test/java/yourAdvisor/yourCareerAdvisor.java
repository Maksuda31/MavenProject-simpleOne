package yourAdvisor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class yourCareerAdvisor {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		//opening the page
		driver.get("https://ezway2connect.com/career-advisor/");
		System.out.println(driver.getTitle());
		//booking an appointment
		driver.findElement(By.linkText("Book Now")).click();
		Thread.sleep(400);
		driver.findElement(By.xpath("//div[@class=\"c-day-content\"]/div[contains(text(),'27')]")).click();
		Thread.sleep(400);
		driver.findElement(By.xpath("//div[@id='am-appointment-times0']/div/div/label[8]/span")).click();
		driver.findElement(By.xpath("//button[@id='am-continue-button']/span")).click();
		Thread.sleep(400);
		
		//payment page
		driver.findElement(By.xpath("//input[@name='given-name']")).sendKeys("Maksuda");
		driver.findElement(By.xpath("//input[@name='family-name']")).sendKeys("Akter");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Akter@html.com");
		
		driver.findElement(By.xpath("//input[@name='tel']")).sendKeys("4109294423");
		WebElement e= driver.findElement(By.xpath("//*[contains(text(), 'Please enter a valid phone number')]"));
		System.out.println(e.getText());
		Thread.sleep(400);
	//	driver.findElement(By.xpath("//input[@name='cardnumber']")).sendKeys("1234456231");
		driver.findElement(By.xpath("//div[@id='am-confirm-booking']/div[1]/div[3]/div[3]/span")).click();
		driver.get("https://ezway2connect.com/rokshana-yeasmin/");
		driver.findElement(By.linkText("LinkedIn")).click();
			
		
	}

}
