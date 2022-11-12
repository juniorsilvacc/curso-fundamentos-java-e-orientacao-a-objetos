package Aulas.OrientacaoAObjetosP2.Abstrata;

public class Principal {
  public static void main(String[] args) {
    Produto p = new ProdutoPerecivel();
    p.descricao = "Caixa de Leite";
    
    ProdutoPerecivel pp = (ProdutoPerecivel) p;
    pp.DataValidade = "12/11/2022";

    p.imprimirDescricao();
  }
}
