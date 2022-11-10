package Aulas.Fundamentos.OperadoresLogicos;

import java.util.Scanner;

public class OperadoresLogicos {
  public static void main(String[] args) {
   
    Scanner scanner = new Scanner(System.in);

    System.out.print("Peso: ");
    int peso = scanner.nextInt();

    System.out.print("Altura: ");
    double altura = scanner.nextDouble();

    System.out.print("Sexo: ('1' p/ MASCULINO - '2' p/ FEMININO): ");
    char sexo = scanner.nextShort() == 1 ? 'M' : 'F';

    double imc = peso / (altura * altura);

    if((sexo == 'F' && imc < 19.1) || (sexo == 'M' && imc < 20.7)) {
      System.out.println("Peso abaixo da média");
    } else if ((sexo == 'F' && imc < 25.8) || (sexo == 'M' && imc < 26.4)) {
      System.out.println("Peso ideal");
    } else if ((sexo == 'F' && imc < 27.3) || (sexo == 'M' && imc < 27.8)) {
      System.out.println("Um pouco a cima do peso");
    }

    System.out.println("IMC: " + imc);

    scanner.close();
    
  }
}
