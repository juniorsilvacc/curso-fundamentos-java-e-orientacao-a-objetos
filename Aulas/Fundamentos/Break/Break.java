package Aulas.Fundamentos.Break;

import java.util.Scanner;

public class Break {
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite um número: ");
    int entrada = scanner.nextInt();

    //Inicio, Condição, Incremento
    for(int i = 1; i <= entrada; i++) {
      System.out.println("Número: " + i);

      if(i == 50) {
        System.out.println("Fim do laço");
        break;
      }

      
    }

    scanner.close();

  }
}
