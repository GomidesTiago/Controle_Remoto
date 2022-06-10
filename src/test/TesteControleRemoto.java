package test;

import project.ControleRemoto;

public class TesteControleRemoto {
  public static void main(String[] args) {
    ControleRemoto c = new ControleRemoto();
    c.ligar();
    c.maisVolume();
    c.pause();
    c.ligarMudo();
    c.desligarMudo();
    c.abrirMenu();
    c.fecharMenu();
  }
}
