package steps;

import global.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.*;

public class filter extends Base {
    List<Double> beforeSortList;
    @Given("Click filter")
    public void clickFilter() {
        List<WebElement> beforeSort = driver.findElements(By.xpath("//div[@class='inventory_item_price']"));

        beforeSortList = new ArrayList<>();

        for(WebElement p : beforeSort) {
            beforeSortList.add(Double.valueOf(p.getText().replace("$", "")));
        }
        driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div[2]/span/select")).click();
    }

    @When("Select low to high")
    public void selectLowToHigh() {
        driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div[2]/span/select/option[3]")).click();
    }

    @Then("Filter success")
    public void filterSuccess() {
        List<WebElement> afterSort = driver.findElements(By.xpath("//div[@class='inventory_item_price']"));

        List<Double> afterSortList = new ArrayList<>();

        for(WebElement p : afterSort) {
            afterSortList.add(Double.valueOf(p.getText().replace("$", "")));
        }
        Collections.sort(beforeSortList);
        Assert.assertEquals(beforeSortList, afterSortList);
    }
}
