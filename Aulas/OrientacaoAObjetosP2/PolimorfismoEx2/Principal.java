package Aulas.OrientacaoAObjetosP2.PolimorfismoEx2;

public class Principal {
  public static void main(String[] args) {

    Transporte t = new Transporte();
    imprimirMoverTransporte(t);

    Veiculo v = new Veiculo();
    imprimirMoverTransporte(v);

    Carro c = new Carro();
    imprimirMoverTransporte(c);

  }

  public static void imprimirMoverTransporte(Transporte transporte) {
    transporte.mover();
  }
}
