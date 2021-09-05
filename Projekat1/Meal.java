import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

public class Meal implements Energy {
    private UUID id = UUID.randomUUID();
    ;
    private List<Nutriment> nutriments;
    private String name;

    public Meal(List<Nutriment> nutriments, String name) {
        this.nutriments = nutriments;
        this.name = name;
    }

    public Meal(String name) {
        this.nutriments = new ArrayList<>();
        this.name = name;
    }

    public List<Nutriment> getNutriments() {
        return nutriments;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }


    public void add(Nutriment n, double weight) {
        double newWeight = n.getWeight() + weight;
        if (!nutriments.contains(n)) {
            nutriments.add(n);
        } else {
            n.setWeight(newWeight);
        }
    }

    public void remove(Nutriment n) {
        if (nutriments.contains(n)) {
            nutriments.remove(n);
        }
    }

    public void remove(Nutriment n, double weight) {
        double newWeight = 0;
        if (nutriments.contains(n)) {
            newWeight = n.getWeight() - weight;
        }
        n.setWeight(newWeight);
    }


    public double getKcal() {
        return getKcal();
    }

    public double getProteins() {
        double rez = 0;
        for (Nutriment n : nutriments) {
            rez += n.getProteins();
        }
        return rez;
    }

    public double getCarbohydrates() {
        double rez = 0;
        for (Nutriment n : nutriments) {
            rez += n.getCarbohydrates();
        }
        return rez;
    }

    public double getFats() {
        double rez = 0;
        for (Nutriment n : nutriments) {
            rez += n.getFats();
        }
        return rez;
    }

    public double getFiber() {
        double rez = 0;
        for (Nutriment n : nutriments) {
            rez += n.getFiber();
        }
        return rez;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Meal meal = (Meal) o;
        return id.equals(meal.id);
    }

    @Override
    public String toString() {
        return "Meal: " + name;

    }
}

