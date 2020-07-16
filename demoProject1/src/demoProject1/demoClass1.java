package demoProject1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoClass1 {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Tanmay\\Desktop\\Eclipse prac\\DriverFolder\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		//System.out.println(driver.getTitle());
		//System.out.println(driver.getCurrentUrl());
		//driver.get("http://yahoo.com");
		//driver.navigate().back(); 
		
		WebElement username=driver.findElement(By.name("q"));
		username.sendKeys("tcs noida");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		
		driver.findElement(By.name("btnk")).click();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.quit();
	//Add two numbers	
	/*	int a=5;
		int b=6;
		int sum;
		sum=a+b;
		System.out.println("sum is "+sum);*/
		
		
	//Reuseable Method
	//	ReuseableMethod m=new ReuseableMethod();
	//	m.validateHeader();
		
		
	}

}
