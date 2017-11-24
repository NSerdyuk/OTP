package Methodes;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageHomeTT extends BasePage {


    @FindBy(id = "s_2_1_1_0_icon")
    WebElement homeTT;

    @FindBy(id="s_1_1_0_0_Ctrl")
    WebElement newApplication;


    public PageHomeTT(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }


    public void setHomeTT(){
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", homeTT);
        homeTT.click();
    }


    public void setBuilder() {
        try {
            Actions builder = new Actions(driver);
            Action dbclick = builder.doubleClick(driver.findElement(By.id("1ISB_TT_Code"))).build();
            dbclick.perform();
            Thread.sleep(1000);


        }    catch (InterruptedException c) {
            c.printStackTrace();
        }
    }

    public void setNewApplication() {
        newApplication.click();
    }




    //конструктор

     public void pageHomeTTConstuktor(){
         this.setHomeTT();
         this.setBuilder();
         this.setNewApplication();



    }
}