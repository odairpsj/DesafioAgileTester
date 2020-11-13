package desafioAgileTester;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginAcessoPO {


   @FindBy(xpath = "//input[contains(@name='username')]")
   private WebElement textBoxUsuario;

   @FindBy(xpath = "//input[contains(@name='pass')]")
   private WebElement textBoxSenha;

   @FindBy(xpath = "//button[contains(@class='login100-form-btn')]")
   private WebElement buttonEntre;

   @FindBy(xpath = "//a[contains(@class='txt2 bo1')]")
   private WebElement buttonCadastrase;


   public WebElement getTextBoxUsuario() {
      return textBoxUsuario;
   }

   public WebElement getTextBoxSenha() { return textBoxSenha;
   }

   public WebElement getButtonEntre() {
      return buttonEntre;
   }

   public WebElement getButtonCadastrase() {
      return buttonCadastrase;
   }


}
