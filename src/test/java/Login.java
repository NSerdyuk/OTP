import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Login {
    @Test
    public void main() {
        System.setProperty("webdriver.chrome.driver", "C:/Users/user/IdeaProjects/Aplana_OTPBank/drr/chromedriver.exe");
        ChromeOptions co = new ChromeOptions();
       co.addArguments("start-maximized");
        WebDriver driver = new ChromeDriver(co);
        driver.get("http://192.168.61.106/agentnew/");
        driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);


        WebElement login = driver.findElement(By.id("s_swepi_1"));
        login.sendKeys("PLCARDAGENTE69");


        WebElement password = driver.findElement(By.id("s_swepi_2"));
        password.sendKeys("12345678");


        WebElement logon = driver.findElement(By.id("s_swepi_22"));
        logon.click();


        WebElement homeTT = driver.findElement(By.id("s_2_1_1_0_icon"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", homeTT);
        homeTT.click();


        try {
            Actions builder = new Actions(driver);
            Action dbclick = builder.doubleClick(driver.findElement(By.id("1ISB_TT_Code"))).build();
            dbclick.perform();
            Thread.sleep(1000);



            WebElement newApplication = driver.findElement(By.id("s_1_1_0_0_Ctrl"));
            newApplication.click();

            Thread.sleep(2000);


            WebElement seriaAndNumberOfPassport = driver.findElement(By.xpath("//div/input[@aria-label='Серия и номер паспорта']"));
            seriaAndNumberOfPassport.sendKeys("0000985225");

            Thread.sleep(2000);


            WebElement issuedBy = driver.findElement(By.xpath("//div/input[@aria-label='Когда выдан паспорт']"));
            issuedBy.sendKeys("12 03 2015");

            WebElement lastName = driver.findElement(By.xpath("//div/input[@aria-label='ФИО']"));
            lastName.sendKeys("НОВПОСОКОВЫЙ");


            WebElement firstName = driver.findElement(By.xpath("//div/input[@aria-label='Имя']"));
            firstName.sendKeys("ИВАНЪ");


            WebElement middleName = driver.findElement(By.xpath("//div/input[@aria-label='Отчество']"));
            middleName.sendKeys("ИВАНОВИЧ");

            Thread.sleep(2000);

            WebElement male = driver.findElement(By.xpath("//div/label[@for='s_6_1_9_0_0']"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", male);
            male.click();


            WebElement birthdayDate =driver.findElement(By.xpath("//div/input[@aria-label='Дата рождения']"));
            birthdayDate.sendKeys("10 04 1990");

            WebElement validationData =driver.findElement(By.id("s_3_1_1_0_Ctrl"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", validationData);
            validationData.click();

            Thread.sleep(2000);


            WebElement oldPassport =driver.findElement(By.id("No Old PD Flag_Label"));
            oldPassport.click();

            WebElement catagoryOfGoods =driver.findElement(By.xpath("//div/span[@class='add-item']"));
            catagoryOfGoods.click();


            WebElement checkCatagoryOfGoods =driver.findElement(By.id("1_Category"));
            checkCatagoryOfGoods.submit();


            checkCatagoryOfGoods.sendKeys("Авто аудио-видео системы");

            WebElement buttonNext =driver.findElement(By.id("s_13_1_1_0_Ctrl"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", buttonNext);
            buttonNext.click();

            WebElement socialStatus=driver.findElement(By.xpath("//div/label[@for='s_13_1_23_0']"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", socialStatus);
            socialStatus.click();

            WebElement maritalStatus =driver.findElement(By.xpath("//div/label[@for='s_13_1_33_0_0']"));
            maritalStatus.click();

            WebElement mobilePhone =driver.findElement(By.name("s_13_1_24_0"));
            mobilePhone.sendKeys("9863216598");

            WebElement checkBoxEmail =driver.findElement(By.xpath("//div/label[@for='s_13_1_20_0']"));
            checkBoxEmail.click();

            WebElement workPhone =driver.findElement(By.name("s_13_1_26_0"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", workPhone);
            workPhone.sendKeys("8749632541");
            WebElement homePhone =driver.findElement(By.name("s_13_1_27_0"));
            homePhone.sendKeys("9874563214");



            WebElement adress =driver.findElement(By.name("s_13_1_4_0"));
            adress.sendKeys("121059, Россия, Москва, г Москва, туп Можайский 1-й, д 8, кв 2");


            WebElement check =driver.findElement(By.id("s_13_1_5_0_mb"));
            check.click();



            WebElement appletButton = driver.findElement(By.xpath("//span[@class='siebui-popup-button']"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", appletButton);
            appletButton.click();

            WebElement registrationDate =driver.findElement(By.xpath("//div/input[@aria-label='Дата регистрации']"));
            registrationDate.sendKeys("12 03 2015");

            WebElement adressOfLiving =driver.findElement(By.xpath("//div/label[@for='s_13_1_13_0']"));
            adressOfLiving.click();

            WebElement postAdress =driver.findElement(By.xpath("//div/label[@for='s_13_1_16_0']"));
            adressOfLiving.click();














        } catch (InterruptedException c) {
            c.printStackTrace();
        }


    }}