import java.util.Objects;

public abstract class Grocery implements Energy{
    private String company;
    private String name;

    public Grocery(String company, String name) {
        this.company = company;
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public  Grocery(String name){
        this.name = name;
        this.company = "";
    }

    public String getName() {
        return name;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Grocery grocery = (Grocery) o;
        return company.equals(grocery.company) && name.equals(grocery.name);
    }

    @Override
    public String toString() {
        return "Company: " + company + '\n' +
                "Name: " + name;
    }
}
