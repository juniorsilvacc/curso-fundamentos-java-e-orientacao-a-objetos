package Aulas.OrientacaoAObjetosP2.ModificarStatic;

public class Principal {
  public static void main(String[] args) {
    
    Contador c = new Contador();
    c.incrementar();

    // System.out.println("Valor do count: " + Contador.COUNT);

    Contador.COUNT++;
    // System.out.println(Contador.COUNT);

    Contador.imprimirContador();
  }
}
