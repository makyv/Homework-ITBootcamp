import java.util.ArrayList;
import java.util.List;

public class Fridge{
    private ArrayList<Nutriment> nutriments;

    public Fridge(ArrayList<Nutriment> nutriments) {
        this.nutriments = nutriments;
    }

    public Fridge() {
        this.nutriments = new ArrayList<>();
    }

    public ArrayList<Nutriment> getNutriments() {
        return nutriments;
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
}
