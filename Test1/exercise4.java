package Test;

import java.util.Scanner;

public class Zadatak4 {

    public static boolean isInArray(int[] arr, int n) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n)
                return true;
        }
        return false;
    }

    public static int maxElement(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        return max;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[]{1,45,6,7,8,2};
        System.out.println(isInArray(arr, 5));
        System.out.println(maxElement(arr));
    }
}
