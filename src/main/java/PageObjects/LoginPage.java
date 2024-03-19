package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LoginPage {
    public LoginPage(WebDriver driver) {PageFactory.initElements(driver, this);}
    @FindBy(how = How.NAME, using = "username")
    public WebElement campoUsuario;

    @FindBy(how = How.NAME, using = "password")
    public WebElement campoSenha;

    @FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
    public WebElement botaoLogin;

    @FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span")
    public WebElement botaoMenu;


}
