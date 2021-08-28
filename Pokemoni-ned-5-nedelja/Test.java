package Pokemoni;

public class Test {
    public static void main(String[] args) {
        FirePokemon charizard = new FirePokemon("Charizard", "Fire pokemon", 100);
        Pokemon bulbasaur = new GrassPokemon("Bulbasaur","Grass pokemon" , 50);
        WaterPokemon lapras = new WaterPokemon("Lapras", "Water pokemon", 120);
        System.out.println(charizard.attack());
        System.out.println(bulbasaur.defend());
        System.out.println(bulbasaur.logAll());
    }

}
