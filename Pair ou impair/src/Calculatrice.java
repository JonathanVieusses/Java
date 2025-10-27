import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Calculatrice {

    public static void main(String[] args) {

        Scanner calculatrice = new Scanner(System.in);

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

    }
}
