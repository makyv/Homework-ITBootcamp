private static void searchMeals(Scanner sc) {
        int choice = 0;

        do {
            System.out.println("Search meals:");
            System.out.println("---------------");
            System.out.println("1. All meals");
            System.out.println("2. Search by name or description");
            System.out.println("0. Back");

            choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.println("How many items you want per page");
                    int items = sc.nextInt();
                    searchByPages(md.getAllMealNames(), items, sc);
                }
                case 2 -> {
                    System.out.println("Enter text which your meal will contain");
                    sc.skip("[\r\n]+");
                    String s = sc.nextLine();
                    System.out.println("How many items you want per page?");
                    int items = sc.nextInt();
                    searchByPages(md.getMealNames(s), items, sc);
                }
                case 0 -> System.out.println();
                default -> System.out.println("Invalid option");
            }
        }
        while (choice != 0);
    }
