package SwagLabsTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

public class PomocnaKlasa {
    WebDriver driver = new ChromeDriver();
    String baseUrl = "https://www.saucedemo.com/";
    String driverPath = "C:\\Users\\joka\\Downloads\\chromedriver_win32//chromedriver.exe";

    @BeforeTest (alwaysRun = true)
    public void PokreniChrome() {
        System.out.print("Pokreni Chrome");
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver.manage().window().maximize();
        driver.get(baseUrl);

    }


    @AfterTest (alwaysRun = true)
    public void ZatvoriChrome() {
        driver.quit();
    }

}
