package Methodes;

import org.aspectj.lang.annotation.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import java.util.concurrent.TimeUnit;

public class BasePageLogin extends Object{

    public void Logining() {
        System.setProperty("webdriver.chrome.driver", "C:/Users/user/IdeaProjects/Aplana_OTPBank/drr/chromedriver.exe");
        ChromeOptions co = new ChromeOptions();
        co.addArguments("start-maximized");
        WebDriver driver = new ChromeDriver(co);
        driver.get("http://192.168.61.106/agentnew/");
        //driver.get("https://yandex.ru/");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

       /* //Ввод логина
        WebElement login =driver.findElement(By.id("s_swepi_1"));
        login.sendKeys("PLCARDAGENTE69");

        //Ввод пароля

        WebElement password =driver.findElement(By.id("s_swepi_2"));
        password.sendKeys("12345678");

        //Подтверждение
        WebElement logon = driver.findElement(By.id("s_swepi_22"));
        logon.click();*/

    }
}
