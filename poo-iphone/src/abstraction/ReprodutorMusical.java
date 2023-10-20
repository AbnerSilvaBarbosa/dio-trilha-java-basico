package abstraction;

public abstract class ReprodutorMusical {

    private boolean isPlays;
    private String music;
    public void tocar(){
        isPlays = true;
        System.out.println("Tocando musica !");
    }

    public void pausar(){
        isPlays = false;
        System.out.println("Musica pausada !");
    }

    public void selectMusic(String musicSelected){
        music = musicSelected;
        System.out.println("Musica selecionada no momento: " + musicSelected);
    }
}
