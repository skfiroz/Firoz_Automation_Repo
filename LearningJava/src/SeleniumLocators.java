import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class SeleniumLocators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Infor - Birst\\Infor - Training\\Downloaded Softwares//chromedriver.exe");
		WebDriver driver1=new ChromeDriver();
			//System.setProperty("webdriver.gecko.driver", "D:\\Infor - Birst\\Infor - Training\\Downloaded Softwares//geckodriver.exe");
		//WebDriver driver=new FirefoxDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver1.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		driver1.get("https://www.easynikah.in/home");
		driver1.manage().window().maximize();
		driver1.get("https://www.easynikah.in/login");
		driver1.findElement(By.name("email")).sendKeys("fatima51189@gmail.com");
		driver1.findElement(By.id("edit-pass")).sendKeys("Firoz1111");
		driver1.findElement(By.className("submit")).click();
		System.out.println(driver1.findElement(By.cssSelector("div[class='home_title']")).getText());
		Assert.assertEquals(driver1.findElement(By.cssSelector("div[class='home_title']")).getText(), "EasyNikah.in - Bringing Families Together");
		driver1.findElement(By.xpath("/html/body/div[2]/div[2]/div/ul/li[10]/a")).click();
		driver1.findElement(By.xpath("//*[@id=\"profile-tab\"]")).click();
		driver1.findElement(By.cssSelector("li.dropdown:nth-child(4) > a:nth-child(1)")).click();
		driver1.findElement(By.cssSelector("div.form_but1:nth-child(1) > div.col-sm-7.form_radios"));
		// searching profile - add gender
		Select s = new Select(driver1.findElement(By.name("gender")));
		s.selectByVisibleText("Groom");
		//add marital status
//		Thread.sleep(5000);
		driver1.findElement(By.cssSelector("body > div:nth-child(2) > div:nth-child(6) > div:nth-child(1) > form:nth-child(1) > div:nth-child(5) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > select:nth-child(1)")).click();
		driver1.findElement(By.cssSelector("option[value='unmarried']")).click();
		driver1.findElement(By.cssSelector("body > div:nth-child(2) > div:nth-child(6) > div:nth-child(1) > form:nth-child(1) > div:nth-child(5) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > select:nth-child(1)")).click();
		
		// select qualification
		driver1.findElement(By.cssSelector("div[class='dropdown_q'] dt a")).click();
		driver1.findElement(By.xpath("(//label[normalize-space()='Bachelor in Hotel Management'])[1]")).click();
		Thread.sleep(5000);
		driver1.findElement(By.xpath("//label[normalize-space()='B.C.A. (Bachelor of Computer Application)']")).click();
		Thread.sleep(5000);
    	driver1.findElement(By.xpath("//label[normalize-space()='B.E. (Bachelor of Engineering)']")).click();
		driver1.findElement(By.xpath("//label[normalize-space()='B.Sc. (Bachelor of Science)']")).click();
		driver1.findElement(By.cssSelector("div[class='dropdown_q'] dt a")).click();
		 
	    //driver1.findElement(By.xpath("div[class='dropdown_q'] dt a")).click();
	    // mouse hoovering
