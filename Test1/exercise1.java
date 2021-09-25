package Test;

import java.util.Scanner;

public class Zadatak1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite godinu:");
        int godina = sc.nextInt();
        System.out.println("Unesite opciju:");
        int option = sc.nextInt();
        if (option == 1){
            boolean isLeap = godina % 4 == 0 && (godina % 100 != 0 || godina % 400 == 0);
            if (isLeap)
                System.out.println("Godina " + godina + " je prestupna");
            else
                System.out.println("Godina " + godina + " nije prestupna");
        }
        else if (option == 2){
            if (godina >= 2021)
                System.out.println("Do " + godina + " ima jos " + (godina-2021) + " godine");
            else
                System.out.println("Od " + godina + " je proslo " + (2021-godina) + " godina");
        }
    }
}
