import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

// -------------------- ETAPE 2 --------------------


        // --------------------------------EXERCICE 1 -----------------------------------------------------

        // solution 1 avec "do" et "while"

        /*

        int i = 0;
        do {
            System.out.println(i);
            i++;
        }
        while (i <= 10);

        */


        // solution 2 avec "for"

        /*

        for ( int i = 0; i <= 10; i++) {
            System.out.println(i);
        }

        */








        // ------------------------------------------EXERCICE 2 ------------------------------------------------

        // solution 1 avec "for"

        /*

        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        }

        */

        // solution 2 avec "countdown"

        /*

        int countdown = 10;

        while (countdown >= 0) {
            System.out.println(countdown);
            countdown--;
        }

         */





        // ------------------------------------------- EXERCICE 3 ------------------------------------------------


        //    SOLUTION 1 EN METTANT x+2 à chaque fois en partant de zéro.
        // NE FONCTIONNE QUE SI ON COMMENCE PAR UN NOMBRE PAIR.

        /*

        for (int x = 0; x <= 20; x+=2){
            System.out.println(x);

        */

        // SOLUTION 2 en mettant une conditon.
        // si les nombre sont divisibles par deux et que le reste est 0, donc pairs, on les affiche.

        /*

        for(int x = 0; x <= 20; x++){
            if ((x % 2) != 0){       // si le reste de x divisé par 2 est égale à 0, on l'affiche, sinon (!=0) on "continue"
                continue;
            }
            System.out.println(x);
        }

         */

        // SOLUTION 3 avec condition

        /*

         for(int x = 0; x <= 20; x++) {
             if ((x % 2) == 0)             // si le reste de x divisé par 2 égale 0, il est donc pair, on l'affiche, et uniquement les pairs
             System.out.println(x);
         }

        */




        // --------------------------------------- EXERCICE 4 -------------------------------------------

        /*

        int x = 0;
                for(int y = 1; y <= 100; y++){
                    x = x+y;      // ou x+=y
                }
        System.out.println("la somme de 1 à 100 est : " + x);

        */
        

    }

}
