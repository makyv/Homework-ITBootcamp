package Pokemoni;

public class FirePokemon extends Pokemon implements Attackable{
    public FirePokemon(String name, String type, int health) {
        super(name, type, health);
    }

    @Override
    public String attack() {
        return "Napada: vatrom.";
    }

    @Override
    public String defend() {
        return "Brani se: Telesno";
    }

    @Override
    public String wins() {
        return "Pobedjuje: Grass type";
    }

    @Override
    public String loseOf() {
        return "Gubi od: Water type";
    }

    @Override
    public String logAll() {
        return type + ":" + " " + name + "," + health + ":" + "\n" + attack() + "\n" + defend() + "\n" + wins() + "\n" + loseOf();
    }

    // Napada: Vatrom
    // Brani se: Telesno
    // Pobedjuje: Grass type
    // Gubi od: Water type
}
