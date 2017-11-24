package Methodes;

import com.kenai.jffi.PageManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageRegistration extends BasePage {

   // WebDriver driver;

    @FindBy(id = "s_swepi_1")
    public WebElement login;

    @FindBy(id = "s_swepi_2")
    public WebElement password;

    @FindBy(id = "s_swepi_22")
    public WebElement submitButton;



    public PageRegistration(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void setLogin(String username) {

        login.sendKeys(username);
    }


    public void setPassword(String passwords) {
        password.sendKeys(passwords);

    }

    public void clickSubmitButton() {

        submitButton.click();
    }
//конструктор
    public void loginTo(String username, String passwords) {

        this.setLogin(username);

        this.setPassword(passwords);

        this.clickSubmitButton();
    }


}








