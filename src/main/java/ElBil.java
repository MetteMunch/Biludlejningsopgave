public class ElBil extends Bil {

    private int batterikapacitetKWh;
    private double maxKm;
    private double whPrKm;

    //Constructor
    public ElBil(String regNummer, String mærke, String model, int årgang, int antalDøre, int batterikapacitetKWh,
                 double maxKm, double whPrKm) {
        super(regNummer, mærke, model, årgang, antalDøre);
        this.batterikapacitetKWh = batterikapacitetKWh;
        this.maxKm = maxKm;
        this.whPrKm = whPrKm;
    }

    @Override
    public double beregnGrønEjerafgift() {
        double kmPrL = (100/(whPrKm/91.25));
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

    public int getBatterikapacitetKWh() {
        return batterikapacitetKWh;
    }

    public void setBatterikapacitetKWh(int batterikapacitetKWh) {
        this.batterikapacitetKWh = batterikapacitetKWh;
    }

    public double getMaxKm() {
        return maxKm;
    }

    public void setMaxKm(double maxKm) {
        this.maxKm = maxKm;
    }

    public double getWhPrKm() {
        return whPrKm;
    }

    public void setWhPrKm(double whPrKm) {
        this.whPrKm = whPrKm;
    }
}
