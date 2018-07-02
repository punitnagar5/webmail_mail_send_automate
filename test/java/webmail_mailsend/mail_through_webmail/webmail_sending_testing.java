package webmail_mailsend.mail_through_webmail;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class webmail_sending_testing {

	WebDriver driver;
	webmail_login webmail;
	Open_new_message compose;
	message_sending send;
	
	public webmail_sending_testing()
	{
		driver = new ChromeDriver();
		webmail = new webmail_login(driver);
		compose = new Open_new_message(driver);
		send = new message_sending(driver);
	}
	@Test
	public void Testing_login_page()
	{
		webmail.Open_webmail_page("https://webmail.qainfotech.com/");
	}
	@Test (dependsOnMethods = "Testing_login_page")
	public void Test_login_credentials()
	{
		webmail.EntryData("puneetnagar","Puneet@321#");
	}
	
	@Test (dependsOnMethods = "Test_login_credentials")
	public void Click_working()
	{
		compose.click_new_message();
	}
	
	@Test (dependsOnMethods = "Click_working")
	public void sending_a_message() throws InterruptedException
	{
		send.send_a_message();
	}
	
	@Test (dependsOnMethods = "sending_a_message")
	public void Test_message_sending() throws InterruptedException
	{
		send.Type_message();
	}
	@Test (dependsOnMethods = "Test_message_sending")
	public void clickOnSendButton()
	{
		send.click_send_message();
	}
}
