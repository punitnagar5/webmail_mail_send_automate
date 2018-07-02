package webmail_mailsend.mail_through_webmail;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class webmail_login {
	WebDriver driver;
	WebDriverWait wait;
	public webmail_login(WebDriver driver)
	{
    	System.setProperty("webdriver.chrome.driver", "/home/qainfotech/eclipse-workspace/mail_through_webmail/src/chromedriver");
		this.driver = driver;
		wait = new WebDriverWait(driver, 10);
	
	}
	public void Open_webmail_page(String url)
	{
		driver.get(url);
		System.out.println("login page has opened");
	}
	
	public void EntryData(String username, String password)
	{
		WebElement UserName = driver.findElement(By.id("username"));
		UserName.sendKeys(username);
		WebElement PassWord = driver.findElement(By.id("password"));
		PassWord.sendKeys(password);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div[1]/div[1]/form/table/tbody/tr[3]/td[2]/input[2]")));
		driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/form/table/tbody/tr[3]/td[2]/input[2]")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

}
