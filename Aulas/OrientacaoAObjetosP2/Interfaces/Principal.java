package Aulas.OrientacaoAObjetosP2.Interfaces;

public class Principal {
  public static void main(String[] args) {
    
    Imprimir i = new NotaFiscal();
    i.imprimir();

    EnviarEmail e = new NotaFiscal();
    e.enviar(" teste@hotmail.com");

    //Casting
    NotaFiscal n = (NotaFiscal) i;

    n.adicionarProduto("Adicionado");

  }
}
