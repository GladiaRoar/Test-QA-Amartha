package steps;

import global.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class validateChart extends Base{
    String title;
    @Given("Click chart")
    public void clickChart() {
        driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
    }

    @When("validate")
    public void validate() {
        title = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span")).getText();
   }

    @Then("validate success and back to home")
    public void validateSuccessAndBackToHome() {
        Assert.assertEquals(title, "YOUR CART");
    }
}
