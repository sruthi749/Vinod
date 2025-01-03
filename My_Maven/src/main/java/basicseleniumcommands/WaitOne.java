package basicseleniumcommands;

import java.time.Duration;
import java.util.function.Function;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitOne {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.qabible.in/payrollapp/site/login");// carol-->1q2w3e4r
		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		WebElement username = driver.findElement(By.id("loginform-username"));
		username.sendKeys("carol");
		WebElement password = driver.findElement(By.id("loginform-password"));
		password.sendKeys("1q2w3e4r");
		WebElement loginbutton = driver.findElement(By.xpath("//button[@class='btn btn-default']"));
		loginbutton.click();
		// wait is used to avoid unwanted failures when we navigate from one page to
		// other
		// 3 type wait
		// implicit wait -- general, Driver can wait one page to another page (redirect)
		// all elements can display time
		// explicit wait -- element specific, Driver can wait
		// fluent wait
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(10000));// webdriver is class for explicit wait
		//wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@href='/payrollapp/client/index']")));
		//wait.until(ExpectedConditions.textToBePresentInElementValue(null, null);
		// wait.until(ExpectedConditions.alertIsPresent())
		// wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(null))
		
		//fluent wait
		// Waiting 30 seconds for an element to be present on the page, checking
		// for its presence once every 5 seconds.
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30L))//maximum timeout 30 seconds
				.pollingEvery(Duration.ofSeconds(5L)).ignoring(NoSuchElementException.class);//polling interval 5 seconds

		WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				return driver.findElement(By.xpath("//a[@href='/payrollapp/client/index']"));
			}
		});
		WebElement client = driver.findElement(By.xpath("//a[@href='/payrollapp/client/index']"));
		client.click();
		
	
	}

}
