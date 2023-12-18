package GenericUtilities;

import java.io.File;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.max.ObjectRepo.CartPage;
import com.max.ObjectRepo.CategoriesPage;
import com.max.ObjectRepo.FacebookPage;
import com.max.ObjectRepo.FavoritePage;
import com.max.ObjectRepo.HomePage;
import com.max.ObjectRepo.LoginPage;
import com.max.ObjectRepo.OfferZonePage;
import com.max.ObjectRepo.ProductDetailsPage;
import com.max.ObjectRepo.StoreLocatorPage;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class BaseClass {

	public AndroidDriver driver;
	public static TakesScreenshot sdriver;
	public AppiumDriverLocalService service;
	public FileUtility futil = new FileUtility();
	public GestureUtility gutil;
	public DriveUtility dutil;
	public LoginPage lp;
	public HomePage hp;
	public FavoritePage fp;
	public CartPage cp;
	public StoreLocatorPage slp;
	public FacebookPage fbp;
	public OfferZonePage ozp;
	public ProductDetailsPage pdp;
	public CategoriesPage cat;
	
	@BeforeSuite
	public void startServer() {
		File f = new File("C:\\Users\\HI\\AppData\\Roaming\\npm\\node_modules\\appium\\lib\\main.js");
		 service = new AppiumServiceBuilder().withAppiumJS(f).
				withIPAddress("127.0.0.1").usingPort(4723).
				withTimeout(Duration.ofSeconds(300)).build();
		
		service.start();
	}
	
	@BeforeClass
	public void startApp() throws Throwable {
		DesiredCapabilities dc = new DesiredCapabilities();
		
		String platform = futil.dataFromPropertyFile("PLATFORM_NAME");
		String automation = futil.dataFromPropertyFile("AUTOMATION_NAME");
		
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, platform);
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Madhumitha jaganath");
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, automation);
		dc.setCapability(MobileCapabilityType.UDID, "RZ8T31JR73N");
		//dc.setCapability(MobileCapabilityType.BROWSER_NAME, "chrome");
		
		dc.setCapability("appPackage", "com.applications.max");
		dc.setCapability("appActivity", "com.landmarkgroup.landmarkshops.bx2.launcher.LauncherActivity");
		
		URL u = new URL("http://localhost:4723");
		driver = new AndroidDriver(u,dc);
		
		sdriver=driver;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		gutil = new GestureUtility(driver);
		dutil = new DriveUtility(driver);
		lp = new LoginPage(driver);
		hp = new HomePage(driver);
		fp = new FavoritePage(driver);
		cp = new CartPage(driver);
		slp = new StoreLocatorPage(driver);
		fbp = new FacebookPage(driver);
		ozp=new OfferZonePage(driver);
		pdp=new ProductDetailsPage(driver);
		cat=new CategoriesPage(driver);
		hp.ClickOnHome();
	}
	
	@AfterClass
	public void closeApp() {
		driver.quit();
	}
	
	@AfterSuite
	public void stopServer() {
		service.stop();	
	}

}
