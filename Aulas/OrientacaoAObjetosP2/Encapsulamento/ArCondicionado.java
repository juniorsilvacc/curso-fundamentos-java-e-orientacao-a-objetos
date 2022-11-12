package Aulas.OrientacaoAObjetosP2.Encapsulamento;

public class ArCondicionado {

  private int temperatura;

  public void setTemperatura(int temperatura) {
    if(temperatura >= 17 && temperatura <= 25) {
      this.temperatura = temperatura;
    }
  }

  public int getTemperatura() {
    return temperatura;
  }
  
}
