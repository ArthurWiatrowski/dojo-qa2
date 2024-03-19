package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import Hooks.Hook.*;

public class CadastroPage {
    public CadastroPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[2]")
    public WebElement botaoPim;

    @FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[3]")
    public WebElement botaoAddEmploye;

    @FindBy(how = How.NAME, using = "firstName")
    public WebElement campoFirstName;

    @FindBy(how = How.NAME, using = "middleName")
    public WebElement campoMiddleName;

    @FindBy(how = How.NAME, using = "lastName")
    public WebElement campoLastName;

    @FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]")
    public WebElement botaoSave;

    @FindBy(how = How.NAME, using = "//*[@id=\"oxd-toaster_1\"]/div/div[2]/div")
    public WebElement mensagemSucesso;


}
