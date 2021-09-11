/******************************************************************************
 *  Nafn    : Ásgeir Tómas Guðmundsson
 *  T-póstur: asgeiir93@gmail.com
 *
 *  Lýsing  : Tekur inn bókstaf og prentar út "Virkur dagur" ef bókstafurinn er
 *            'M''Þ''I''F''Ö' og "Helgi" ef bókstafurinn er 'L' eða 'S'.
 *            Auk þess prentar það "Villa í inntaki" ef eitthvað annað er
 *            slegið inn
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
