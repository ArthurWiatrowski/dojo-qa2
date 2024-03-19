package Steps;
import PageObjects.CadastroPage;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.By;


import static Hooks.Hook.driver;
import static Hooks.Hook.wait;
public class CadastroSteps {
    CadastroPage cadastro;

    @E("que va para a aba de cadastro de funcionario")
    public void abaCadastro() throws InterruptedException{
        cadastro = new CadastroPage(driver);

        Thread.sleep(2000);
        cadastro.botaoPim.click();
        Thread.sleep(1000);
        cadastro.botaoAddEmploye.click();
    }

    @E("que ele preencha dados validos")
    public void preencheDados() throws InterruptedException{
        Thread.sleep(2000);
        cadastro.campoFirstName.sendKeys("Arthur");
        cadastro.campoMiddleName.sendKeys("da Silva");
        cadastro.campoLastName.sendKeys("Wiatrowski");
    }
    @Quando("clicar em Save")
    public void salvar(){
        cadastro.botaoSave.click();
    }

    @Entao("O sistema exibe uma mensagem de sucesso")
    public void sucesso() throws Exception {
//       if(!driver.getCurrentUrl().equals("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login")){
//           throw new Exception("Erro ao cadastrar usuario");
//       }

       WebElement elemento =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"oxd-toaster_1\"]/div/div[2]/div")));
       String texto = elemento.getText();
    }
}
