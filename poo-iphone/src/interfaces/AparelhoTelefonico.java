package interfaces;

public interface AparelhoTelefonico {
    void ligar(String phoneNumber) throws InterruptedException;
    void atender();
    void iniciarCorreioVoz();
}
