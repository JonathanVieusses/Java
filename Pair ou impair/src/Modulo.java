import java.util.Scanner;

public class Modulo {


    public static void main(String[] args) {

        Scanner modulo = new Scanner(System.in);
        System.out.println("entrez votre nombre :");

        int x = modulo.nextInt();

        if (x % 2 == 0) {
            System.out.println("le nombe est pair");
        } else {
            System.out.println("le nombre est impair");
        }

    }

}