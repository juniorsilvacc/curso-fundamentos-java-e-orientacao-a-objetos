package Aulas.OrientacaoAObjetosP2.Construtores;

public class Principal {
  public static void main(String[] args) {
    Pessoa pessoa1 = new Pessoa("Junior");
    System.out.println("Nome: " + pessoa1.nome + " - " + "idade: " + pessoa1.idade);

    Pessoa pessoa2 = new Pessoa("Leontina", 24);
    System.out.println("Nome: " + pessoa2.nome + " - " + "idade: " + pessoa2.idade);
  }
}
