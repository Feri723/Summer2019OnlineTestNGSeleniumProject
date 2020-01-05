package tests.BasicNavigationtestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.BrowserFactory;
import utils.StringUtility;

public class testCaseFour {
    /*
    Step 1. Go to https://practice-cybertekschool.herokuapp.com
    2. Click on “Registration Form”Step
    3. Enter “123” into first name input box.Step
    4. Verify that warning message is displayed:
     “first name can only consist of alphabetical letters”
     */

    public static void main(String[] args) {
        WebDriver driver= BrowserFactory.getDriver("chrome");
        driver.get("https://practice-cybertekschool.herokuapp.com");
        String expectedWarningMessage= "first name can only consist of alphabetical letters";
        driver.findElement(By.linkText("Registration Form")).click();
        driver.findElement(By.name("firstname")).sendKeys("123");
      driver.findElement(By.cssSelector("small[class='help-block']"));
        String actualResult = driver.findElement(By.cssSelector("small[class='help-block']")).getText();

        System.out.println("expected Result "+ expectedWarningMessage);
        System.out.println("actual Result "+ actualResult);
        StringUtility.verifyEquals(expectedWarningMessage,actualResult);
        driver.close();

    }
}


