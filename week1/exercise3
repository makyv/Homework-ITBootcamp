import java.util.Scanner;

public class Exercise3 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

      
        System.out.println("Enter a four-digit number:");
        int number = sc.nextInt();

        int thousands = (number / 1000); 
        int hundreds = (number / 100) % 10; 
        int tens = (number % 100) / 10; 
        int units = number % 10; 
     
        int res = thousands * hundreds - (tens + units);
        System.out.println("The result of the operation is: "  + res);
    }
}
