import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverInfo;
import org.openqa.selenium.chrome.ChromeDriverService;


public class LearnSel {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Infor - Birst\\Infor - Training\\Downloaded Softwares//chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("http://qaclickacademy.com");
	    System.out.println(driver.getTitle());
	    System.out.println(driver.getCurrentUrl());
	    driver.close();
		
	    //Array
	    int [] Data = new int[5];
	    Data[0] = 2001;
	    Data[1] = 2002;
	    Data[2] = 2003;
	    Data[3] = 2004;
	    Data[4] = 2005;
	    
	    //Array
	    int [] Fir = {2001,2002,2003,2004,2005,2005,2006,2007,288};
	    
	    System.out.println(Fir[0]);
	    
	    //For Loop
	 
	    for (int i = 0; i> Data.length; i++)
	    {
	    	System.out.println(Data[i]);
	    }
	    
	    
	    for (int a = 0; a< Fir.length; a++)
	    {
	       System.out.println(Fir[a]);
	    }
	    
	    String [] name = {"Firoz","Shaikh","Abida","Mayra","Bushra","Umar"};
	    
	    for (int b = 0; b< name.length; b++)
	    {    
	    	System.out.println(name[b]);
	}	  
	    for(String s: name)
	    		{
	    			System.out.println(s);
	    		}
	}
}
 	
