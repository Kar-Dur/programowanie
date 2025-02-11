class Administrator extends Uzytkownik {
    @Override
    String PoziomDostepu() {
        return "Pełne uprawnienia";
    }
}
