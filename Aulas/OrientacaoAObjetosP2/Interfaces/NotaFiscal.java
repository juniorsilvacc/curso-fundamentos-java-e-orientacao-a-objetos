package Aulas.OrientacaoAObjetosP2.Interfaces;

public class NotaFiscal implements Imprimir, EnviarEmail {

  @Override
  public void imprimir() {
    //Aqui vai nossa implementação
    System.out.println("Vamos imprimir essa nota fiscal");
  }

  public void adicionarProduto(String produto) {
    System.out.println("Adicionando produto");
  }

  @Override
  public void enviar(String email) {
    System.out.println("Enviar Email: " + email);
  }
  
}
