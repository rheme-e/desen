package Giris;

import java.util.Scanner;

public class desenEsra {
    static void desen(int i, boolean method) {
        int n = i;
        method = true;
        while (n > 0 && method == true) {
            System.out.println(n);
            n -= 5;
        }
        while (n <= 0) {
            System.out.println(n);
            n += 5;
            method = false;
        }
        while (n > 0 && method == false) {
            if (n == i) {
                return;
            } else {
                n = n + 5;
                System.out.println(n);
            }
        }
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir n değeri giriniz:");
        int i = inp.nextInt();
        desen(i, true);
    }
}
