import java.util.Scanner;

public class Exercise5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);       
        int n = sc.nextInt();       
        while (n > 9){           
            int sum = 0;
            while (n != 0){
                sum += n % 10; 
                n /= 10; 
            }            
            n = sum;
        }
        System.out.println(n);

    }
}
