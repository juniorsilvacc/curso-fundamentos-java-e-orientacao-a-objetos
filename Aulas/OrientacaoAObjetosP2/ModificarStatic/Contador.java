package Aulas.OrientacaoAObjetosP2.ModificarStatic;

public class Contador {
  
  public static int COUNT = 0;

  public void incrementar() {
    COUNT++;
  }

  public static void imprimirContador() {
    System.out.println("O valor do contador agora é: " + Contador.COUNT);
  }

}
