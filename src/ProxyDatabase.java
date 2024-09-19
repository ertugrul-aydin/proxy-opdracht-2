public class ProxyDatabase implements Database {
    private EchteDatabase echteDatabase;
    private String bestandNaam;

    public ProxyDatabase(String bestandNaam) {
        this.bestandNaam = bestandNaam;
    }

    public void loadFile(String fileName) {
        if (echteDatabase == null) {
            echteDatabase = new EchteDatabase(); 
        }
        echteDatabase.loadFile(fileName);
    }
}