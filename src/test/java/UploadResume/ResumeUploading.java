package UploadResume;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ResumeUploading {
	WebDriver driver;
	
	@BeforeMethod
	public void launchUrl() {
		
		driver = new ChromeDriver();
		driver.get("https://www.naukri.com/nlogin/login");
		
		
	}
	
	@Test
	public void login() throws InterruptedException {
		driver.findElement(By.id("usernameField")).sendKeys("supriya.bmm43@gmail.com");
		driver.findElement(By.id("passwordField")).sendKeys("Suppu1234");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		// System.out.println("Successful");
		//System.out.println("testing jenkins");
		//System.out.println("checking");
		//System.out.println("build checking pass/fail");
	}
	
}
