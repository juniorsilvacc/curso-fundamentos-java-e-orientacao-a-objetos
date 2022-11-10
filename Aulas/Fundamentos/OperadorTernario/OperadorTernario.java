package Aulas.Fundamentos.OperadorTernario;

import java.util.Scanner;

public class OperadorTernario {
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);

    System.out.print("Qual sua idade: ");
    int idade = scanner.nextInt();

    String indicacao = (idade >= 18) ? "Adulto" : "Adolescente";

    System.out.println(indicacao);
    
    scanner.close();

  }
}
