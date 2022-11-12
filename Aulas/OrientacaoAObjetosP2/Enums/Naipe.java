package Aulas.OrientacaoAObjetosP2.Enums;

public enum Naipe {
  
  OURO("Vermelho"), 
  PAUS("Preto"), 
  ESPADA("Vermelho"), 
  COPA("Preto");

  private String cor;

  Naipe(String cor){
    this.cor = cor;
  }

  public String getCor(){
    return cor;
  }

}
