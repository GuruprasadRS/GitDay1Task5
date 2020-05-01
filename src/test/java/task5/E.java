package task5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class E {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Guru\\Maven-Workspace\\GitDay1Task1\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.google.com/mail/u/0/#inbox");
		driver.manage().window().maximize();
		driver.quit();
	}
}
