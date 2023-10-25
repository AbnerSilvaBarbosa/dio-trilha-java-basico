import classes.Banco;
import classes.Cliente;
import classes.Conta;

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();

        Cliente joao = new Cliente();
        Cliente maria = new Cliente();
        joao.setName("João");
        maria.setName("Maria");

        Conta contaJoao = new Conta(joao);
        Conta contaMaria = new Conta(maria);

        banco.setContas(contaJoao);
        banco.setContas(contaMaria);

        contaJoao.depoisitar(100);
        contaJoao.transferir(20,contaMaria);

        contaMaria.imprimirExtrato();

        contaMaria.sacar(50);

        contaMaria.imprimirExtrato();


    }
}