package Hooks;

import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Hook {
    public static WebDriver driver;
    public static WebDriverWait wait;

    @BeforeAll
    public static void beforeAll(){
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(6));
        System.out.println("teste");

    }

    @Before
    public void before(Scenario cenario) {
        System.out.println("teste");
    }

    @AfterAll
    public static void afterAll(){
        driver.quit();
    }
}
