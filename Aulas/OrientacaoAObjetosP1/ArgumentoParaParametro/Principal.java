package Aulas.OrientacaoAObjetosP1.ArgumentoParaParametro;

public class Principal {
  public static void main(String[] args) {
    
    FolhaPagamento folhaPagamento = new FolhaPagamento();
    double salario = folhaPagamento.calcularSalario(160, 12, 20, 32);

    System.out.println("Salário calculado: " + salario);
  }
}
