package rs.itbootcamp;

import rs.itbootcamp.dao.FoodDao;
import rs.itbootcamp.dao.FoodDaoSQL;
import rs.itbootcamp.model.FoodModel;

import java.util.List;
import java.util.Scanner;

public class Main {
    static FoodDao fd = new FoodDaoSQL();
    static int fridge_id = 1;


    public static  void welcomeMessage(){
        System.out.println("Welcome to kitchen!");
        System.out.println("-----------");
    }


    private static void addFoodToFridge(Scanner sc){
        List<FoodModel> foodList = fd.getAllFood();
        int choice = -1;

        while(choice != 0){
            for(int i = 0; i < foodList.size(); i++){
                System.out.println((i+1) + ". " + foodList.get(i));
            }
            System.out.println("0. Back");

            choice = sc.nextInt();

            if(choice > 0 && choice <= foodList.size()){
                System.out.println("How much: (in grams)");
                double mass = sc.nextDouble();
                fd.addToFridge(fridge_id,foodList.get(choice - 1).getFoodId(),mass);
                System.out.println("++");
            }
        }
    }

    private static void removeFoodFromFridge(Scanner sc){
        int choice = -1;
        List<FoodModel> foodList = fd.getAllFood();
        while(choice != 0){
            for (int i = 0; i < foodList.size(); i++) {


            }
        }



    }

    private static void writeAllFood(){




    }

    private static void fridgeMenu(Scanner sc){
        int choice;
        do{
            System.out.println("My Fridge:");
            System.out.println("--------");
            System.out.println("1. Add food");
            System.out.println("2. Remove food");
            System.out.println("3. Look in");
            System.out.println("4. Create meal");
            System.out.println("0. Back");

            choice = sc.nextInt();

            switch(choice){
                case 1 -> addFoodToFridge(sc);
                case 2 -> System.out.println("Remove food from fridge");
                case 3 -> System.out.println("Write all food from fridge");
                case 4 -> System.out.println("Create meal");
                case 0 -> System.out.println();
                default -> System.out.println("Invalid option");
            }
        } while(choice != 0);
    }

    private static void mainMenu(Scanner sc){
        int choice;
        do{
            System.out.println("Main menu:");
            System.out.println("-----------");
            System.out.println("1. My Fridge");
            System.out.println("2. Meals");
            System.out.println("3. All food");
            System.out.println("4. Add new food");
            System.out.println("0. Exit");

            choice = sc.nextInt();

            switch (choice){
                case 1 -> fridgeMenu(sc);
                case 2 -> System.out.println("Meals");
                case 3 -> System.out.println("All food");
                case 4 -> System.out.println("Add new food");
                case 0 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid option");
            }
        } while(choice != 0);
    }




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        welcomeMessage();

        mainMenu(sc);

    }
}
