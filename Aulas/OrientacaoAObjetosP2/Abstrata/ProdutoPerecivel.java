package Aulas.OrientacaoAObjetosP2.Abstrata;

public class ProdutoPerecivel extends Produto {

  String descricao;
  String DataValidade;

  public void imprimirDescricao() {
    //Digitar a lógica...
    System.out.println("Descrição: " + super.getDescricao() + " " + ". Vencendo em: " + DataValidade);
  }
  
}
