package Methodes;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.jsoup.select.Evaluator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageHomeTT extends BasePageLogin {

    public WebDriver driver;

  /* @FindBy(id="s_swepi_1")
    private WebElement login;

    public void Log(String value){
        login.sendKeys(value);
*/
  public void Log () {
   //Ввод логина
    WebElement login =driver.findElement(By.id("s_swepi_1"));
        login.sendKeys("PLCARDAGENTE69");

    //Ввод пароля

    WebElement password =driver.findElement(By.id("s_swepi_2"));
        password.sendKeys("12345678");

    //Подтверждение
    WebElement logon = driver.findElement(By.id("s_swepi_22"));
        logon.click();

}}