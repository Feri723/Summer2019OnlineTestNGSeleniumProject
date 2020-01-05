package tests.BasicNavigationtestCases;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.BrowserFactory;
import utils.BrowserUtils;

public class testCase1 {
    public static void main(String[] args) {

        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("https://practice-cybertekschool.herokuapp.com");

        String expectedResultOne = "Thank you for signing up. Click the button below to return to the home page.";
        String expectedResultTwo = "Home";
        WebElement SignUp = driver.findElement(By.linkText("Sign Up For Mailing List"));
        SignUp.click();
        BrowserUtils.wait(2);
        WebElement FullName = driver.findElement(By.name("full_name"));
        FullName.sendKeys("Feride");
        BrowserUtils.wait(2);
        WebElement email = driver.findElement(By.name("email"));
        email.sendKeys("ferideakar@hotmail.com");
        BrowserUtils.wait(2);
        WebElement SignUpButton = driver.findElement(By.name("wooden_spoon"));
        SignUpButton.click();

        WebElement SignUpMessage = driver.findElement(By.name("signup_message"));


        String actualresultOne = SignUpMessage.getText();
        WebElement HomeButton = driver.findElement(By.id("wooden_spoon"));
        String actualResultTwo = HomeButton.getText();

        if (expectedResultOne.equalsIgnoreCase(actualresultOne) && expectedResultTwo.equalsIgnoreCase(actualResultTwo)) {
            System.out.println("Test passed");

        } else {
            System.out.println("Test failed");


        }
        driver.close();


    }



}





