package desafioAgileTester;

import org.openqa.selenium.By;

public class CadastroFuncionarioPA {
    CadastroFuncionarioPO cadastroUsuarioPO = new CadastroFuncionarioPO();



    public void textBoxUsurario(String usuario) {
        cadastroUsuarioPO.getTextBoxUsuario().sendKeys(usuario);

    }

    public void textBoxSenha(String senha) {
        cadastroUsuarioPO.getTextBoxUsuario().sendKeys(senha);

    }

    public void textBoxConfirme(String confirmeSenha) {
        cadastroUsuarioPO.getTextBoxUsuario().sendKeys(confirmeSenha);

    }

       public void clickButtonCadastrar() {
        cadastroUsuarioPO.getButtonCadastrar().click();

    }

    public void clickButtonLogin() {
        cadastroUsuarioPO.getButtonLogin().click();
    }


}
