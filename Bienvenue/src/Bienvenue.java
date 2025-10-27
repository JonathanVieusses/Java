import java.util.Scanner;

public class Bienvenue {

    public static void main(String[] args) {


        // Scanner est une classe. scanner est une variable ( on la nomme comme on veut). new Scanner est un objet.
        // system.in permet de recupérer des infos tapées sur la console directement.
        Scanner scanner = new Scanner(System.in);

        // system.out permet d'envoyer des infos dans la console.
        System.out.println("what is your name?");

        /* scanner recupère les données de la classe donc va recuperer les infos écrites dans la ligne suivante (nextline)
         directement depuis la console. */

        String prénom = scanner.nextLine();

        System.out.println("Your name is " + prénom + " bienvenue dans le monde de Java");


        // Exercice demande l'âge TIP avec .nextInt


        System.out.println("how old are you ?");
        int age = scanner.nextInt();
        System.out.println("you are " + age);

        // on peut le faire avec juste System.out.print pour que la réponse soit directement aprés la question





        // if et else sur une verif d'âge


        Scanner input= new Scanner(System.in);
        System.out.println("how old are you ?");
        int ageold = input.nextInt();

        if (18 > ageold) {
            System.out.println("You're not 18 go away!");
        }
         else {
            System.out.println("You can enter !");

            /*     == égale à     ----------------------    != n'est pas égale à
            System.out.printIn(1 == 1) true
            System.out.printIn(1 == 2) false

            System.out.printIn(1 != 1) false
            System.out.printIn(2 != 1) true

            System.out.printIn(1 < 5) true
            System.out.printIn(1 > 5) false
            System.out.printIn(12 >= 18) false
            System.out.printIn(18 <= 18 ou 18 >=18) true

            // + addition
            System.out.println(1 + 2); // 3

            // - soustraction
            System.out.println(3 - 1); // 2

            // * multiplication
            System.out.println(5 * 2); // 10

            // / division
            System.out.println(10 / 2); // 5

            // % modulo
            System.out.println(10 % 2); // 0
            System.out.println(10 % 3); // 1
             */
        }
    }

}
