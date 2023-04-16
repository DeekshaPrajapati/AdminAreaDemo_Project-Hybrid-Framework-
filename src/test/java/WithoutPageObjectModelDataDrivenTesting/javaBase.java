//package WithoutPageObjectModelDataDrivenTesting;
//
//import java.time.Duration;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.AfterSuite;
//import org.testng.annotations.BeforeSuite;
//import org.testng.asserts.SoftAssert;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class javaBase {
//	
//	public static  WebDriver driver;
//	public static SoftAssert soft;
//	
//@BeforeSuite
//	  public void BrowserSetUp() {
//		WebDriverManager.chromedriver().setup();
//	    driver  = new ChromeDriver();
//	    driver.manage().window().maximize();
//	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//	  }
//	
//
//   public void soft() {
//	   soft = new SoftAssert();
//   }
//
//
////@AfterSuite
////    public void teatdown() {
////    	driver.quit();
////    }
//
//}
