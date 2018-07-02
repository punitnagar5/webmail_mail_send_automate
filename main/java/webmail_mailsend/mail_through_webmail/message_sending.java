package webmail_mailsend.mail_through_webmail;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class message_sending {
	WebDriver driver;
	WebDriverWait wait;

	public message_sending(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, 10);

	}

	public void send_a_message() throws InterruptedException {
		WebElement To_send = driver.findElement(By.cssSelector("input[aria-label='To address']"));
		Thread.sleep(2000);
		To_send.sendKeys("tanujkumarvishnoi@qainfotech.com");
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement subject = driver.findElement(By.xpath("//*[@id=\"zv__COMPOSE-1_subject_control\"]"));
		subject.sendKeys("Regarding whole day summary");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	}
	
	public void Type_message()
	{
		driver.switchTo().frame("ZmHtmlEditor1_body_ifr");
		System.out.println("we are switching to the frame of body");
		driver.findElement(By.cssSelector("#tinymce")).sendKeys("sir i have made the send mail automation system and this mail is send through automation");
		driver.switchTo().defaultContent();
	}
	public void click_send_message()
	{
		driver.findElement(By.cssSelector("#zb__COMPOSE-1__SEND_title")).click();
		
		
	}
}