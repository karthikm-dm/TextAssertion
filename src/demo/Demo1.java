package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;  



public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		// TODO Auto-generated method stub
		driver.get("https://dotnetwebapp2.azurewebsites.net/");
		driver.manage().window().maximize();
		WebElement text=driver.findElement(By.xpath("//h1"));
		String Actual=text.getText();
		System.out.println(Actual);
		Thread.sleep(2000);
		String Expected="Welcome hari";
		Assert.assertEquals(Expected, Actual);
		System.out.println("Test Passed");
		Thread.sleep(1000);
		driver.close();
		
	}

}
