package Aulas.OrientacaoAObjetosP1.AcessandoAtributosObjetos;

public class Principal {
  public static void main(String[] args) {
    
    Carro carro = new Carro();
    carro.modelo = "Sport";
    carro.fabricante = "Audi";
    carro.cor = "Preto";
    carro.anoDeFabricacao = 2022;

    System.out.println(
      "Modelo: " + carro.modelo + 
      " Fabricante: " + carro.fabricante + 
      " Cor: " + carro.cor + 
      " Fabricante: " + carro.fabricante
    );
  }
}
