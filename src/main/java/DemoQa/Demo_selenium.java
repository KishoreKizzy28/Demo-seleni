package DemoQa;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo_selenium {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\VM452YE\\eclipse-workspace\\java - selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/");
		
		driver.manage().window().maximize();
		
		WebElement Elements = driver.findElement(By.xpath("//div[@class='avatar mx-auto white'][1]"));
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",Elements);
		
		WebElement header = driver.findElement(By.xpath("//div[text()='Elements'][1]"));
		//header.isDisplayed();
		System.out.println(header.isDisplayed());
		System.out.println("Header is displayed");
		
		WebElement Textbox = driver.findElement(By.xpath("//span[@class='text'][1]"));
		Textbox.click();
		Thread.sleep(3000);
		
		WebElement Name = driver.findElement(By.xpath("//input[@placeholder='Full Name']"));
		Name.sendKeys("kishore");
		
		WebElement mail = driver.findElement(By.xpath("//input[@placeholder='name@example.com']"));
		mail.sendKeys("kishore@gmail.com");
		
		WebElement address = driver.findElement(By.xpath("//textarea[@placeholder='Current Address']"));
		address.sendKeys("hamilton");
		
		WebElement area = driver.findElement(By.xpath("//textarea[@id=\"permanentAddress\"]"));
		area.sendKeys("newzeland");
		
		WebElement submit = driver.findElement(By.xpath("//button[@id='submit']"));
		
		js.executeScript("arguments[0].click()",submit);
		Thread.sleep(3000);
		
		System.out.println(driver.findElement(By.xpath("//div[@id='output']/div")).getText());
		
		WebElement button = driver.findElement(By.xpath("//li[@id='item-4'][1]"));
		js.executeScript("arguments[0].click()",button);
		
		Thread.sleep(3000);
		
		
		WebElement Dbclick = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
		WebElement rcclick= driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
		
		Actions s = new Actions(driver);
		
		s.contextClick(rcclick).build().perform();
		s.doubleClick(Dbclick).build().perform();
		
		
		Thread.sleep(3000);
		
		WebElement frame=driver.findElement(By.xpath("//div[text()='Alerts, Frame & Windows']"));
		js.executeScript("arguments[0].click()",frame);
		
		WebElement Browserwindow = driver.findElement(By.xpath("//span[text()='Browser Windows']"));
		js.executeScript("arguments[0].click()",Browserwindow);
		
		//WebElement ntab= driver.findElement(By.xpath("//button[text()='New Tab']"));
		//js.executeScript("arguments[0].click()",ntab);
		
		WebElement menu = driver.findElement(By.xpath("//span[text()='Menu']"));
		js.executeScript("arguments[0].click()",menu);
		
		WebElement menu2 = driver.findElement(By.xpath("//a[text()='Main Item 2']"));
		s.moveToElement(menu2).build().perform();
	
		WebElement frames = driver.findElement(By.xpath("//span[text()='Frames']"));
		//frames.click();
		js.executeScript("arguments[0].click()",frames);
		Thread.sleep(3000);
		
	}

	}



