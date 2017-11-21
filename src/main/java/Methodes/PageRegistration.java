package Methodes;

import com.kenai.jffi.PageManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageRegistration{

    public final String username ="PLCARDAGENTE69";
    public final String passwords ="12345678";
    public WebDriver driver;

    @FindBy(id="s_swepi_1")
    public WebElement login;

    @FindBy(id="s_swepi_2")
    public WebElement password;

    @FindBy(id="s_swepi_22")
    public WebElement submitButton;



   /* public PageRegistration (PageManager pages){
        super(pages);
    }*/

   public PageRegistration(WebDriver driver){
       PageFactory.initElements(driver,this);
       this.driver=driver;
   }

    public void   setLogin(String username) {
        login.sendKeys(username);
    }


    public  void setPassword (String passwords){
        password.sendKeys(passwords);

    }

    public void clickSubmitButton(){
        submitButton.click();
    }





    /*public void Log() {
        pageRegistration.logon.click();

    }*/





  /* @FindBy(id="s_swepi_1")
    public WebElement login;

    public void Log(String value){
        login.sendKeys(value);

  /*public void Log () {
   //Ввод логина
    WebElement login =driver.findElement(By.id("s_swepi_1"));
        login.sendKeys("PLCARDAGENTE69");

    //Ввод пароля

    WebElement password =driver.findElement(By.id("s_swepi_2"));
        password.sendKeys("12345678");

    //Подтверждение
    WebElement logon = driver.findElement(By.id("s_swepi_22"));
        logon.click();*/

}