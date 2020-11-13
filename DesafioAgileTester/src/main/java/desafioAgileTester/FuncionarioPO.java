package desafioAgileTester;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class FuncionarioPO {

    @FindBy(xpath = "//input[contains(@id='delete')]")
    private WebElement buttonDelete;

    @FindBy(xpath = "//input[contains(@class='fa fa-pencil')]")
    private WebElement buttonEdit;

    @FindBy(xpath = "//input[contains(@id='inputNome')]")
    private WebElement textBoxNome;

    @FindBy(xpath = "//input[contains(@id='cpf')]")
    private WebElement textBoxCPF;

    @FindBy(xpath = "//a[contains(@id='inputCargo")
    private WebElement textBoxCargo;

    @FindBy(xpath = "//a[contains(@class='wrap-input100 validate-input")
    private WebElement textBoxSalario;

    @FindBy(xpath = "//a[contains(@id='slctSexo")
    private WebElement textBoxSexo;

    @FindBy(xpath = "//a[contains(@id='clt")
    private WebElement radioButtonTipoDeContratacaoCLT;

    @FindBy(xpath = "//a[contains(@id='pj")
    private WebElement radioButtonTipoDeContratacaoPJ;

    @FindBy(xpath = "//a[contains(@id='inputAdmissao")
    private WebElement textboxAdmissao;

    @FindBy(xpath = "//a[contains(@class='cadastrar-form-btn")
    private WebElement buttonEnviar;

    @FindBy(xpath = "//a[contains(@class='cancelar-form-btn")
    private WebElement buttonCancelar;


    public WebElement getButtonDelete() {
        return buttonDelete;
    }

    public WebElement getButtonEdit() {
        return buttonEdit;
    }

    public WebElement getTextBoxNome() {
        return textBoxNome;
    }

    public WebElement getTextBoxCPF() {
        return textBoxCPF;
    }

    public WebElement getTextBoxCargo() {
        return textBoxCargo;
    }

    public WebElement getTextBoxSalario() {
        return textBoxSalario;
    }

    public WebElement getTextBoxSexo() {
        return textBoxSexo;
    }

    public WebElement getRadioButtonTipoDeContratacaoCLT() {
        return radioButtonTipoDeContratacaoCLT;
    }

    public WebElement getRadioButtonTipoDeContratacaoPJ() {
        return radioButtonTipoDeContratacaoPJ;
    }

    public WebElement getTextboxAdmissao() {
        return textboxAdmissao;
    }

    public WebElement getButtonEnviar() {
        return buttonEnviar;
    }

    public WebElement getButtonCancelar() {
        return buttonCancelar;
    }


}

