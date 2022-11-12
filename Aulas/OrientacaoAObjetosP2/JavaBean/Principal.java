package Aulas.OrientacaoAObjetosP2.JavaBean;

public class Principal {
  public static void main(String[] args) {
    PessoaBean pessoa = new PessoaBean("Junior", 26);

    System.out.println("Nome: " + pessoa.getNome() + " - " + "Idade: " + pessoa.getIdade());
  }
}
