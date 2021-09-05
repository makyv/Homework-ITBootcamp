import java.util.ArrayList;
import java.util.List;

public class Meals {
    List<Meal> meals;

    public Meals(List<Meal> meals) {
        this.meals = meals;
    }

    public Meals() {
        this.meals = new ArrayList<>();
    }

    public List<Meal> getMeals() {
        return meals;
    }


    public boolean add(Meal m) {
        if (!meals.contains(m)) {
            meals.add(m);
            return true;
        }
        return false;
    }

    public void remove(Meal m) {
        if (meals.contains(m)) {
            meals.remove(m);
        }
    }

    public List<Meal> search(String s) {
        List<Meal> rez = new ArrayList<>();
        for (Meal m : meals) {
            if (m.getName().contains(s)) {
                rez.add(m);
            }
        }
        return rez;
    }

    public List<Meal> search(List<Nutriment> nutriment) {
        List<Meal> rez = new ArrayList<>();
        for (Meal m : meals) {
            boolean flag = true;
            for (int i = 0; i < m.getNutriments().size(); i++) {
                if (!nutriment.contains(m.getNutriments().get(i)) && nutriment.get(nutriment.indexOf(m.getNutriments().get(i))).getWeight()
                        >= m.getNutriments().get(i).getWeight()) {
                    flag = false;
                }
            }
            if (flag) {
                rez.add(m);
            }
        }

// vraca ona jela koja mogu da se naprave od mogucih namirnica

        return rez;
    }


    public List<Meal> search(double kcal) {
        List<Meal> rez = new ArrayList<>();
        for (Meal m : meals) {
            if (m.getKcal() < kcal) {
                rez.add(m);
            }
        }
        return rez;
    }

    public List<Meal> search(Double kcal, String mealName, Double proteins) {         // vise parametara
        List<Meal> rez = new ArrayList<>();
        if (kcal == null && mealName == null && proteins == null) {
            return rez;
        }
        for (Meal m : meals) {
            if (m.getKcal() <= kcal || m.getName().contains(mealName) || m.getProteins() <= proteins) {
                rez.add(m);
            }
        }

        return rez;
    }

    @Override
    public String toString() {
        String rez = "";
        for (Meal m : meals) {
            rez += (m.getId() + " | " + m.getName()) + "\n";
        }
        return rez;
    }
}
