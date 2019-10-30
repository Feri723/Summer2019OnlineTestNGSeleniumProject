package VytrackAutomation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.BrowserFactory;

public class LaunchLogin {
    public static void main(String[] args) {
        //launch chrome browser
        WebDriver driver= BrowserFactory.getDriver("chrome");
        driver.get("https://qa2.vytrack.com/user/login");
        //entering user name
        WebElement username =driver.findElement(By.name("_username"));
       username.sendKeys("user42");

        //entering the password
        WebElement password = driver.findElement(By.name("_password") );
        password.sendKeys("UserUser123");
        //clicking the login button
        WebElement clicklogin = driver.findElement(By.id("_submit") );

         String expectedURL="https://qa2.vytrack.com/user/login";
        // String actualURL=driver.getcurrenturl()
        //if(actualURL.equals(expecteURL)){
            System.out.println("Test passed");
       // }else {
            System.out.println("Test failed");
        clicklogin.click();





    }
}
