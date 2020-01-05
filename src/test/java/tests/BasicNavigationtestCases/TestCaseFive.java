package tests.BasicNavigationtestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.BrowserFactory;
import utils.StringUtility;

public class TestCaseFive {
    /*
    Step 1. Go to https://practice-cybertekschool.herokuapp.com"
    2. Click on “Registration Form”Step
    3. Enter “123” into last name input box.Step
    4. Verify that warning message is displayed:
    “The last name can only consist of alphabetical letters and dash
    WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("https://practice-cybertekschool.herokuapp.com");
        String expectedResult = "Clicked on button one!";

        driver.findElement(By.linkText("Multiple Buttons")).click();
        driver.findElement(By.tagName("button")).click();


        String actualResult = driver.findElement(By.id("result")).getText();

        System.out.println("expected Result "+ expectedResult);
        System.out.println("actual Result "+ actualResult);
        StringUtility.verifyEquals(expectedResult,actualResult);
        driver.close();
     */
    public static void main(String[] args) {
        WebDriver driver= BrowserFactory.getDriver("chrome");
        driver.get("https://practice-cybertekschool.herokuapp.com");
        String expectedResult="The last name can only consist of alphabetical letters and dash";
        driver.findElement(By.linkText("Registration Form")).click();
        driver.findElement(By.name("lastname")).sendKeys("123");

        String actualResult= driver.findElement(By.name("lastname")).getText();
        System.out.println("expected Result "+ expectedResult);
        System.out.println("actual Result "+ actualResult);
        StringUtility.verifyEquals(expectedResult,actualResult);
        driver.close();

    }
}
