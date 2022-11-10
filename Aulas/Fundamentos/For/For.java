package Aulas.Fundamentos.For;

import java.util.Scanner;

public class For {
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);

    System.out.print("Último número: ");
    int numFinal = scanner.nextInt();

    //Inicio, Condição, Incremento
    for(int i = 1; i <= numFinal; i++) {
      System.out.println("Número: " + i);
    }

    scanner.close();

  }
}
