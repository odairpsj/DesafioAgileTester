package desafioAgileTester;

public class FuncionarioPA {
    FuncionarioPO funcionarioPO = new FuncionarioPO();



    public void buttonDelete() {
        funcionarioPO.getButtonDelete().click();

    }

    public void textBoxNome(String nome) {
        funcionarioPO.getTextBoxNome().sendKeys(nome);

    }

    public void textBoxCPF(String CPF) {
        funcionarioPO.getTextBoxCPF().sendKeys(CPF);

    }


    public void textBoxCargo(String Cargo) {
        funcionarioPO.getTextBoxCargo().sendKeys(Cargo);

    }


    public void textBoxSalario(String salario) {
        funcionarioPO.getTextBoxSalario().sendKeys(salario);

    }

    public void textBoxSexo(String sexo) {
        funcionarioPO.getTextBoxSexo().sendKeys(sexo);

    }

    public void radioButtonTipoDeContratacaoCLT () {
        funcionarioPO.getRadioButtonTipoDeContratacaoCLT();

    }


    public void radioButtonTipoDeContratacaoPJ () {
        funcionarioPO.getRadioButtonTipoDeContratacaoPJ();

    }

    public void textBoxAdmissao(String admissao) {
        funcionarioPO.getTextboxAdmissao().sendKeys(admissao);

    }

}
