import Methodes.BaseStep;
import Methodes.PageRegistration;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class LoginN extends BaseStep {

    WebDriver driver;
    @Test
    public void Test() {

       PageRegistration pageRegistration= new PageRegistration(driver);
       pageRegistration.setLogin("hgh");
       pageRegistration.setPassword("656");
       pageRegistration.clickSubmitButton();





    }}