package tests.BasicNavigationtestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.BrowserFactory;
import utils.StringUtility;

public class TestCaseThree {
    public static void main(String[] args) {
        chromeTest();
        fireFoxTest();


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
    }

    public static void chromeTest(){
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
    }

    public static void fireFoxTest(){
        WebDriver driver = BrowserFactory.getDriver("firefox");
        driver.get("https://practice-cybertekschool.herokuapp.com");
        String expectedResult = "Clicked on button one!";

        driver.findElement(By.linkText("Multiple Buttons")).click();
        driver.findElement(By.tagName("button")).click();


        String actualResult = driver.findElement(By.id("result")).getText();

        System.out.println("expected Result "+ expectedResult);
        System.out.println("actual Result "+ actualResult);
        StringUtility.verifyEquals(expectedResult,actualResult);
        driver.close();
    }

}