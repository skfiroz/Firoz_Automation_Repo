import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class LearnJAVA1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Infor - Birst\\Infor - Training\\Downloaded Softwares//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		// Open Angle Broking site
		driver.get("https://trade.angelbroking.com/Login");
		// Get Title
		String ActualTitle = driver.getTitle();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		// Print Title
		System.out.println("Page Title " + ActualTitle);
		Assert.assertEquals(ActualTitle, "Web Trading Platform | Angel One");
		// to validate title using 
		if (ActualTitle.equals("Web Trading Platform | Angel One")) {
			
			System.out.println("Verified the title using IF condition");
		}
		else 
		{
			System.out.println(ActualTitle);
			
		}
		// Add ID & Password
		driver.findElement(By.cssSelector("#txtUserID")).sendKeys("F7081");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Bushra786786");
		driver.findElement(By.cssSelector("#txtIconTradingPassword")).click();
		driver.findElement(By.cssSelector("#loginBtn")).click();
		// Login Successfully
		// Fetch all child elements of parent element for looping purpose
		//Totalscript is the tbody and trs is the collection of all <tr> tag in that tbody
		WebElement Totalscript = driver.findElement(By.cssSelector("#EQHolding_body"));
		List <WebElement> trs =  Totalscript.findElements(By.xpath("./tr"));
		int i = trs.size();
		System.out.println(i);
		for(int j = 0; j<i; j++) {
			WebElement a=trs.get(j);
			System.out.println(a.getText());
			///td[1]/a
			//System.out.println(trs[j]);
			//*[@id="EQHolding_body"]/tr[1]/td[1]/a
		}
		// Using While loop to get Sensex dynamic data print everytime
		WebElement sensex = driver.findElement(By.cssSelector("span.lastvalue"));
		WebElement market = driver.findElement(By.cssSelector("span[class='chng'][id='sensexChange']"));
		sensex.getText();
		market.getText();
		int b = 0;	
		while (b<10) {
		System.out.println(sensex.getText());
		b++;
		Thread.sleep(0);
		}
//		WebElement market = driver.findElement(By.cssSelector("span[class='chng'][id='sensexChange']"));
//		market.getText();
//		int d = 0;
//		while () {
//			System.out.println(market.getText());
//			d++;
//			}
		driver.quit();
	}
}
		
		
				
			
		
		
		
		
		
	


