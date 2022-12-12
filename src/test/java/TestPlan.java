import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.time.Duration;

public class TestPlan {
  public static WebDriver driver;
  @BeforeClass
  public void setUp() {
      WebDriverManager.chromedriver().setup();
      driver=new ChromeDriver();
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  }

  @Test(testName = "Submit a Facebook signup")
  public void submit(){
      driver.get(Utils.BASE_URL);
      WebLogin wl=new WebLogin(driver);
      wl.clickCreateBtn();
      wl.enterFirst_Name();
      wl.enterLast_Name();
      //wl.enterMobile_Number();
      wl.enterNewPassword();
      wl.clickOnSignUpBtn();
  }

  @AfterClass
    public void tearDown(){
      driver.manage().deleteAllCookies();
      driver.quit();
  }
}
