import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n, u, total = 1;
        Scanner input = new Scanner(System.in);

        System.out.print("Üssünü almak istediğiniz sayıyı gitriniz : ");
        n = input.nextInt();

        System.out.print("Üs derecesini giriniz : ");
        u = input.nextInt();

        for (int i = 1; i <= u; i++){
            total *= n;
        }
        System.out.println(n + " Saysının " + u + "." + " Dereceden kuvveti : " + total);
    }
}