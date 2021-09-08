package Pokemoni;

public class GrassPokemon extends Pokemon implements Attackable{
    public GrassPokemon(String name, String type, int health) {
        super(name, type, health);
    }

    @Override
    public String attack() {
        return "Napada: travom ";
    }

    @Override
    public String defend() {
        return "Brani se: izbegavanjem";
    }

    @Override
    public String wins() {
        return "Pobedjuje: Water type";
    }

    @Override
    public String loseOf() {
        return "Gubi od: Fire type";
    }

    @Override
    public String logAll() {
        return type + ":" + " " + name  +  "," + health + ":" + "\n" + attack() + "\n" + defend() + "\n" + wins() + "\n" + loseOf();
    }

    // Napada: Travom
    // Brani se: Izbegava
    // Pobedjuje: Water type
    // Gubi od: Fire type
}