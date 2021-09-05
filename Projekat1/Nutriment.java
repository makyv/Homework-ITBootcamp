public abstract class Nutriment extends Grocery {
    private double weight;
    private double kcal;
    private double proteins;
    private double carbohydrates;
    private double fats;
    private double fiber;

    public Nutriment(String company, String name, double weight, double kcal, double proteins, double carbohydrates, double fats, double fiber) {
        super(company, name);
        this.weight = weight;
        this.kcal = kcal;
        this.proteins = proteins;
        this.carbohydrates = carbohydrates;
        this.fats = fats;
        this.fiber = fiber;
    }

    public Nutriment(String name, double weight, double kcal, double proteins, double carbohydrates, double fats, double fiber) {
        super(name);
        this.weight = weight;
        this.kcal = kcal;
        this.proteins = proteins;
        this.carbohydrates = carbohydrates;
        this.fats = fats;
        this.fiber = fiber;
    }

    @Override
    public double getKcal() {
        return kcal;
    }

    public double getWeight() {
        return weight;
    }

    public double getProteins() {
        return proteins;
    }

    public double getCarbohydrates() {
        return carbohydrates;
    }

    public double getFats() {
        return fats;
    }

    public double getFiber() {
        return fiber;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setProteins(double proteins) {
        this.proteins = proteins;
    }

    public void setCarbohydrates(double carbohydrates) {
        this.carbohydrates = carbohydrates;
    }

    public void setFats(double fats) {
        this.fats = fats;
    }

    public void setFiber(double fiber) {
        this.fiber = fiber;
    }

    // update
    public void update(Double weight, Double proteins, Double fats, Double fiber, Double carbohydrates, Double kcal) {

        if (weight != null) {
            this.weight = weight;
        }
        if (proteins != null) {
            this.proteins = proteins;
        }
        if (fats != null) {
            this.fats = fats;
        }
        if (fiber != null) {
            this.fiber = fiber;
        }
        if (carbohydrates != null) {
            this.carbohydrates = carbohydrates;
        }

    }

    public double getTotalProteins() {
        return weight * proteins / 100;
    }

    public double getTotalCarbohydrates() {
        return weight * carbohydrates / 100;
    }

    public double getTotalFats() {
        return weight * fats / 100;
    }

    public double getTotalFiber() {
        return weight * fiber / 100;
    }

    // ukupan broj nutrijenata


    @Override
    public String toString() {


        return "Nutriment: " + getCompany() + "\n"
                + getName() + "\n" + "Weight: 100g" + "\n"
                + "Kcal: " + kcal + "\n"
                + "Proteins: " + getTotalProteins() + "%" + "\n"
                + "Carbohydrates: " + getCarbohydrates() + "%" + "\n"
                + "Fats: " + getTotalFats() + "%" + "\n"
                + "Fiber: " + getFiber() + "%";

    }

    public String totalNutrientTable() {
        return "Nutriment: " + getCompany() + "\n"
                + getName() + "\n" + "Weight: 100g" + "\n"
                + "Kcal: " + kcal + "\n"
                + "Proteins: " + proteins + "%" + "\n"
                + "Carbohydrates: " + carbohydrates + "%" + "\n"
                + "Fats: " + fats + "%" + "\n"
                + "Fiber: " + fiber + "%";

    }
}
