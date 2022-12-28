package SwagLabsTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;

public class TC_01_VerifyProducts extends PomocnaKlasa{
    @BeforeTest
    public void Login (){
        WebElement usernameInput = driver.findElement(By.xpath("//input [@id=\"user-name\"]"));
        usernameInput.sendKeys("standard_user");
        WebElement passwordInput = driver.findElement(By.xpath("//input [@id =\"password\"]"));
        passwordInput.sendKeys("secret_sauce");
        WebElement logInButton = driver.findElement(By.xpath("//input [@id = \"login-button\"]"));
        logInButton.click();
    }
    @Test
    public void VerifyElements (){
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(2));
        WebElement products = driver.findElement(By.xpath("//*[contains(text(), \"Products\")]"));
        products.isDisplayed();
        WebElement shoppingCart = driver.findElement(By.xpath("//div [@id = \"shopping_cart_container\"]"));
        shoppingCart.isEnabled();
        WebElement twitterlink = driver.findElement(By.xpath("//*[contains(text(), \"Twitter\")]"));
        twitterlink.isDisplayed();
        WebElement facebookliknk = driver.findElement(By.xpath("//*[contains(text(), \"Facebook\")]"));
        facebookliknk.isEnabled();
        WebElement linkedinlink = driver.findElement(By.xpath("//*[contains(text(), \"LinkedIn\")]"));
        linkedinlink.isEnabled();
        WebElement burgerbutton = driver.findElement(By.xpath("//div [@class = \"bm-burger-button\"]"));
        burgerbutton.click();
        WebElement logoutButton = wait.until(elementToBeClickable(By.id("logout_sidebar_link")));
        logoutButton.click();

    }
}
