import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner randomdice = new Scanner(System.in);

        int dice1 = (int) (Math.random() * 6);
        int dice2 = (int) (Math.random() * 6);
        int result = (dice1+dice2);

        System.out.println("Choisissez votre réponse :");
        int x = randomdice.nextInt();

        if (x == dice1+dice2) {
            System.out.println("Gagné !");
        }
        else {
            System.out.println("Perdu !");
        }

        System.out.println("il fallait trouver : " + result);



    }
}
