package Aulas.OrientacaoAObjetosP2.Enums;

public class PrincipalOperacao {
  public static void main(String[] args) {
    
    Operacao a1 = Operacao.ADICAO;
    int resul = a1.operacao(2, 3);

    System.out.println(resul);

    // for avançado
    for(Operacao oa : Operacao.values()) {
      System.out.println(oa + " -> " + oa.operacao(4, 2));
    }

  }
}
