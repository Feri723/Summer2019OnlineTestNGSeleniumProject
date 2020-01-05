package tests.BasicNavigationtestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.BrowserFactory;
import utils.StringUtility;

public class TestCaseTwo {
    public static void main(String[] args) {
        WebDriver driver= BrowserFactory.getDriver("chrome");
        driver.get("https://practice-cybertekschool.herokuapp.com");
int expectedResult=48;

int actualResult=driver.findElements(By.className("list-group-item")).size();
System.out.println("expected Result "+ expectedResult);
System.out.println("actual Result "+ actualResult);
        StringUtility.verifyEquals(expectedResult,actualResult);


        driver.close();
    }
}
