package Test;

import java.util.Scanner;

public class Zadatak5 {

    public static int[] sumOfArrays(int[] a, int[] b){
        int[] rez = new int[a.length];
        for (int i = 0; i < rez.length; i++) {
            rez[i] = a[i] + b[i];
        }
        return rez;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] x = new int[]{1,2,3,4,5};
        int[] y = new int[]{5,4,6,7,8};
        int[] z = sumOfArrays(x, y);
        for (int i = 0; i < z.length; i++) {
            System.out.print(z[i] + " ");
        }
        System.out.println();
    }
}
