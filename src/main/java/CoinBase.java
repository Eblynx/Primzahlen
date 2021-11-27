import java.util.Scanner;

public class CoinBase {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int start = 0, end = 0;
        boolean prime;

        System.out.printf("Startwert: ");
        start = input.nextInt();
        System.out.printf("Endwert: ");
        end = input.nextInt();

        if (start >= end) {
            System.out.printf("Der Endwert muss größer als der Startwert sein!");
        } else {

            for (int i = start; i <= end; ++i) {
                prime = true;
                if (i <= 1)
                    System.out.println(i + " ist keine Primzahl!");
                else {
                    for (int j = 2; j < i; ++j) {
                        if (i % j == 0)
                            prime = false;
                    }
                    if (prime == false)
                        System.out.println(i + " ist keine Primzahl!");
                    else
                        System.out.println(i + " ist eine Primzahl!");
                }
            }
        }
    }
}
