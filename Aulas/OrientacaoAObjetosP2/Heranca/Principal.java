package Aulas.OrientacaoAObjetosP2.Heranca;

public class Principal {
  public static void main(String[] args) {
    Jogador j = new Jogador();
    j.nome = "Junior";
    j.idade = 26;
    j.aindaJoga = true;

    j.apresentar();
    j.seAindaJoga();
  }
}
