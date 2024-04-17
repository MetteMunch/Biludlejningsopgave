abstract class Bil {


    private String regNummer;
    private String mærke;
    private String model;
    private int årgang;
    private int antalDøre;

    //Constructor
    public Bil(String regNummer, String mærke, String model, int årgang, int antalDøre){
        this.regNummer = regNummer;
        this.mærke = mærke;
        this.model = model;
        this.årgang = årgang;
        this.antalDøre = antalDøre;
    }

    public abstract double beregnGrønEjerafgift();


    //getter og setters

    public String getRegNummer() {
        return regNummer;
    }

    public void setRegNummer(String regNummer) {
        this.regNummer = regNummer;
    }

    public String getMærke() {
        return mærke;
    }

    public void setMærke(String mærke) {
        this.mærke = mærke;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getÅrgang() {
        return årgang;
    }

    public void setÅrgang(int årgang) {
        this.årgang = årgang;
    }

    public int getAntalDøre() {
        return antalDøre;
    }

    public void setAntalDøre(int antalDøre) {
        this.antalDøre = antalDøre;
    }
}
