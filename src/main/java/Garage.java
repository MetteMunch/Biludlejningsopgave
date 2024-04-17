import java.util.ArrayList;
public class Garage {

    //Attributter
    ArrayList<Bil> bilerIGaragen;
    BenzinBil nyBenzinBil = new BenzinBil("DFG", "Huandai", "i30", 2015, 5, 92, 17.5);
    ElBil nyElBil = new ElBil("GH45", "Tesla", "Y", 2024, 5, 57, 350.0,164);
    DieselBil nyDieselBil = new DieselBil("JH123","VW", "Golf", 2020, 5, true, 30);
    BenzinBil benzinBil2 = new BenzinBil("2DHG", "Volvo", "Amazone", 1998, 5, 95, 12);
    ElBil elBil2 = new ElBil("GH452", "Skoda", "Electric", 2021, 5, 57, 284.0,125);
    DieselBil dieselBil2 = new DieselBil("JH1232","Ford", "Fiesta", 2001, 5, false, 22);


    //Constructor

    public Garage() {
        bilerIGaragen = new ArrayList<>();
        tilføjBilerTilGaragen();
    }

    //Metoder
    public void tilføjBilerTilGaragen(){
        bilerIGaragen.add(nyBenzinBil);
        bilerIGaragen.add(nyElBil);
        bilerIGaragen.add(nyDieselBil);
        bilerIGaragen.add(benzinBil2);
        bilerIGaragen.add(elBil2);
        bilerIGaragen.add(dieselBil2);
    }

    public double beregnSamletGrønAfgift () {
        double resultat = 0.0;
        for (Bil bil : bilerIGaragen){
            resultat += bil.beregnGrønEjerafgift();
        }
        return resultat;
    }

    @Override
    public String toString() {
        String resultat = "";
        String ingenBiler = "Der er ingen biler i garagen lige nu";
        int count = 1;
        if(!bilerIGaragen.isEmpty()) {
            for(Bil bil: bilerIGaragen){
                resultat += "\n" + count + ". " + bil.getMærke() + " "+bil.getModel() + " ";
                count++;
            }
        } else {
            return ingenBiler;
        }
        return resultat;
    }
}
