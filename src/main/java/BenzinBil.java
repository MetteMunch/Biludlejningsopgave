public class BenzinBil extends Bil {

    private int oktanTal;
    private double kmPrL;

    //Constructor
    public BenzinBil(String regNummer, String mærke, String model, int årgang, int antalDøre, int oktanTal, double kmPrL) {
        super(regNummer, mærke, model, årgang, antalDøre);
        this.oktanTal = oktanTal;
        this.kmPrL = kmPrL;
    }

    @Override
    public double beregnGrønEjerafgift() {
        double beregnetResultat = 0.0;
        if(kmPrL < 5){
            beregnetResultat = 10470.00;
        }
        else if (kmPrL >= 5 && kmPrL < 10){
            beregnetResultat = 5500.00;
        }
        else if (kmPrL >= 10 && kmPrL < 15){
            beregnetResultat = 2340.00;
        }
        else if (kmPrL >= 15 && kmPrL < 20){
            beregnetResultat = 1050.00;
        } else {
            beregnetResultat = 330.00;
        }
        return beregnetResultat;
    }

    public double getKmPrL() {
        return kmPrL;
    }

    public void setKmPrL(int kmPrL) {
        this.kmPrL = kmPrL;
    }

    public int getOktanTal() {
        return oktanTal;
    }

    public void setOktanTal(int oktanTal) {
        this.oktanTal = oktanTal;
    }
}
