/******************************************************************************
 *  Nafn    : Ásgeir Tómas Guðmundsson
 *  T-póstur: asgeiir93@gmail.com
 *
 *  Lýsing  : Tekur inn 3 breytur. Tilgangur forrits er að hvort akreinavari
 *            bíls eigi að gefa viðvörun þegar bílstjóri hans gefur stefnuljós
 *            um að skipta um akgrein.
 *            Gerum ráð fyrir að vilji Bíll 1 fara til hægri sé hann á vinstri akrein
 *            og öfugt ef hann er á hægri vill hann fara til vinstri.
 *
 *            Forritið fær inn eftirfarandi breytur:
 *
 *            a) Bíll 1 gefur merki til hægri eða vinstri.
 *            b) Bíll 2 er á akrein hægri eða vinstri.
 *            c) Fjarlægð miðju Bíls 1 frá miðju Bíls 2.
 *
 *            Forritið prentar eftirfarandi eftir inntaki:
 *
 *            Ef miðja Bíls 2 er 4 metrum fyrir framan eða aftan miðju Bíls 1:
 *            "Engin hætta: of langt í burtu"
 *            Ef miðja Bíls 2 er innan 4 metra við miðju Bíls 1 EN ekki á sömu akrein og stefnan er:
 *            "Engin hætta: stefna ekki á sömu akrein"
 *            Ef miðja Bíls 2 er innan 4 metra við miðju bíls 1 EN stefnan er til hægri og sömuleiðis Bíll 2:
 *            "Varúð til hægri"
 *            Ef miðja Bíls 2 er innan 4 metra við miðju bíls 1 EN stefnan er til vinstri og sömuleiðis Bíll 2:
 *            "Varúð til vinstri"
 *
 *            Ekki þarf að athuga hvort inntak sé gilt.
 *
 *****************************************************************************/
public class Vari {
    public static void main(String[]args){
        char carOneIndicator = args[0].charAt(0);
        char carTwoLane = args[1].charAt(0);
        int carTwoDistance = Integer.parseInt(args[2]);

        if (carTwoDistance > 3 || carTwoDistance < -3) {
            System.out.println("Engin hætta: of langt í burtu");
        }
        else if (carOneIndicator != carTwoLane){
            System.out.println("Engin hætta: Stefna ekki á sömu akgrein");
        }
        else if (carOneIndicator == 'H'){
            System.out.println("Varúð til hægri");
        }
        else if (carOneIndicator == 'V' ){
            System.out.println("Varúð til vinstri");
        }
    }
}
