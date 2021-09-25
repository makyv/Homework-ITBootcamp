package Pokemoni;

public class WaterPokemon extends Pokemon implements Attackable {

    public WaterPokemon(String name, String type, int health) {
        super(name, type, health);
    }

    @Override
    public String attack() {
        return "Napada: vodom";
    }

    @Override
    public String defend() {
        return "Brani se: vodom";
    }

    @Override
    public String wins() {
        return "Pobedjuje: Fire type";
    }

    @Override
    public String loseOf() {
        return "Gubi od: Grass type";
    }

    @Override
    public String logAll() {
        StringBuilder sb = new StringBuilder();
        sb.append(attack()).append("\n")
                .append(defend()).append("\n")
                .append(win()).append("\n")
                .append(lose()).append("\n");
        return sb.toString();    }

}
