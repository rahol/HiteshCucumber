package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerPage  {

    WebDriver driver;

    public CustomerPage(WebDriver driver){
        this.driver=driver;
    }


    public void setBtnContinue(){
        try {
           driver.findElement(By.xpath("//span[@class='ui-button-text' and text()='Continue']")).click();
        }
        catch (NullPointerException e){
            System.out.println(e +"((((((((((()))))))))))))");
        }

    }

}
