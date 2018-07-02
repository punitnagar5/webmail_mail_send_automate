package webmail_mailsend.mail_through_webmail;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Open_new_message {
	WebDriver driver;
	WebDriverWait wait;
	
	public Open_new_message(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, 10);

	}
	public void click_new_message()
	{
	
		driver.findElement(By.id("zb__NEW_MENU_title")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
}
