package Pokemoni;

public abstract class Pokemon implements Attackable{
    String name, type;
    int health;

    public Pokemon(String name, String type, int health) {
        this.name = name;
        this.type = type;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getHealth() {
        return health;
    }

    public abstract String logAll();

}
