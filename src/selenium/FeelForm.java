package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FeelForm {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sky\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		Thread.sleep(9000);
		
		driver.get("https://courses.ultimateqa.com/users/sign_in");

		String title = driver.getTitle();

		System.out.println(title);
		
	}

}
