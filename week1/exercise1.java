import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);

      
        System.out.println("Enter two integers:");
        int x = sc.nextInt();
        int y = sc.nextInt();

        // Ispisujemo rezultate
        System.out.println("The results of arithmetic operations are:");
        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x * y);
        System.out.println(x / y);
        System.out.println(x % y);
    }
}
