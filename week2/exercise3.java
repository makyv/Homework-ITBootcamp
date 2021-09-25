import java.util.Scanner;

public class Exercise3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);     

        double cena = 1; 
        double sum = 0;
        int brProizvoda = 0;
               while (cena != 0){
            cena = sc.nextDouble();
          
            brProizvoda++;           
            if (cena <= 0){
                brProizvoda--;
            }            
            else
                sum += cena;
        }

        if (brProizvoda != 0) {
            double prosek = sum / brProizvoda;
            System.out.println(prosek);
        }
        else
            System.out.println("0");
    }
}
