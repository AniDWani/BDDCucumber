package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class LoginSteps {
    WebDriver driver;

    @Given("User navigate to the BookCart Application")
    public void userNavigateToTheBookCartApplication() {
        driver = new ChromeDriver();
        driver.get("https://bookcart.azurewebsites.net/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
    }

    @And("User clicks on the login Button")
    public void userClicksOnTheLoginButton() {
        driver.findElement(By.xpath("//span[text()='Login']")).click();
    }

    @And("User enter the username as ortoni")
    public void userEnterTheUsernameAsOrtoni() {
        driver.findElement(By.cssSelector("input[formcontrolname='username']")).sendKeys("ortoni");
    }

    @And("User enter the password as pass1234")
    public void userEnterThePasswordAsPass() {
        driver.findElement(By.cssSelector("input[formcontrolname='password']")).sendKeys("pass1234");

    }

    @When("User click on the login button")
    public void userClickOnTheLoginButton() {
        driver.findElement(By.xpath("(//span[text()='Login'])[last()]/..")).click();

    }

    @Then("Login should be success")
    public void loginShouldBeSuccess() {
        String text = driver.findElement(By.xpath("//button[contains(@class,'mat-focus-indicator mat-menu-trigger')]//span[1]")).getText();

        System.out.println(text);
        driver.quit();
    }

    @Given("User enter the username as Anirrt")
    public void userEnterTheUsernameAs() {
        driver.findElement(By.cssSelector("input[formcontrolname='username']")).sendKeys("Anirrt");

    }
    @Given("User enter the password as pass125464")
    public void userEnterThePasswordAs() {
        driver.findElement(By.cssSelector("input[formcontrolname='password']")).sendKeys("pass125464");
    }

    @When("Login should fail")
    public void loginShouldFail() {
        String text = driver.findElement(By.cssSelector("mat-error[role='alert']")).getText();
        Assert.assertEquals(text.trim(), "Username or Password is incorrect.");
        driver.quit();

    }
}