//	    WebElement ele = driver1.findElement(By.xpath("//label[normalize-space()='Maslak :']"));
//	    //Creating object of an Actions class
//	    Actions action = new Actions(driver1);
//    	//Performing the mouse hover action on the target element.
//    	action.moveToElement(ele).perform();
	    //select sector
	    driver1.findElement(By.xpath("//span[@class='hida_m']")).click();
	    driver1.findElement(By.xpath("//label[@for='Barelvi - Dargah-Niyaz']")).click();
	    driver1.findElement(By.cssSelector(".multiSel_m")).click();
	    // select height
	    driver1.findElement(By.xpath("//div[@class='dropdown_h']//dt//a")).click();
	    driver1.findElement(By.xpath("/html/body/div[2]/div[4]/div/form/div[5]/div/div[5]/div/div[1]/div/div/dd/div/ul/li[15]/label")).click();
	    driver1.findElement(By.xpath("/html/body/div[2]/div[4]/div/form/div[5]/div/div[5]/div/div[1]/div/div/dd/div/ul/li[16]/label")).click();
	    driver1.findElement(By.xpath("/html/body/div[2]/div[4]/div/form/div[5]/div/div[5]/div/div[1]/div/div/dd/div/ul/li[18]/label")).click();
	    driver1.findElement(By.xpath("/html/body/div[2]/div[4]/div/form/div[5]/div/div[5]/div/div[1]/div/div/dd/div/ul/li[18]/label")).click();
	    driver1.findElement(By.xpath("/html/body/div[2]/div[4]/div/form/div[5]/div/div[5]/div/div[1]/div/div/dd/div/ul/li[19]/label")).click();
	    driver1.findElement(By.xpath("/html/body/div[2]/div[4]/div/form/div[5]/div/div[5]/div/div[1]/div/div/dd/div/ul/li[20]/label")).click();
	    driver1.findElement(By.cssSelector(".multiSel_h")).click();
	    driver1.findElement(By.xpath("//div[@class='dropdown_h']//dt//a")).click();
	    // select Age
	    driver1.findElement(By.xpath("//a[@href='#asd']")).click();
	    driver1.findElement(By.cssSelector("label[for='33']")).click();
	    driver1.findElement(By.cssSelector("label[for='34']")).click();
	    driver1.findElement(By.cssSelector("label[for='35']")).click();
	    driver1.findElement(By.cssSelector("label[for='36']")).click();
	    driver1.findElement(By.cssSelector("label[for='37']")).click();
	    driver1.findElement(By.cssSelector("label[for='38']")).click();
	    driver1.findElement(By.xpath("//a[@href='#asd']")).click();
	    //Select Country
	    driver1.findElement(By.cssSelector("select[name='partner_current_location_country[]']")).click();
	    Select country = new Select(driver1.findElement(By.cssSelector("select[name='partner_current_location_country[]']")));
	    country.selectByVisibleText("India");
		driver1.findElement(By.cssSelector("select[name='partner_current_location_country[]']")).click();
		//select State
		driver1.findElement(By.cssSelector("select[name='partner_current_location_state[]']")).click();
	    Select state = new Select(driver1.findElement(By.cssSelector("select[name='partner_current_location_state[]']")));
		state.selectByVisibleText("Maharashtra");
		driver1.findElement(By.cssSelector("select[name='partner_current_location_state[]']")).click();
		//select City
		driver1.findElement(By.cssSelector("select[name='partner_current_location_city[]']")).click();
	    Select city = new Select(driver1.findElement(By.cssSelector("select[name='partner_current_location_city[]']")));
		city.selectByVisibleText("Mumbai");
		driver1.findElement(By.cssSelector("select[name='partner_current_location_city[]']")).click();
		//Click on add more city
		driver1.findElement(By.cssSelector(".cust-exp")).click();
		//Select Country
	    driver1.findElement(By.cssSelector("select[name='partner_current_location_country[]']")).click();
	    Select country1 = new Select(driver1.findElement(By.cssSelector("select[name='partner_current_location_country[]']")));
	    country1.selectByVisibleText("India");
		driver1.findElement(By.cssSelector("select[name='partner_current_location_country[]']")).click();
		//select State
		driver1.findElement(By.cssSelector("select[name='partner_current_location_state[]']")).click();
	    Select state1 = new Select(driver1.findElement(By.cssSelector("select[name='partner_current_location_state[]']")));
		state1.selectByVisibleText("Maharashtra");
		driver1.findElement(By.cssSelector("select[name='partner_current_location_state[]']")).click();
		//select City
		driver1.findElement(By.cssSelector("select[name='partner_current_location_city[]']")).click();
	    Select city1 = new Select(driver1.findElement(By.cssSelector("select[name='partner_current_location_city[]']")));
		city1.selectByVisibleText("Pune");
		driver1.findElement(By.cssSelector("select[name='partner_current_location_city[]']")).click();
		driver1.findElement(By.xpath("//input[@id='submit-btn']")).click();
		
		
	    
	    
	    }

	
	    
	   
		
		
		
		
		   
   
   
   
   
   
   
	//driver1.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("john@rsa.com");

//		driver1.findElement(By.xpath("//input[@type='text'][2]")).clear();
//driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("john@rsa.com");

   // driver.findElement(By.xpath("//input[@type='text'][2]")).clear();

   // driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("john@gmail.com");

   // driver.findElement(By.xpath("//form/input[3]")).sendKeys("9864353253");

  //  driver.findElement(By.cssSelector(".reset-pwd-btn")).click();

   // System.out.println(driver.findElement(By.cssSelector("form p")).getText());

   // driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();

	   // Thread.sleep(1000);

	   // driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");

	   // driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");

	  //  driver.findElement(By.id("chkboxOne")).click();

	   // driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
	    	  
	    
	    
		
	}
	
	


