package Test;

import java.util.Scanner;

public class Zadatak2 {

    public static int brDeljivih(int n){
        int br = 0;
        for (int i = 1; i <= n; i++){
            if (n % i == 0)
                br++;
        }
        return br;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rez = brDeljivih(n);
        System.out.println(rez);
    }
}
