package project;

public class ControleRemoto implements Controlador {
  private int volume;
  private boolean ligado;
  private boolean tocando;

  public ControleRemoto() {
    volume = 50;
    ligado = false;
    tocando = false;
  }

  private int getVolume() {
    return this.volume;
  }

  private void setVolume(int volume) {
    this.volume = volume;
  }

  private boolean isLigado() {
    return this.ligado;
  }

  private boolean getLigado() {
    return this.ligado;
  }

  private void setLigado(boolean ligado) {
    this.ligado = ligado;
  }

  private boolean isTocando() {
    return this.tocando;
  }

  private boolean getTocando() {
    return this.tocando;
  }

  private void setTocando(boolean tocando) {
    this.tocando = tocando;
  }

  @Override
  public void ligar() {
    this.setLigado(true);
    this.setTocando(true);
  }

  @Override
  public void desligar() {
    this.setLigado(false);
  }

  @Override
  public void abrirMenu() {
    if (this.getLigado()) {
      System.out.println("--------Menu--------");
      System.out.println("Está ligado? " + this.getLigado());
      System.out.println("Está tocando? " + this.getTocando());
      System.out.print("Volume: " + this.getVolume());
      for (int i = 0; i < this.getVolume(); i += 10) {
        System.out.print("|");
      }
    } else {
      System.out.println("Menu não pode abrir pois o aparelho desligado...");
    }
  }

  @Override
  public void fecharMenu() {
    if (this.getLigado()) {
      System.out.println("\n-----Fechando o Menu-----");
    }
  }

  @Override
  public void maisVolume() {
   
    if (this.getLigado() && getVolume() <= 95) {
      this.setVolume(this.getVolume() + 5);
    } else if (this.getVolume() >= 100) {
      setVolume(100);
      System.out.println("O volume não pode mais ser aumentado pois o aparelho esta no volume maxímo...");
    } else {
      System.out.println("O volume não pode ser aumentado pois o aparelho desligado...");
    }
  }

  @Override
  public void menosVolume() {
    if (this.getLigado() && this.getVolume() >= 5) {
      this.setVolume(this.getVolume() - 5);
    } else if (this.getVolume() <= 0) {
      setVolume(0);
      System.out.println("O volume não pode ser dimiduido pois o aparelho não emite mais som...");
    } else {
      System.out.println("O volume não pode ser dimiduido pois o aparelho desligado...");
    }
  }

  @Override
  public void ligarMudo() {
    if (this.getLigado() && this.getVolume() > 0) {
      this.setVolume(0);
    } else {
      System.out.println("Não se sabe se o aparelho pode entrar ou não no mudo pois o aparelho desligado...");
    }
  }

  @Override
  public void desligarMudo() {
    if (this.getLigado() && this.getVolume() == 0) {
      this.setVolume(50);
    } else {
      System.out.println("Não se sabe se o aparelho pode sair ou não no mudo pois o aparelho desligado");
    }
  }

  @Override
  public void play() {
    if (this.getLigado() && !(this.getTocando())) {
      this.setTocando(true);
    } else {
      System.out.println("O aparelho não pode dar play pois esta desligado...");
    }
  }

  @Override
  public void pause() {
    if (this.getLigado() && this.getTocando()) {
      this.setTocando(false);
    } else {
      System.out.println("O aparelho não pode dar pause pois esta desligado...");
    }
  }
}