package Aulas.OrientacaoAObjetosP2.This;

public class Principal {
  public static void main(String[] args) {
    Carro carro = new Carro();
    carro.modelo = "FIAT";

    System.out.println("Modelo antes: " + carro.modelo);

    carro.alterarModelo("Pálio");

    System.out.println("Modelo depois: " + carro.modelo);
  }
}
