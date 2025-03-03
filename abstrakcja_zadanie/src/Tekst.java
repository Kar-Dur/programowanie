public class Tekst extends KomponentUI{

    Tekst(String Tekst){
        this.name=Tekst;
    }

    @Override
    public void render() {
        System.out.println("Renderowanie tekstu");
    }
}
