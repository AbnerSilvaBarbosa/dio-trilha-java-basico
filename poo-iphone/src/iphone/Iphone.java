package iphone;

import abstraction.ReprodutorMusical;
import interfaces.AparelhoTelefonico;
import interfaces.NavegadorNaInternet;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Iphone extends ReprodutorMusical implements AparelhoTelefonico, NavegadorNaInternet {

    private boolean meLigando = false;
    private ArrayList<String> pages = new ArrayList<>();
    private String actualPage;
    @Override
    public void ligar(String  phoneNumber) throws InterruptedException {
        Random randomNumber = new Random();
        boolean atendeu = false;

        System.out.println("Ligando para: " + phoneNumber);

        for (int i = 0; i < 5; i++) {

            int number = randomNumber.nextInt(5);

            if (number == 2){
                System.out.println("Atendeu !!!");
                atendeu = true;
                break;
            }

            System.out.println("Ligando...");

            Thread.sleep(2000);
        }

        if(!atendeu){
            System.out.println("Chamada não foi atendida !!!");
        }

    }

    @Override
    public void atender() {
        if(this.meLigando){
            this.meLigando = false;
            System.out.println("Atendi a ligação");
            return;
        }

        System.out.println("Não estão me ligando !");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciado correio voz :)");
    }

    @Override
    public void exibirPagina() {
        if(this.actualPage.isEmpty()){
            System.out.println("Não tem nenhuma página no momento");
            return;
        }

        System.out.println(this.actualPage);
    }

    @Override
    public void adicionarNovaPagina(String newPage) {
        this.pages.add(newPage);
        this.actualPage = this.pages.get(this.pages.size() - 1);
        System.out.println("Nova página adicionada: " + newPage);
    }

    @Override
    public void atualizarPagina(int numberPage) {
        int lengthPages = this.pages.size();

        if(lengthPages < numberPage){
            System.out.println("É necessário ser uma página que existe !!!");
            return;
        }

        if(numberPage == 0){
            System.out.println("Á página " + this.pages.get(numberPage) + " foi atualizada com sucesso !");
            return;
        }

        System.out.println("Á página " + this.pages.get(numberPage - 1) + " foi atualizada com sucesso !");



    }
}
