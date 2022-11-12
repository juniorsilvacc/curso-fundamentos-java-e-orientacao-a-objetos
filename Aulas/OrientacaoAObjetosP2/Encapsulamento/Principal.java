package Aulas.OrientacaoAObjetosP2.Encapsulamento;

public class Principal {
  public static void main(String[] args) {
    
    ArCondicionado arCondicionado = new ArCondicionado();

    arCondicionado.setTemperatura(21);
    System.out.println("Temperatura do ambiente em " + arCondicionado.getTemperatura() + "º");

    arCondicionado.setTemperatura(24);
    System.out.println("Temperatura do ambiente em " + arCondicionado.getTemperatura() + "º");

    // arCondicionado.temperatura = 10;
    // System.out.println("Temperatura do ambiente em " + arCondicionado.getTemperatura() + "º");
    
  }
}
