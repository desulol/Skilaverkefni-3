/******************************************************************************
 *  Nafn    : Ásgeir Tómas Guðmundsson
 *  T-póstur: asgeiir93@gmail.com
 *
 *  Lýsing  : Tekur inn heiltölu sem er jákvæð.
 *            Ef talan er á bilinu 0-350 er prentað:
 *            "Góð"
 *            Ef talan er >350 er prentað:
 *            "Ekki góð".
 *            Ef notandi slær inn neikvæða tölu þá er prentað:
 *            "Sláðu inn jákvæða heiltölu".
 *            Ef notandi slær inn annað en heiltölu er prentað
 *            "Ólöglegt inntak - Sláðu inn heiltölu"
 *            Loks ef notandi gleymir að slá inn inntak er prentað:
 *            "Vantar inntak - Sláðu inn heiltölu"
 *
 *****************************************************************************/
public class LoftG {
    public static void main(String[]args) {
        try {
            int userInput = Integer.parseInt(args[0]);
            if (userInput >= 0 && userInput <= 350) {
                System.out.println("Góð");
            } else if (userInput > 350) {
                System.out.println("Ekki góð");
            } else  {
                System.out.println("Sláðu inn jákvæða heiltölu");
            }

        }
        catch (NumberFormatException e) {
            System.out.println("Ólöglegt inntak - Sláðu inn heiltölu");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Vantar inntak - Sláðu inn heiltölu");
        }
        }
    }


