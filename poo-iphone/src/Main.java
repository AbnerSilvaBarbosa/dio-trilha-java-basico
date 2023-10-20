import iphone.Iphone;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Iphone iphone = new Iphone();
        iphone.ligar("5511942709884");
        iphone.adicionarNovaPagina("<h1>Google</h1>");
        iphone.adicionarNovaPagina("<h1>Youtube</h1>");
        iphone.atualizarPagina(1);
        iphone.exibirPagina();

        iphone.tocar();
        iphone.pausar();
        iphone.selectMusic("Bohemian Rhapsody - Queen");
    }
}