import Methodes.BasePage;
import Methodes.PageHomeTT;
import Methodes.PageRegistration;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class LoginN extends BasePage {
    PageRegistration pageRegistration;
    PageHomeTT pageHomeTT;
    @Test
    public void Test() {

      pageRegistration= new PageRegistration(driver);
      pageRegistration.loginTo("PLCARDAGENTE69","12345678");
      pageHomeTT= new PageHomeTT(driver);
      pageHomeTT.pageHomeTTConstuktor();










    }


}