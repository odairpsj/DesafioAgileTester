$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("CadastroWeb.feature");
formatter.feature({
  "line": 1,
  "name": "Cadastro Web",
  "description": "Essa features tem a funcao de fazer o cadastro do funcionario",
  "id": "cadastro-web",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Cadastro Funcionario com Sucesso",
  "description": "",
  "id": "cadastro-web;cadastro-funcionario-com-sucesso",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "que eu acesse a pagina de funcionarios",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "efetuar o cadastro do funcionario",
  "keyword": "And "
});
formatter.match({
  "location": "CadastroWeb.acessarPaginaFuncionario()"
});
formatter.result({
  "duration": 10979117800,
  "status": "passed"
});
formatter.match({
  "location": "CadastroWeb.cadastrarFuncionario()"
});
formatter.result({
  "duration": 6118600,
  "error_message": "java.lang.NullPointerException: Cannot invoke \"org.openqa.selenium.WebElement.click()\" because the return value of \"desafioAgileTester.LoginAcessoPO.getButtonCadastrase()\" is null\r\n\tat desafioAgileTester.LoginAcessoPA.clickButtonCadastrase(LoginAcessoPA.java:11)\r\n\tat stepDefinition.CadastroWeb.cadastrarFuncionario(CadastroWeb.java:31)\r\n\tat ✽.And efetuar o cadastro do funcionario(CadastroWeb.feature:6)\r\n",
  "status": "failed"
});
});