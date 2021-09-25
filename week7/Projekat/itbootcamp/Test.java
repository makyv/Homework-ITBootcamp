package rs.itbootcamp;
import rs.itbootcamp.dao.*;
import rs.itbootcamp.model.FoodModel;
import rs.itbootcamp.model.MealModel;
import rs.itbootcamp.model.UserModel;

import java.util.Scanner;

public class Test {
    private static FoodModel userNewFood(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite id: ");
        int id = sc.nextInt();
        System.out.println("Unesite name: ");
        String name = sc.next();
        System.out.println("Unesite kcal: ");
        double kcal = sc.nextDouble();
        System.out.println("Unesite proteine: ");
        double proteins = sc.nextDouble();
        System.out.println("Unesite UH: ");
        double carbs = sc.nextDouble();
        System.out.println("Unesite masti: ");
        double fats = sc.nextDouble();
        return new FoodModel(id,name,kcal,proteins,carbs,fats);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FoodDao fd = new FoodDaoSQL();
        MealDao md = new MealDaoSQL();
        UserDao ud = new UserDaoSQL();

//        ud.add(new UserModel(21,"maky", "aaaakfjks", "**********", true));
//        ud.add(new UserModel(3,"milky", "j525jkfjks", "**********", true));
//        ud.add(new UserModel(1,"veki", "fjks", "**********", true));
//        ud.add(new UserModel(5,"tipoo", "@@@jkfjks", "**********", true));
//        ud.delete(21);

        System.out.println("Unesite email ili username: ");
        String entry = sc.next();
        System.out.println("Unesite password: ");
        String pw = sc.next();

        if(ud.login(entry, pw)){
            System.out.println("Uspesno!");
        }else{
            System.out.println("Neuspesno");
        }





        //fd.add(new FoodModel(2,"Jaja", 25,10,5,5));

        //md.add(new MealModel(5, "Jelo", "Opis", "5"));
        //md.delete(1);
        //md.insert(new MealModel(2, "Neko Jelo", "Opis 2", "3"));
        //md.update(new MealModel(2, "piletina", "opis 1", "2"));


        //fd.addToMeal(); ubaciti meal pa testirati



//
//        String menu = """
//                0. Exit
//                1. Dodaj u tabelu Food
//                2. Prikazi tabelu Food
//                """;
//
//        int choice = 5;
//        while(choice != 0){
//            System.out.println(menu);
//            choice = sc.nextInt();
//            switch(choice){
//                case 0:
//                    break;
//                case 1:
//                    fd.add(userNewFood());
//                    break;
//                case 2:
//                    System.out.println(fd.getAllFood());
//                    break;
//            }
//        }
//        int choice = 1;
//        while(choice != 0){
//
//        }
//        System.out.println("Unesite podatke za logovanje:");
//        System.out.println("Unesite email ili username:");
//        String userN = sc.nextLine();
//        System.out.println("Unesite password: ");
//        String password = sc.nextLine();





    }
}
