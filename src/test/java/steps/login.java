package steps;

import global.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login extends Base {
    @Given("Open web")
    public void openWeb() {
        webOpen();
    }

    @And("Input username")
    public void inputUsername() {
        driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
    }

    @And("Input password")
    public void inputPassword() {
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
    }

    @When("Click login")
    public void clickLogin() {
        driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
    }

    @Then("Login success")
    public void loginSuccess() {
        String result = driver.getTitle();
        Assert.assertEquals(result, "Swag Labs");

    }
}
