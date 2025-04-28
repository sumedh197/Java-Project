package seleniumPract;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) throws InterruptedException {

		String str = "sumedh";

		int len = str.length();

		System.out.println(len);

		System.setProperty("webdriver.chrome.driver","C:\\Users\\sky\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		Thread.sleep(9000);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://courses.ultimateqa.com/users/sign_in");

		String title = driver.getTitle();

		System.out.println(title);

		WebElement username = driver.findElement(By.xpath("//input[@id='user[email]']"));

		username.sendKeys("sumedhp300@gmail.com");

		WebElement passwd = driver.findElement(By.xpath("//input[@id='user[password]']"));

		passwd.sendKeys("Test@123");

		List<WebElement> links = driver.findElements(By.tagName("a"));

		System.out.println("total links in page: " + links.size());

		for (int i = 0; i <= links.size(); i++) {

			String linkName = links.get(i).getAttribute("href");

			 System.out.println(linkName);

			

		}

	}

}
