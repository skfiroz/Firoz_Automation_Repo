import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xorseltrain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Infor - Birst\\Infor - Training\\Downloaded Softwares//chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.get("https://book.spicejet.com");
		   driver.manage().window().maximize();
		   String url = driver.getCurrentUrl();
		   System.out.println(driver.getPageSource());
		   driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_Defense")).click();
		   
	}

}
