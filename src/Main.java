public class Main {
    public static void main(String[] args) {
        BestandenBeheer beheer1 = new BestandenBeheer("grote_bestand1.jpg");
        BestandenBeheer beheer2 = new BestandenBeheer("grote_bestand2.jpg");

        // Bestanden worden pas geladen wanneer de gebruiker ze wil weergeven.
        beheer1.toonBestand("grote_bestand1.jpg");
        beheer2.toonBestand("grote_bestand2.jpg");
    }
}