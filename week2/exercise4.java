import java.util.Scanner;

public class Exercise4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year1 = sc.nextInt();
        int year2 = sc.nextInt();      
        int numLeapYears = 0;

        for (int i = year1; i <= year2 ; i++)
            if (i % 4 == 0 && (i % 100 != 0 || i % 400 == 0))
                numLeapYears++;

        System.out.println(numLeapYears);
    }
}
