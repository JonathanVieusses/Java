import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        // ----------------------------------------- JOB 1 -----------------------------------------

        /*

        int[] numbers = {200, 204, 173, 98, 171, 404, 459};
        for (int i : numbers) {
            if (i % 2 == 0) {
                System.out.println(i +" est pair");
            }
            else {
                System.out.println(i +" est impair");
            }
        }

        */

        // ----------------------------------------- JOB 2 -----------------------------------------

        /*

        String str = "Tous ces instants seront perdus dans le temps comme les larmes sous la pluie.";
        char[] array = str.toCharArray();
        for (int c = 0; c < array.length; c += 2) {
            System.out.print(array[c]);
        }


        */

        // ----------------------------------------- JOB 3 -----------------------------------------

        /*

        String str = "I'm sorry Dave I'm afraid I can't do that";
        char[] array = str.toCharArray();
        for (int i = 0; i < array.length; i++) {
            char c = array[i];
            if (c == 'a' || c == 'e' || c == 'I' || c == 'o' || c == 'y' || c == 'i') {
                System.out.print(array[i]);
            }
        }

        */

        // ----------------------------------------- JOB 4 -----------------------------------------

        /*

        String str = "Dans l'espace, personne ne vous entend crier";
        char[] array = str.toCharArray();
            int count = 0;
        for (int i = 0; i< array.length; i++) {
            char c = array[i];
            count++;
        }
            System.out.println("la somme totale des caratères est : " + count);

        */

        // ---------------------------------------- JOB 5 ------------------------------------------

        /*

            String str = "On n’est pas le meilleur quand on le croit mais quand on le sait";
            char[] array = str.toCharArray();
            int countv = 0;
            int countc = 0;
            for (int i = 0; i< array.length; i++) {
                char c = array[i];
                if (c == 'a' || c == 'e' || c == 'I' || c == 'o' || c == 'O' || c == 'i' || c == 'u') {
                    countv++;
                } else if ( c == ' ' || c == '’') {
                } else {
                    countc++;
                }
            }
                System.out.println("le nombre de voyelle est de : " +countv);
                System.out.println("le nombre de consonne est de : " +countc);

        */

        // ---------------------------------------- JOB 6 ------------------------------------------


        /*

        String str = "Les choses que l'on possède finissent par nous posséder";
        char[] array = str.toCharArray();
        for (int i = array.length - 1; i>=0 ; i--) {
            char c = array[i];
            System.out.print(c);
        }

        */

        // ---------------------------------------- JOB 7 -------------------------------------------

        /*

        String str = "Certaines choses changent, et d'autres ne changeront jamais.";
                char[] array = str.toCharArray();
                for (int i =0; i< array.length ; i++) {
                    char c =array[i];
                    if (i >= 1){
                        System.out.print(c);
                    }
                }
                System.out.println(array[0]);

        */


        }
    }
