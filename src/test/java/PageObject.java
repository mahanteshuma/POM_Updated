import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObject {

    public WebDriver driver;

    public PageObject(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }








}
