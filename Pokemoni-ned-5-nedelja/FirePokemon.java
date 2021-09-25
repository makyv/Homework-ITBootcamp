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
 StringBuilder sb = new StringBuilder();
        sb.append(attack()).append("\n")
                .append(defend()).append("\n")
                .append(win()).append("\n")
                .append(lose()).append("\n");
        return sb.toString();    }

  }
