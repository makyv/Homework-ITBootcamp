import java.util.Scanner;

public class Exercise6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        /*       
        * |     *     |
        * |    * *    |
        * |   * * *   |
        * |  * * * *  |
        * | * * * * * |
        * |* * * * * *|
        */     

        for (int i = 0; i < n; i++){          
            int left = n-i-1; 
            int right = n+i-1;            
            boolean prethodnoJeRazmak = true;
            for (int j = 0; j < 2*n; j++) {               
                if (j < left){                   
                    System.out.print(" ");
                    prethodnoJeRazmak = true; 
                }               
                else if (j > right){                   
                    System.out.print(" ");
                    prethodnoJeRazmak = true;
                }             
                else{                   
                    if (prethodnoJeRazmak){
                        System.out.print("*");
                        prethodnoJeRazmak = false; 
                    }
                  else{
                        System.out.print(" ");
                        prethodnoJeRazmak = true;
                    }
                }
            }         
            System.out.println();
           
        }
    }
}
