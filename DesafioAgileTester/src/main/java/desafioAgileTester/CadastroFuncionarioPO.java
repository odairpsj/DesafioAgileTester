package desafioAgileTester;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class CadastroFuncionarioPO {

    @FindBy(xpath = "//input[contains(@name='username')]")
    private WebElement textBoxUsuario;

    @FindBy(xpath = "//input[contains(@name='pass')]")
    private WebElement textBoxSenha;

    @FindBy(xpath = "//input[contains(@name='confirmpass')]")
    private WebElement textBoxConfirmeASenha;

    @FindBy(xpath = "//input[contains(@class='login100-form-btn')]")
    private WebElement buttonCadastrar;

    @FindBy(xpath = "//a[contains(@class='txt2 bo1')]")
    private WebElement buttonLogin;


    public WebElement getTextBoxUsuario() { return textBoxUsuario;
    }

    public WebElement getTextBoxSenha() { return textBoxSenha;
    }

    public WebElement getTextBoxConfirmeASenha() { return textBoxConfirmeASenha;
    }

    public WebElement getButtonCadastrar() { return buttonCadastrar;
    }

    public WebElement getButtonLogin() { return buttonLogin;
    }
}

