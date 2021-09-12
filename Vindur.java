/******************************************************************************
 *  Nafn    : Ásgeir Tómas Guðmundsson
 *  T-póstur: asgeiir93@gmail.com
 *
 *  Lýsing  : Tekur inn heiltölu ´vindhraði'. Heiltalan er >= 0.
 *            Prentar út ef vindur er meiri en 31:
 *            "Ofsaveður"
 *            Prentar út ef vindur er á bilinu 29 og 31:
 *            "Fárviðri"
 *            Prentar út ef vindur er á bilinu 24-28:
 *            "Rok"
 *            Prentar út ef vindur er minna en 24:
 *            "Annað"
 *
 *****************************************************************************/
public class Vindur {

    public static void main(String[] args) {
        int windSpeed = Integer.parseInt(args[0]);

        if (windSpeed>31){
            System.out.println("Ofsaveður");
        }
        else if (windSpeed >= 29){
            System.out.println("Fárviðri");
        }
        else if (windSpeed >= 24){
            System.out.println("Rok");
        }
        else
            System.out.println("Annað");

    }
}
