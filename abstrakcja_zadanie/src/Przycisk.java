public class Przycisk extends KomponentUI{

    Przycisk(String przycisk){
        this.name=przycisk;
    }

    @Override
    public void render() {
        System.out.println("Renderowanie przycisku");
    }
}
