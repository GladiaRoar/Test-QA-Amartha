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

public class validate extends Base {
    String title;
    String banner;
    @Given("Get text title")
    public void getTextTitle() {
        title = driver.getTitle();
    }

    @And("Get text banner")
    public void getTextBanner() {
        banner = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span")).getText();
    }

    @When("Validate")
    public void validate() {
        Assert.assertEquals(title, "Swag Labs");
        Assert.assertEquals(banner, "PRODUCTS");
    }

    @Then("Validate success")
    public void validateSuccess() {
        System.out.println("Validate Success");
    }
}
