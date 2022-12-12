import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WebLogin extends PageObject{

    public WebLogin(WebDriver driver){
        super(driver);
    }


    private final String FIRST_NAME = "First Name";
    private final String LAST_NAME = "Last Name";

    private final String MOBILE_NUMBER = "Mobile Number";

    private final String NEW_PASSWORD = " New Password";

    @FindBy(xpath = "//a[contains(text(),'Create New Account')]")
    private WebElement Create_New_Account;

    @FindBy(name = "firstname")
    private WebElement first_name;

    @FindBy(name = "lastname")
    private  WebElement last_name;

//    @FindBy(name="reg_email__")
//    private WebElement mobile_number;

    @FindBy(id = "password_step_input")
    private WebElement new_password;

    @FindBy(name="websubmit")
    private WebElement signup;

    public void clickCreateBtn(){
        Create_New_Account.click();
    }

    public void enterFirst_Name(){
        this.first_name.sendKeys(FIRST_NAME);
    }

    public void enterLast_Name(){
        this.last_name.sendKeys(LAST_NAME);
    }

//    public void enterMobile_Number(){
//        this.mobile_number.sendKeys(MOBILE_NUMBER);
//    }

    public void enterNewPassword(){
        this.new_password.sendKeys(NEW_PASSWORD);
    }

    public void clickOnSignUpBtn(){
        this.signup.click();
    }
}
