package Aulas.OrientacaoAObjetosP1.ComposicaoObjetos;

public class Principal {
  public static void main(String[] args) {

    Proprietario dono = new Proprietario();
    dono.nome = "Junior";
    dono.idade = 26;
    dono.logradouro = "Rua José";
    dono.cidade = "SP";
    dono.bairro = "Centro";
    
    Carro carro = new Carro();
    carro.modelo = "Sport";
    carro.fabricante = "Audi";
    carro.cor = "Preto";
    carro.anoDeFabricacao = 2022;
    carro.dono = dono;

  }
}
