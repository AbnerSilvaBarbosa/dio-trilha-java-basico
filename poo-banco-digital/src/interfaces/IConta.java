package interfaces;

public interface IConta {
    void sacar(float valor);
    void depoisitar(float valor);
    void transferir(float valor, IConta contaDestino);
    void imprimirExtrato();
}
