import java.util.Scanner;

public class elmas {
    public static void main(String[] args) {


        int n;
        Scanner inp = new Scanner(System.in);
        System.out.print("Basamak Sayısını Giriniz: ");
        n = inp.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= n - 1; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * (n - i) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }


}
