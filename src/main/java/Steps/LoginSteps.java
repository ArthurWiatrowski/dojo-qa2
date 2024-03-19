package Steps;

import PageObjects.LoginPage;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static Hooks.Hook.driver;
import static Hooks.Hook.wait;

public class LoginSteps {
    public LoginPage page;

    @Dado("que o usuario esteja na tela de login")
    public void telaLogin() throws InterruptedException {
        page = new LoginPage(driver);

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(3000);
    }

    @E("que ele envie dados validos")
    public void enviaDados() {
        page.campoUsuario.sendKeys("Admin");
        page.campoSenha.sendKeys("admin123");
    }

    @Quando("ele clicar em Login")
    public void fazLogin() {
        page.botaoLogin.click();
    }

    @Entao("o sistema faz o login")
    public void verificaTeste() throws InterruptedException {
        Thread.sleep(3000);
        page.botaoMenu.click();
    }

}
