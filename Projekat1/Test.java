import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Da li zelite da napravite novo jelo?" + "\n" + "Da" + "  " + "Ne ");
        String s = sc.nextLine();

        if(s.equals("Da")){
            System.out.println("Mozete uneti sastojke: [naziv, kolicina, proteini, hidrati, masti, vlakna");
            while(sc.nextLine().equals("Gotovo")) {
                Food a = new Food(sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());

                List<Nutriment> l = new ArrayList<>();
                l.add(a);

            }

        }
        System.out.println("Napravite obrok: ");
        while(sc.nextLine().equals("Gotovo")) {
            Meal a = new Meal(sc.nextLine());
            System.out.println("Ubacite sastojke:");

//            List<Meals> m = new ArrayList<>();
//            m.add(a);

        }



//        Food a1 = new Food("Imlek", "sos os paradajza", 200.0, 200.5, 5.2, 15.5, 2.8, 1.2);
//        Food a2 = new Food("Iml", "luk", 100.0, 130.5, 8.2, 15.5, 2.8, 1.2);
//        Food a3 = new Food("Pttt", "meso", 500.0, 125.5, 10.2, 15.5, 1.8, 1.2);


        Food n1 = new Food("Imlek", "mleko", 200.0, 200.5, 5.2, 15.5, 2.8, 1.2);
        Food n2 = new Food("Iml", "pecurke", 400.0, 130.5, 8.2, 15.5, 2.8, 1.2);
        Food n3 = new Food("Pttt", "piletina", 500.0, 125.5, 10.2, 15.5, 1.8, 1.2);
        List<Nutriment> n = new ArrayList<>();
        n.add(n1);
        n.add(n2);
        n.add(n3);

        Meal m1 = new Meal("Spagete bolonjeze");
        Meal m2 = new Meal(n,"Piletina u sosu od pecuraka");



        List<Meal> Meals = new ArrayList<>();
        Meals.add(m1);
        Meals.add(m2);


        List<Nutriment> f = new ArrayList<>();
        Drink f1 = new Drink("mleko", 200.0, 200.5, 3.2, 15.5, 1.8, 1.2);
        Food f2 = new Food( "jaja", 50.0, 200.5, 5.2, 30.5, 2.8, 1.2);
        Food f3 = new Food( "piletina", 1000.0, 200.5, 10.2, 20.5, 2.8, 1.2);
        Food f4 = new Food( "paradajz", 200.0, 200.5, 5.2, 15.5, 2.8, 1.2);
        Food f5 = new Food( "sir", 200.0, 200.5, 5.2, 15.5, 2.8, 1.2);

        Fridge fr = new Fridge();
        fr.add(f1,200.0);
        fr.add(f2,50.0);
        fr.add(f3,1000.0);
        fr.add(f4, 200.0);
        fr.add(f5, 200.0);




    }


    }



