package Aulas.OrientacaoAObjetosP2.Heranca;

public class Jogador extends Pessoa {

  protected boolean aindaJoga = false;

  public void seAindaJoga(){
    System.out.println("Ainda joga? " + aindaJoga);
  }
}
