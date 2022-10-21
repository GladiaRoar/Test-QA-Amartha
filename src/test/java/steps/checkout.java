package steps;

import global.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class checkout extends Base {
    String nameOfProduct;
    String priceOfProduct;
    @Given("Click continue shopping")
    public void clickContinueShopping() {
        driver.findElement(By.xpath("//*[@id=\"continue-shopping\"]")).click();
    }

    @And("Click Add To Cart")
    public void clickAddToCart() {
        nameOfProduct = driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div")).getText();
        priceOfProduct = driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[2]/div[2]/div")).getText();
        driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();
    }

    @When("Click Cart")
    public void clickCart() {
        driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
    }

    @Then("Validate cart")
    public void validateCart() {
        String cartProduct = driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div")).getText();
        String cartPrice = driver.findElement(By.xpath("//*[@id=\"cart_contents_container\"]/div/div[1]/div[3]/div[2]/div[2]/div")).getText();
        Assert.assertEquals(cartPrice, priceOfProduct);
        Assert.assertEquals(cartProduct, nameOfProduct);
    }
}
