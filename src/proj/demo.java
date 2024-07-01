package proj;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://f5global.com/");
		driver.get("https://f5global.com/account/login");
		driver.get("https://f5global.com/account/register");
		driver.findElement(By.id("RegisterForm-FirstName")).sendKeys("priyanka");
		driver.findElement(By.id("RegisterForm-LastName")).sendKeys("priyanka");
		driver.findElement(By.id("RegisterForm-email")).sendKeys("priyanka@yopmail.com");
		driver.findElement(By.id("RegisterForm-password")).sendKeys("Password@123");
		driver.findElement(By.id("RegisterForm-confirmPassword")).sendKeys("Password@123");
		driver.findElement(By.cssSelector("checkbox-div input:checked+label:after"));
		//WebElement button= driver.findElement(By.xpath("//*[@id=\"customer_login\"]/button/text()"));
		//button.click();
		//driver.findElement(By.name("your-subject")).sendKeys("over repair");
		//driver.findElement(By.name("your-message")).sendKeys("over repair");
		//driver.findElement(By.className("wpcf7-submit")).click();
		//driver.navigate().back();
		System.out.println("hello priyanka");
        // driver.quit();
	}

}
