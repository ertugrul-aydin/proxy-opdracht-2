public class EchteDatabase implements Database {
    public EchteDatabase() {
        connect();
    }

    private void connect() {
        System.out.println("Verbinden met de database...");
    }

    public void loadFile(String fileName) {
        System.out.println("Bestand " + fileName + " wordt geladen vanuit de database.");
    }
}