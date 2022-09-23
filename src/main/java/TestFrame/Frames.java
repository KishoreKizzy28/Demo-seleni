package TestFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\VM452YE\\eclipse-workspace\\java - selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		
		WebElement frames = driver.findElement(By.xpath("//input[@type='text'][1]"));
		frames.sendKeys("kishore");
		System.out.println(frames.getAttribute("value"));
		
		driver.switchTo().defaultContent();
		WebElement frames1 = driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']"));
		frames1.click();
		
		System.out.println(driver.getWindowHandle());
	}
}
