package Aulas.OrientacaoAObjetosP1.Metodos;

public class Principal {
  public static void main(String[] args) {

    Carro meuCarro = new Carro();
    meuCarro.modelo = "FIAT";

    Carro seuCarro = new Carro();
    seuCarro.modelo = "Audi";

    meuCarro.ligar();
    seuCarro.ligar();

  }
}
