import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class AngleTestCase {
	WebDriver driver = null;


			@BeforeClass (alwaysRun = true)
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver", "D:\\Infor - Birst\\Infor - Training\\Downloaded Softwares//chromedriver.exe");
		driver=new ChromeDriver();

	}


	@Test
	public void OpenAnglesite () {
		driver.get("https://trade.angelbroking.com/Login");
		driver.manage().window().maximize();  
		String ActualTitle = driver.getTitle();
		System.out.println("Page Title " + ActualTitle);

	}


	@AfterClass (alwaysRun = true)
	public void afterClass() {
		driver.quit();
	}

}

