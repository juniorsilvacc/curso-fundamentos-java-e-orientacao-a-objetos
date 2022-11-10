package Aulas.Fundamentos.EstruturaDeControleIfEElse;

import java.util.Scanner;

public class EstruturaDeControleIfEElse {
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);

    System.out.print("Nome: ");
    String nome = scanner.nextLine();

    System.out.print("Peso: ");
    int peso = scanner.nextInt();

    System.out.print("Altura: ");
    double altura = scanner.nextDouble();

    double imc = peso / (altura * altura);

    System.out.println("IMC de " + nome + ": " + imc);

    if(imc < 18.5) {
      System.out.println("Abaixo do peso ideal");
    } else if (imc > 18.5 && imc < 24.9) {
      System.out.println("Peso normal");
    } else if (imc > 25 && imc < 29.9) {
      System.out.println("Excesso de peso");
    } else if (imc > 30 && imc < 34.9) {
      System.out.println("Obessidade classe I");
    } else if (imc > 35 && imc < 39.9) {
      System.out.println("Obessidade classe II");
    } else {
      System.out.println("Obessidade classe III");
    }

    scanner.close();
  }
}
