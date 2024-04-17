public class Main {
    public static void main(String[] args) {

        Garage garage = new Garage();

        System.out.println("Den samlede bilpark består af: ");
        System.out.println(garage.toString());
        System.out.println("Samlet skal der betales en grønafgift, som årligt udgør: ");
        System.out.println(garage.beregnSamletGrønAfgift());

        /*System.out.println(garage.nyBenzinBil.beregnGrønEjerafgift());
        System.out.println(garage.nyDieselBil.beregnGrønEjerafgift());
        System.out.println(garage.nyElBil.beregnGrønEjerafgift());
        System.out.println(garage.benzinBil2.beregnGrønEjerafgift());
        System.out.println(garage.elBil2.beregnGrønEjerafgift());
        System.out.println(garage.dieselBil2.beregnGrønEjerafgift());*/


    }
}
