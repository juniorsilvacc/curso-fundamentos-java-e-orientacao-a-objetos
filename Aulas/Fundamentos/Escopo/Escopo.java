package Aulas.Fundamentos.Escopo;

import java.util.Scanner;

public class Escopo {
  
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);

    System.out.print("Qual sua idade: ");
    int idade = scanner.nextInt();

    boolean permissao = idade >= 18;
    String nomePai = "";

    if(!permissao) {
      System.out.print("Qual nome do seu pai? ");
      nomePai = scanner.next();
    }

    System.out.println("Pode dirigir? ");

    if(permissao) {
      System.out.println("Sim, claro");
    } else {
      System.out.println("Não tem permissão para dirigir, se fizer isso o " + nomePai + " vai preso");
    }

    scanner.close();

  }

}
