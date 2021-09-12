/******************************************************************************
 *  Nafn    : Ásgeir Tómas Guðmundsson
 *  T-póstur: asgeiir93@gmail.com
 *
 *  Lýsing  : Tekur inn bókstaf.
 *            Ef bókstafurinn er; 'M''Þ''I''F''Ö' ;prentar:
 *            "Virkur dagur"
 *            Ef bókstafurinn er; 'L' 'S' ;prentar:
 *            "Helgi"
 *            Ef eitthvað annað er slegið inn prentar það:
 *            "Villa í inntaki"
 *
 *****************************************************************************/
public class Fri {

    public static void main (String[]args) {
        char dayInitial = args[0].charAt(0);

        switch (dayInitial){
            case 'M':
            case 'Þ':
            case 'I':
            case 'F':
            case 'Ö':
            case 'L':
            case 'S':  System.out.println("Virkur dagur"); break;

            default: System.out.print("Villa í inntaki");
            break;
        }
    }
}
