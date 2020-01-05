package tests.BasicNavigationtestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.BrowserFactory;

public class TestCaseSix {
    /*
    Step 1. Go to https://practice-cybertekschool.herokuapp.comS
    2. Click on “Registration Form”Step
    3. Enter “user” into username input box.Step
     4. Verify that warning message is displayed:
     “The username must be more than 6 and less than 30 characters lon
     */
    public static void main(String[] args) {
        WebDriver driver= BrowserFactory.getDriver("chrome");
        driver.get("https://practice-cybertekschool.herokuapp.com");
        driver.findElement(By.linkText("Registration Form")).click();
        driver.findElement(By.name("username")).sendKeys("user");
String expectedResult="The username must be more than 6 and less than 30 characters long";
String actualResult =driver.findElement(By.className("help-block")).getText();

System.out.println(actualResult);
if(expectedResult.equalsIgnoreCase(actualResult)){
    System.out.println("Test Passed");
}else{
    System.out.println("Test failed");
}
driver.close();
    }

}
