import java.util.Scanner;

public class etape3 {

    public static void main(String[] args) {

        Scanner jobs = new Scanner(System.in);

// --------------------------------------- JOB 1 -----------------------------------------------

        /*

    for(int i=0; i<=1337; i++) {
        if (i == 42) {
            System.out.println("---->" + i + "<----");
        } else {
            System.out.println(i);
        }
    }

        */

// ----------------------------------------JOB 2 ------------------------------------------------

        /*

    for(int i=0; i<=1337; i++) {
        if (i == 26 || i == 37 || i == 88 || i == 1111) {
            continue;
        }
        System.out.println(i);
    }

         */

// --------------------------------------- JOB 3 ------------------------------------------------

        // --------------------------SOLUTION 1 --------------------
        // avec "continue", les nombres entre 25 et 41 vont être entre __. .__
        // quand on arrive au 42, il vérifie la condition, écrit juste la plateforme et continue sa boucle jusqu'à 50.

        /*


        for (int i = 0; i <= 100; i++) {
            if (i <= 20) {
                System.out.println("_." + i + "_.");
            } else if (i >= 25 && i <=50) {
                if (42 == i) {
                    System.out.println("La Plateforme");
                }
                    System.out.println("__." + i + "__.");
            } else {
                System.out.println(i);
            }
        }

        */

        // -------------------------- SOLUTION 2 -------------------
        // on va travailler avec un else if pour la condition de 25 à 50
        // on ajoute un if pour le 42, quand on i == 42, il écrit la plateforme
        // on finit avec un else pour qu'il reprenne les conditions initiale de la boucle 25 - 50.

        /*

        for (int i = 0; i <= 100; i++) {
            if (i <= 20) {
                System.out.println("_." + i + "._");
            } else if (i >= 25 && i <= 50)
                if (42 == i) {
                    System.out.println("La Plateforme");
                } else {
                    System.out.println("__." + i + ".__");
                } else {
                System.out.println(i);
            }
        }

        */




// ---------------------------------------- JOB 4 -----------------------------------------------

        /*

for ( int i = 0; i <=100; i++){
        if (i % 3 == 0 && i % 5==0 && i!=0){
            System.out.println("FizzBuzz");
        } else if (i % 3 ==0 && i != 0){
            System.out.println("Fizz");
        } else if (i % 5 == 0 && i !=0) {
            System.out.println("Buzz");
        } else {
            System.out.println(i);
        }
    }

        */



// ---------------------------------------- JOB 5 -----------------------------------------------

    // ------------------------------------non fait ---------------------------------------------


        // ----------------------- CORRECTION -------------------------------------

        /*

    for (int n = 2; n<= 1000; n++) {

        boolean estPremier=true;

    for (int i = 2; i <= Math.sqrt(n); i++){
            if (n % i == 0) {
            estPremier = false;
            break;
            }
        }
        if (estPremier) {
            System.out.println(n);
        }
    }

        */

// --------------------------------------- JOB 6 ------------------------------------------------

        /*

    int l = 50;
    int h = 5;

    for (int i = 0; i < h; i++) {
        for (int x = 0; x < l; x++) {
            System.out.print("*");
        }
        System.out.println();
    }

        */


// -------------------------------------- JOB 7 ------------------------------------------------

        // + partie basse pour job 8

        /*

        int h = 5;

    // Haut


        for (int i=0; i<=h; i++) {
            for (int j = 0; j < h - i; j++) {
                System.out.print(" ");
            }
            for (int x = 1; x <= i; x++) {
                System.out.print("* ");
            } System.out.println();

        }

    // bas

        for (int i = 0; i <= h; i++) {
            for (int j = 0; j <= i; j++){
                System.out.print(" ");
            }
            for (int x = 1; x < h - i; x++) {
                System.out.print("* ");
            }
            System.out.println();
        }


        */



    }
}
