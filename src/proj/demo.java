package proj;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ssappliancesolutions.com/");
		driver.findElement(By.xpath("//*[@id=\"menu-item-16763\"]/a")).click();
		driver.findElement(By.name("your-name")).sendKeys("priyanka");
		driver.findElement(By.name("your-email")).sendKeys("priyanka@gmail.com");
		driver.findElement(By.name("your-tel")).sendKeys("9898988999");
		driver.findElement(By.name("your-subject")).sendKeys("over repair");
		driver.findElement(By.name("your-message")).sendKeys("over repair");
		driver.findElement(By.className("wpcf7-submit")).click();
		driver.navigate().back();
		System.out.println("hello priyanka");
        // driver.quit();
	}

}
