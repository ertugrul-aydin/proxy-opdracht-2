public class BestandenBeheer {
    private Database database;

    public BestandenBeheer(String bestandNaam) {
        database = new ProxyDatabase(bestandNaam);
    }

    public void toonBestand(String bestandNaam) {
        database.loadFile(bestandNaam);
        System.out.println("Bestand " + bestandNaam + " wordt weergegeven.");
    }
}