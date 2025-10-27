import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class HelloWorld {

    public static void main(String[] args) {
        // la classe commence toujours par une Maj.
        // type primitif toujours en minuscule.
        // int pour les nombres entiers.
        int number = 40;

        // double pour les decimals
        double decimal = 1.29;

        // boolean pour vrai ou faux
        boolean vrai = true;
        boolean faux = false;

        // char pour un caractère unique majuscule ou minuscule
        char a = 'A';

        // type non primitif, peut prendre tous les caractères, accents, chiffres, spéciaux etc
        String nom = "Jonathan";

            //commentaire

            /* commentaire
            sur
            plusieurs
            lignes
             */


        System.out.println(number);

        System.out.println(decimal);

        System.out.println(vrai);
        System.out.println(faux);

        System.out.println(a);

        System.out.println(nom);

        System.out.println("Hello World");



        // --------------------------------------- EXEMPLE ---------------------------------

        String name ="Alice";
        int age = 20;
        boolean etudiant = true;

        System.out.println("Nom" + name);
        System.out.println("Age" + age);
        System.out.println("Etudiant" + etudiant);


// concaténation de texte ( mettre plusieurs variables sur une seule ligne ou à la suite )

        /* pour avoir un espace quand on met plusieurs variables d'affilés,
         il faut mettre un espace au niveau du nom de la variable.
         Exemple : "Nom " + nom + " Age " + age + " Etudiant " + etudiant +...............

         Si on écrit "nom" + nom + "age" + age +"Etudiant" + etudiant + ..... TOUS SERA COLLé !
         */

        System.out.println("nom " + name + " age " + age+ " Etudiant " + etudiant);


    }
}
