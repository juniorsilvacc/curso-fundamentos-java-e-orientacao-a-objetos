package Aulas.OrientacaoAObjetosP2.Enums;

public class Carta {
  
  private int numero;
  private Naipe naipe;

  public Carta(int numero, Naipe naipe) {
    this.numero = numero;
    this.naipe = naipe;
  }

  public void imprimirCarta(){
    System.out.println("Sou " + numero + " de " + naipe + " e tenho a cor " + naipe.getCor());
  }

}
