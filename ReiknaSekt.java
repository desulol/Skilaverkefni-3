/******************************************************************************
 *  Nafn    : Ásgeir Tómas Guðmundsson
 *  T-póstur: asgeiir93@gmail.com
 *
 *  Lýsing  : Tekur inn tvær kommutölu breytur. Hámarkshraða og Hraða Bíls.
 *            Forritið prentar svo sektina útfrá þeim breytum.
 *
 *            Hraðasektir reiknast á eftirfarandi hátt:
 *            Ef hámarkshraði<=30km/klst er sektin 5.000kr fyrir hvern km/klst umfram.
 *
 *            Ef hámarkshraði>31km/klst og <=60 er sektin 10.000kr fyrir hvern km/klst umfram.
 *
 *            Ef hámarkshraði>61 er sektin 15.000kr fyrir hvern km/klst umfram.
 *
 *            Ef hraði bíls <= hámarkshraði er engin sekt.
 *
 *****************************************************************************/
public class ReiknaSekt {
    public static void main (String[]args){
        double speedLimit = Double.parseDouble(args[0]);
        double speedOfCar = Double.parseDouble(args[1]);
        double speedOverLimit = speedOfCar - speedLimit;

        int fineBasePerKm = 5_000;

        if (speedLimit >=31 && speedLimit <=60) {
            fineBasePerKm = 10_000;
        }
        else if (speedLimit >60){
            fineBasePerKm = 10_000;
        }

        double totalFine = speedOverLimit * fineBasePerKm;
        if (speedOverLimit >0){
            System.out.println("Sektin er "+totalFine+"kr");
        }
        else {
            System.out.println("Engin sekt");
        }
    }
}
