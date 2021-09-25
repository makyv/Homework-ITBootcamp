package Test;

import java.util.Scanner;

public class Zadatak3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt(), w = sc.nextInt();
        String topMidbot = " ";
        for (int i = 0; i < w-2; i++) {
            topMidbot += "#";
        }
        topMidbot += " ";
        int h1 = (h-3)/2;
        int h2 = (h-3)-h1;
        String midSpace = "";
        for (int i = 0; i < w-2; i++) {
            midSpace += " ";
        }
        System.out.println(topMidbot);
        for (int i = 0; i < h1; i++) {
            System.out.println("#" + midSpace + "#");
        }
        System.out.println(topMidbot);
        for (int i = 0; i < h2; i++) {
            System.out.println("#" + midSpace + "#");
        }
        System.out.println(topMidbot);
    }
}
