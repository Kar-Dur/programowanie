class UslugaLogowania {
    void zaloguj(String nazwaUzytkownika, String haslo) {
        System.out.println("Logowanie za pomocą loginu i hasła: " + nazwaUzytkownika);
    }

    void zaloguj(String login, String email, String haslo) {
        System.out.println("Logowanie za pomocą e-maila i hasła: " + email);
    }

    void zaloguj(String nazwaUzytkownika, int token) {
        System.out.println("Logowanie za pomocą loginu i tokenu: " + nazwaUzytkownika);
    }

    void zaloguj(long numerTelefonu, String haslo) {
        System.out.println("Logowanie za pomocą numeru telefonu i hasła: " + numerTelefonu);
    }
}
