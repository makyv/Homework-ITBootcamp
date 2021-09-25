import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String timA = sc.nextLine();
        String timB = sc.nextLine();
        int gA = sc.nextInt();
        int gB = sc.nextInt();
        int sA = sc.nextInt();
        int sB = sc.nextInt();
        int bA = sc.nextInt();
        int bB = sc.nextInt();

       
        int sumA = gA + sA + bA;
        int sumB = gB + sB + bB;
        if (sumA > sumB)
            System.out.println(timA);
        else if (sumB > sumA)
            System.out.println(timB);
        else if (gA > gB)
            System.out.println(timA);
        else if (gB > gA)
            System.out.println(timB);
        else if (sA > sB)
            System.out.println(timA);
        else if (sB > sA)
            System.out.println(timB);
        else if (bA > bB)
            System.out.println(timA);
        else if (bB > bA)
            System.out.println(timB);
        else
            System.out.println("Unresolved");

    }
}
