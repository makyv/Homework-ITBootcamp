public class Exercise2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            String ispis =  i + ": ";
            if (i % 3 == 0)
                ispis += "Fizz";          
            if (i % 5 == 0)
                ispis += "Buzz";          
            System.out.println(ispis);
        }

    }
}
