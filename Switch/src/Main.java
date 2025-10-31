import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {



        Scanner calculatrice = new Scanner(System.in);

        /*

        System.out.println("choisissez votre opération");

        System.out.println("1. addition");   // texte explication choix 1
        System.out.println("2. soustraction");   // texte explication choix 2
        System.out.println("3. multiplication");   // texte explication choix 3
        System.out.println("4. division");   // texte explication choix 3
        System.out.print("Votre choix : ");   // ligne pour que l'utilisateur tape son choix
        int choix = calculatrice.nextInt();   // permet à l'utilisateur de taper son choix, Int permet de reconnaitre des chiffres uniquement

        System.out.print("choisissez votre premier nombre : ");
        double x = calculatrice.nextDouble();


        System.out.print("choisissez votre deuxiéme nombre : ");
        double y = calculatrice.nextDouble();

        double resultat;

        if (choix == 1) {
            resultat = x + y;
            System.out.println("resultat : " + resultat);
        } else if (choix == 2) {
            resultat = x - y;
            System.out.println("resultat : " + resultat);
        } else if (choix == 3) {
            resultat = x * y;
            System.out.println("resultat : " + resultat);
        } else if (choix == 4) {

            if (y != 0) {
                resultat = x / y;
                System.out.println("resultat : " + resultat);
            } else {
                System.out.println("impossible de diviser par 0");
            }

        }

        */

        //--------------------------------------- SWITCH -----------------------------------------


    boolean run = true;

        int x;
        int y;
        int choice;

        while (run) {
            System.out.println("Entrez un nombre entre 1 et 5. Le 5 ferme le programme.");
            System.out.println("1. Addition");
            System.out.println("2. Soustraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println();
            System.out.print("Votre choix : ");

            choice = calculatrice.nextInt();

            switch (choice) {
                case 1 :
                    System.out.println();
                    System.out.print("Tapez votre premier nombre : ");
                    x= calculatrice.nextInt();
                    System.out.print("Tapez votre deuxième nombre : ");
                    y= calculatrice.nextInt();
                    System.out.println("Le résultat est : "+ (x+y));
                    System.out.println();

                    break;

                case 2 :
                    System.out.println();
                    System.out.print("Tapez votre premier nombre : ");
                    x= calculatrice.nextInt();
                    System.out.print("Tapez votre deuxième nombre : ");
                    y= calculatrice.nextInt();
                    System.out.println("Le résultat est : "+ (x-y));
                    System.out.println();
                    break;

                case 3 :
                    System.out.println();
                    System.out.print("Tapez votre premier nombre : ");
                    x= calculatrice.nextInt();
                    System.out.print("Tapez votre deuxième nombre : ");
                    y= calculatrice.nextInt();
                    System.out.println("Le résultat est : "+ (x*y));
                    System.out.println();
                    break;

                case 4 :
                    System.out.println();
                    System.out.print("Tapez votre premier nombre : ");
                    x= calculatrice.nextInt();
                    System.out.print("Tapez votre deuxième nombre : ");
                    y= calculatrice.nextInt();
                    if (y == 0) {
                        System.out.println("Impossible de diviser par 0");
                    }
                    else {
                        System.out.println("Le résultat est : " + (x / y));
                    }
                    System.out.println();
                    break;

                case 5 :
                    System.out.println();
                    System.out.println("Au revoir");
                    run = false;
                    break;

                default:
                    System.out.println();
                    System.out.println("Essaie un autre nombre");
                    System.out.println();
                    continue;

            }
        }
                System.out.println();
                System.out.println("fin du programme");


    }
}