package Aulas.Fundamentos.EstruturaDeControleSwitch;

import java.util.Scanner;

public class EstruturaDeControleSwitch {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Digite o final da sua placa: ");
    int finalPlaca = scanner.nextInt();

    switch (finalPlaca) {
      case 1:
        System.out.print("Vencimaneto 12 de Jandeiro");
        break;
      case 2:
        System.out.print("Vencimaneto 12 de Feverreiro");
        break;
      case 3:
        System.out.print("Vencimaneto 12 de Março");
        break;
      case 4:
        System.out.print("Vencimaneto 12 de Abril");
        break;
      default:
        System.out.println("Placa invalida");
        break;
    }

    scanner.close();
  }
}
