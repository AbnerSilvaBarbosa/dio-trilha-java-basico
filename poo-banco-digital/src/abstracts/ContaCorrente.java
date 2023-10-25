package abstracts;

import classes.Cliente;
import interfaces.IConta;

public abstract class ContaCorrente implements IConta {

    private float extrato;
    private Cliente cliente;

    public ContaCorrente(Cliente cliente){
        this.cliente = cliente;
        System.out.println("Conta criada com sucesso !");
    }

    @Override
    public void depoisitar(float valor) {
        if(valor < 0){
            System.out.println("É necesaŕio que o valor seja acima de 0");
            return;
        }

        this.extrato += valor;
        System.out.println("Transferencia recebida de " + "R$" + valor );
    }

    @Override
    public void sacar(float valor) {
        if(valor > this.extrato){
            System.out.println("Saldo indisponivel para saque !!");
            return;
        }

        this.extrato -= valor;
        System.out.println("Valor " + "R$" + valor + " retirado com sucesso !");

    }

    @Override
    public void transferir(float valor, IConta contaDestino) {
        if(valor > this.extrato){
            System.out.println("Saldo indisponivel para saque !!");
            return;
        }
        this.extrato -= valor;
        contaDestino.depoisitar(valor);

        System.out.println("Transferencia de " + "R$" + valor + " realizado com sucesso !");


    }

    @Override
    public void imprimirExtrato() {
        System.out.println(this.cliente.getName());
        System.out.println("Conta Corrente: " + "R$" + this.extrato);

    }
}
