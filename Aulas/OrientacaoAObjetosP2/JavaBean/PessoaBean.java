package Aulas.OrientacaoAObjetosP2.JavaBean;

public class PessoaBean {

  private String nome;
  private int idade;

  PessoaBean(String nome, int idade) {
    this.nome = nome;
    this.idade = idade;
  }

  //setters e getters
  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getNome() {
    return nome;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  public int getIdade() {
    return idade;
  }
}
