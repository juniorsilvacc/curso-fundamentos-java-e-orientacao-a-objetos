package Aulas.Fundamentos.OperadoresDeComparacaoEIgualdade;

public class OperadoresDeComparacaoEIgualdade {
  public static void main(String[] args) {
    
    // Comparação: > (maior), >= (maior ou igual), < (menor), <= (menor ou igual)
		// Igualdade: == (igual) e != (diferente)
		
		int a = 10;
		int b = 5;
		int c = 2;
    boolean bloquedo = false;
		
		boolean maior = b > a;
		boolean maiorOuIgual = b >= a;
		boolean menor = a < b;
		boolean menorOuIgual = a <= 10;
		boolean igual = a == b - c;
		boolean diferente = a != c;
    bloquedo = !bloquedo;
		
		System.out.println(maior); // false
		System.out.println(maiorOuIgual); // false
		System.out.println(menor); // false
		System.out.println(menorOuIgual); // true
		System.out.println(igual); // false
		System.out.println(diferente); // true
    System.out.println(bloquedo); // true
		
  }
}
