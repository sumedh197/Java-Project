
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class practice {

	public static void main(String[] args) {
		
		//WebDriverManager.chromedriver().setup();
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.google.com");

	}

}
