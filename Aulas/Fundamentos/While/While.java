package Aulas.Fundamentos.While;

import java.util.Scanner;

public class While {
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite o número inicial: ");
    int numInic = scanner.nextInt();

    System.out.print("Digite o número final: ");
    int numFin = scanner.nextInt();

    while (numInic  <= numFin) {
      System.out.println(numInic);
      numInic++;
    }

    System.out.print("Fim");

    scanner.close();

  }
}
