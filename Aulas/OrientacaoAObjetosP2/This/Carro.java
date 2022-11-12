package Aulas.OrientacaoAObjetosP2.This;

public class Carro {
  
  String modelo;
  int anoFabricacao;

  void alterarModelo(String modelo) {
    if(modelo != null) {
      this.modelo = modelo;
    }
  }

}
