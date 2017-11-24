package Methodes;

import com.kenai.jffi.PageManager;
import org.aspectj.lang.annotation.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import java.util.concurrent.TimeUnit;

public class BasePage{

    public WebDriver driver;



    @org.junit.Before
    public void Logining() {
        System.setProperty("webdriver.chrome.driver", "C:/Users/user/IdeaProjects/Aplana_OTPBank/drr/chromedriver.exe");
        ChromeOptions co = new ChromeOptions();
        co.addArguments("start-maximized");
        driver = new ChromeDriver(co);
        driver.get("http://192.168.61.106/agentnew/");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


    }
}
