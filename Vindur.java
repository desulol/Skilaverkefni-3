/******************************************************************************
 *  Nafn    : Ásgeir Tómas Guðmundsson
 *  T-póstur: asgeiir93@gmail.com
 *
 *  Lýsing  : Tekur inn heiltölu ´vindhraði' og prentar út "Ofsaveður" ef
 *            vindur er meiri en 31, "Fárviðri" ef vindur er á bilinu 29 og 31,
 *            Rok ef vindur er á bilinu 24-28 og "Annað" ef vindur er minna en 28.
 *            Heiltalan er >= 0.
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
        else {
            System.out.println("Annað");
        }
    }
}
