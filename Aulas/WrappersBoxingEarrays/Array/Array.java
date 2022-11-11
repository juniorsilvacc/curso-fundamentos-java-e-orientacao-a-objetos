package Aulas.WrappersBoxingEarrays.Array;

public class Array {
  public static void main(String[] args) {

    // Carro[] carro = new Carro();
    
    int[] notas = new int[4];
    notas[0] = 20;
    notas[1] = 30;
    notas[2] = 40;
    notas[3] = 50;

    for(int i = 0; i < notas.length; i++) {
      System.out.println(notas[i]);
    }

  }
}
