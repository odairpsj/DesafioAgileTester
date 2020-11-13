package stepDefinition;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import desafioAgileTester.CadastroFuncionarioPA;
import desafioAgileTester.LoginAcessoPA;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import utils.SetupDriver;


//import static hooks.Hook.driver;

public class CadastroWeb {
        WebDriver driver;
        LoginAcessoPA loginAcessoPA = new LoginAcessoPA();
        CadastroFuncionarioPA cadastroFuncionarioPA = new CadastroFuncionarioPA();


    @Given("^que eu acesse a pagina de funcionarios$")
    public void acessarPaginaFuncionario(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Oda\\OneDrive\\Área de Trabalho\\DesafioAgileTester\\src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://www.inmrobo.tk/accounts/login/");


    }
    @And("^efetuar o cadastro do funcionario$")
    public void cadastrarFuncionario(){
        PageFactory.initElements(driver, this);
        loginAcessoPA.clickButtonCadastrase();
        cadastroFuncionarioPA.textBoxUsurario("usuario");

    }
}
