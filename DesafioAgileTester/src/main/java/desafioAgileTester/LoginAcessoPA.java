package desafioAgileTester;

public class LoginAcessoPA {
    LoginAcessoPO loginAcessoPO = new LoginAcessoPO();

    public void clickButtonEntre() {
       loginAcessoPO.getButtonEntre().click();
    }

    public void clickButtonCadastrase() {
        loginAcessoPO.getButtonCadastrase().click();

    }

    public void typeUsuario(String usuario){
        loginAcessoPO.getTextBoxUsuario().sendKeys(usuario);

    }

    public void typeSenha(String senha){
        loginAcessoPO.getTextBoxSenha().sendKeys(senha);  }

}
