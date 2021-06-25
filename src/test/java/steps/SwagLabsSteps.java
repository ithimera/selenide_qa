package steps;

import com.codeborne.selenide.Condition;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.title;

public class SwagLabsSteps {
    @Given("^User opens Chrome$")
    public void userOpensChrome() {
        open("https://www.saucedemo.com/");
    }

    @And("User is on login page")
    public void userIsOnLoginPage() {
        title().equals("Swag Labs");
    }

    @Then("User enters his username")
    public void userEntersHisUsername() {
        $(By.id("user-name")).shouldBe(Condition.visible);
        $(By.id("user-name")).sendKeys("standard_user");
    }

    @And("User enters his password")
    public void userEntersHisPassword() {
        $(By.id("password")).shouldBe(Condition.visible);
        $(By.id("password")).sendKeys("secret_sauce");
    }

    @And("User clicks on login")
    public void userClicksOnLogin() {
        $(By.id("login-button")).click();
    }

    @Then("Swag shop page is displayed")
    public void swagShopPageIsDisplayed() {
        $(By.id("item_4_img_link")).shouldBe(Condition.visible);
    }
}
