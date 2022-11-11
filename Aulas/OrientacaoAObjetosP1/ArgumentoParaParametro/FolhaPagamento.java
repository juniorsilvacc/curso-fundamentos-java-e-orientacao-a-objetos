package Aulas.OrientacaoAObjetosP1.ArgumentoParaParametro;

public class FolhaPagamento {

  // Calcular int, int, double, double
  double calcularSalario(int horasNormais, int horasExtras, double valorHorasNormais, double valorHorasExtras) {
    double valorNormais = horasNormais + valorHorasNormais;
    double valorExtras = horasExtras + valorHorasExtras;

    return valorNormais + valorExtras;
  }
  
}
