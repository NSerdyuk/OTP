import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Iterator;
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

//PageRegistration

        WebElement login = driver.findElement(By.id("s_swepi_1"));
        login.sendKeys("PLCARDAGENTE69");


        WebElement password = driver.findElement(By.id("s_swepi_2"));
        password.sendKeys("12345678");


        WebElement logon = driver.findElement(By.id("s_swepi_22"));
        logon.click();

//PageHomeTT
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

            Thread.sleep(3000);

//PageContactCard
            WebElement seriaAndNumberOfPassport = driver.findElement(By.xpath("//div/input[@aria-label='Серия и номер паспорта']"));
            seriaAndNumberOfPassport.sendKeys("0000985282");

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


            WebElement birthdayDate = driver.findElement(By.xpath("//div/input[@aria-label='Дата рождения']"));
            birthdayDate.sendKeys("10 04 1990");

            WebElement validationData = driver.findElement(By.id("s_3_1_1_0_Ctrl"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", validationData);
            validationData.click();

            Thread.sleep(2000);


            WebElement oldPassport = driver.findElement(By.id("No Old PD Flag_Label"));
            oldPassport.click();

            WebElement catagoryOfGoods = driver.findElement(By.xpath("//div/span[@class='add-item']"));
            catagoryOfGoods.click();


            WebElement checkCatagoryOfGoods = driver.findElement(By.id("1_Category"));
            checkCatagoryOfGoods.submit();


            checkCatagoryOfGoods.sendKeys("Авто аудио-видео системы");

            WebElement buttonNext = driver.findElement(By.id("s_13_1_1_0_Ctrl"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", buttonNext);
            buttonNext.click();


 //Page5
            //прикрепить фото
            WebElement sendPhoto =driver.findElement(By.name("S_A5file-upload-0"));
            sendPhoto.sendKeys("C:/ОТПБанк/фото3.png");
            Thread.sleep(3000);
            WebElement sendPhotoOK =driver.findElement(By.xpath("//div/button[@id='sendPhoto']"));
            sendPhotoOK.click();


            Thread.sleep(3000);
            //Страница паспорта с регистрацией

            WebElement sendDoc =driver.findElement(By.name("S_A5file-upload-1"));
            sendDoc.sendKeys("C:/ОТПБанк/фото1.png");
            Thread.sleep(2000);
            WebElement sendDocoOK =driver.findElement(By.xpath("//div/button[@id='verificatePhoto']"));
            sendDocoOK.click();



            //Паспорт - разворот

            WebElement sendPassport =driver.findElement(By.name("S_A5file-upload-2"));
            sendPassport.sendKeys("C:/ОТПБанк/фото2.png");
            Thread.sleep(2000);
            WebElement sendPassportOK =driver.findElement(By.xpath("//div/button[@id='verificatePhoto']"));
            sendPassportOK.click();





            WebElement socialStatus = driver.findElement(By.xpath("//div/label[@for='s_13_1_23_0']"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", socialStatus);
            socialStatus.click();

            WebElement maritalStatus = driver.findElement(By.xpath("//div/label[@for='s_13_1_33_0_0']"));
            maritalStatus.click();

            WebElement mobilePhone = driver.findElement(By.name("s_13_1_24_0"));
            mobilePhone.sendKeys("9863216598");

            WebElement checkBoxEmail = driver.findElement(By.xpath("//div/label[@for='s_13_1_20_0']"));
            checkBoxEmail.click();

            WebElement workPhone = driver.findElement(By.name("s_13_1_26_0"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", workPhone);
            workPhone.sendKeys("8749632541");
            WebElement homePhone = driver.findElement(By.name("s_13_1_27_0"));
            homePhone.sendKeys("9874563214");

            WebElement adress = driver.findElement(By.name("s_13_1_4_0"));
            adress.sendKeys("Россия, Москва");

          /* String parentWindowHandel = driver.getWindowHandle();
            String subWindowHandel = null;
            Set <String> handles = driver.getWindowHandles();
            Iterator<String> iterator = handles.iterator();
            while (iterator.hasNext()){
                subWindowHandel = iterator.next();
            }
*/
            WebElement check = driver.findElement(By.id("s_13_1_5_0"));
            check.click();

            Thread.sleep(2000);

            Set<String> handles = driver.getWindowHandles();
            for (String subhandle : handles) {
                if (!subhandle.equals(handles)) {
                    driver.switchTo().window(subhandle);

                }
            }

         /*try {


               Alert alert = driver.switchTo().alert();
                 alert.accept();
               }catch (NoAlertPresentException e){

               }*/
            //  driver.switchTo().window(subWindowHandel);

            WebElement appletButton = driver.findElement(By.xpath("//div/input[@aria-label='Индекс']"));
            //appletButton.isDisplayed();
            Actions action = new Actions(driver);
            action.moveToElement(appletButton).build().perform();
            appletButton.sendKeys("121059");

            WebElement district =driver.findElement(By.xpath("//div/input[@aria-label='Улица']"));
            district.sendKeys("Можайский");

            WebElement home =driver.findElement(By.xpath("//div/input[@aria-label='Дом']"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", home);
            home.sendKeys("8");

            WebElement flat =driver.findElement(By.xpath("//div/input[@aria-label='Дом']"));
            //((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", flat);
            flat.sendKeys("8");




            WebElement appletsButton = driver.findElement(By.xpath("//span/button[@aria-label='Проверено']"));
           // ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", appletsButton);
            appletsButton.click();

            WebElement appletssButton = driver.findElement(By.xpath("//span/button[@aria-label='Проверено']"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", appletssButton);
            appletssButton.click();

            System.out.println("appletButton");

            Thread.sleep(3000);
//span/button[@aria-label='Проверено']

            //driver.switchTo().window(parentWindowHandel);

            WebElement registrationDate =driver.findElement(By.xpath("//div/input[@aria-label='Дата регистрации']"));
            registrationDate.sendKeys("12 03 2015");
            Thread.sleep(2000);

            WebElement adressOfLiving =driver.findElement(By.xpath("//div/label[@for='s_13_1_13_0']"));
            adressOfLiving.click();
            Thread.sleep(2000);

            WebElement postAdress =driver.findElement(By.xpath("//div/label[@for='s_13_1_16_0']"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", postAdress);
            postAdress.click();

            WebElement code = driver.findElement(By.xpath("//div/input[@aria-label='Код подразделения']"));
            code.sendKeys("123 659");

            WebElement passportGivenBy = driver.findElement(By.xpath("//div/input[@aria-label='Кем выдан']"));
            passportGivenBy.sendKeys("Москва");

            WebElement birthdayCountryLabel = driver.findElement(By.xpath("//div/input[@aria-label='Страна рождения']"));
            birthdayCountryLabel.sendKeys("Россия");

            WebElement birthdayCityLabel = driver.findElement(By.xpath("//div/input[@aria-label='Место рождения']"));
            birthdayCityLabel.sendKeys("Москва");


            WebElement personalIncome = driver.findElement(By.xpath("//div/input[@aria-label='Персональный доход']"));
            personalIncome.sendKeys("65000");


            WebElement categoryName =driver.findElement(By.id("1Name"));
            Actions actions =new Actions(driver);
            actions.moveToElement(categoryName).build().perform();
            categoryName.click();
            Thread.sleep(2000);

            WebElement categoryName1 =driver.findElement(By.xpath("//input[@name='Name']"));
            categoryName1.sendKeys("fg");

            WebElement categoryMarka =driver.findElement(By.id("1Marka"));
            Actions actions1 =new Actions(driver);
            actions.moveToElement(categoryMarka).build().perform();
            categoryMarka.click();
            Thread.sleep(2000);


            WebElement category1Marka1 =driver.findElement(By.xpath("//input[@name='Marka']"));
            category1Marka1.sendKeys("fg");

            WebElement categoryModel =driver.findElement(By.id("1Model"));
            Actions actions12 =new Actions(driver);
            actions.moveToElement(categoryModel).build().perform();
            categoryModel.click();
            Thread.sleep(2000);


            WebElement category1Model1 =driver.findElement(By.xpath("//input[@name='Model']"));
            category1Model1.sendKeys("fg");

            WebElement categoryPrice=driver.findElement(By.id("1Price"));
            Actions actions13 =new Actions(driver);
            actions.moveToElement(categoryPrice).build().perform();
            categoryPrice.click();
            Thread.sleep(2000);


            WebElement category1Price1 =driver.findElement(By.xpath("//input[@name='Price']"));
            category1Price1.sendKeys("15000");



            WebElement buttonNext2 =driver.findElement(By.id("s_3_1_0_0_Ctrl"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", buttonNext2);
            buttonNext2.click();


















        } catch (InterruptedException c) {
            c.printStackTrace();
        }

    }}