package Aulas.OrientacaoAObjetosP1.VariaveisRefereciamObjetos;

public class Principal {
  public static void main(String[] args) {
    
    Proprietario dono = new Proprietario();
    dono.nome = "Junior";

    Carro meuCarro = new Carro();
    meuCarro.modelo = "FIAT";
    meuCarro.dono = dono;

    System.out.println("meuCarro.dono.nome = " + meuCarro.dono.nome);

  }
}
