public class DieselBil extends Bil {

    private boolean harPartikelfilter;
    private double kmPrL;

    public DieselBil(String regNummer, String mærke, String model, int årgang, int antalDøre, boolean harPartikelfilter, double kmPrL) {
        super(regNummer, mærke, model, årgang, antalDøre);
        this.harPartikelfilter = harPartikelfilter;
        this.kmPrL = kmPrL;
    }

    public boolean isHarPartikelfilter() {
        return harPartikelfilter;
    }

    public void setHarPartikelfilter(boolean harPartikelfilter) {
        this.harPartikelfilter = harPartikelfilter;
    }

    public double getKmPrL() {
        return kmPrL;
    }

    public void setKmPrL(double kmPrL) {
        this.kmPrL = kmPrL;
    }

    @Override
    public double beregnGrønEjerafgift() {
        double beregnetResultat = 0.0;
        double finalResultat = 0.0;
        if (kmPrL < 5) {
            beregnetResultat = 10470.00 + 15260;
        } else if (kmPrL >= 5 && kmPrL < 10) {
            beregnetResultat = 5500.00 + 2770;
        } else if (kmPrL >= 10 && kmPrL < 15) {
            beregnetResultat = 2340.00 + 1850;
        } else if (kmPrL >= 15 && kmPrL < 20) {
            beregnetResultat = 1050.00 + 1390;
        } else {
            beregnetResultat = 330.00 + 130;
        }
        if (harPartikelfilter == false) {
            finalResultat = beregnetResultat + 1000;
        } else {
            finalResultat = beregnetResultat;
        }
        return finalResultat;
    }
}
