package SwagLabsTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class TC_02_OrderProducts extends PomocnaKlasa {
    @BeforeTest
    public void Login() {
        WebElement usernameInput = driver.findElement(By.xpath("//input [@id=\"user-name\"]"));
        usernameInput.sendKeys("standard_user");
        WebElement passwordInput = driver.findElement(By.xpath("//input [@id =\"password\"]"));
        passwordInput.sendKeys("secret_sauce");
        WebElement logInButton = driver.findElement(By.xpath("//input [@id = \"login-button\"]"));
        logInButton.click();
    }

    @Test
    public void OrderProducts() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        WebElement backpack = driver.findElement(By.id("item_4_title_link"));
        backpack.click();
        WebElement backpackTitle = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(text(), \"Sauce Labs Backpack\")]")));
        backpackTitle.isEnabled();
        WebElement price = driver.findElement(By.xpath("//*[@class=\"inventory_details_price\"]"));
        price.isEnabled();
        WebElement addToCart = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
        addToCart.click();
        WebElement backToProducts = driver.findElement(By.id("back-to-products"));
        backToProducts.click();
        WebElement jacket = wait.until(ExpectedConditions.elementToBeClickable(By.id("add-to-cart-sauce-labs-fleece-jacket")));
        jacket.click();
        WebElement shopingCart = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class = \"shopping_cart_link\"]")));
        shopingCart.click();
        WebElement checkout = wait.until(ExpectedConditions.elementToBeClickable(By.id("checkout")));
        checkout.click();
        WebElement firstname = wait.until(ExpectedConditions.elementToBeClickable(By.id("first-name")));
        firstname.sendKeys("Jovana");
        WebElement lastname = driver.findElement(By.id("last-name"));
        lastname.sendKeys("Milenkovic");
        WebElement zipcode = driver.findElement(By.id("postal-code"));
        zipcode.sendKeys("34000");
        WebElement continueButton = driver.findElement(By.id("continue"));
        continueButton.click();
        WebElement finishButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("finish")));
        finishButton.click();
        WebElement message = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(text(), \"THANK YOU\")]")));
        message.isDisplayed();
        WebElement burgerbutton = driver.findElement(By.xpath("//div [@class = \"bm-burger-button\"]"));
        burgerbutton.click();
        WebElement logoutButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("logout_sidebar_link")));
        logoutButton.click();


    }
}
