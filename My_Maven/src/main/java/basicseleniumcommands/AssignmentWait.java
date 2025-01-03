package basicseleniumcommands;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AssignmentWait {
	public static void main(String args[]) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.qabible.in/payrollapp/site/login");// carol-->1q2w3e4r
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.id("loginform-username"));
		username.sendKeys("carol");
		WebElement password = driver.findElement(By.id("loginform-password"));
		password.sendKeys("1q2w3e4r");
		WebElement loginbutton = driver.findElement(By.xpath("//button[@class='btn btn-default']"));
		loginbutton.click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(10000));
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//a[@href='/payrollapp/worker/index']")));
		WebElement worker = driver.findElement(By.xpath("//a[@href='/payrollapp/worker/index']"));
		worker.click();

		// Search text
		WebElement searchbtn = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		WebDriverWait searchwait = new WebDriverWait(driver, Duration.ofMillis(5000));
		boolean a = searchwait.until(ExpectedConditions.textToBePresentInElement(searchbtn, "Search"));
		System.out.println(a);

		// Presence of calss attribute value
		WebElement statusElement = driver.findElement(By.xpath("//table")); // Replace with the actual locator
		WebDriverWait classWait = new WebDriverWait(driver, Duration.ofSeconds(1));
		boolean b = classWait.until(ExpectedConditions.attributeContains(statusElement, "class", "table table-striped table-bordered"));
		System.out.println(b);

		// Delete Icon for any row
		WebElement deleteicon = driver.findElement(By.xpath("//table[@class ='table table-striped table-bordered']//tbody//tr[1]//td[8]//a[@title = 'Delete']"));
		deleteicon.click();
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofMillis(5000));
		wait1.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
		System.out.println("Worker deleted successfully.");

	}

}
