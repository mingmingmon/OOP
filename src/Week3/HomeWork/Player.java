package Week3.HomeWork;
import java.util.*;

public class Player {
    String name;
    ArrayList<Pokemon> myPokemons = new ArrayList<>();

    void read(String name, Scanner scanner, Center center){
        this.name = name;
        for (int i = 0; i < 5; i++) {
            int id = scanner.nextInt();
            Pokemon pokemon = center.findPokemon(id);
            myPokemons.add(pokemon);
            pokemon.setPlayer(this);
        }
        center.playerList.add(this);
    }

    void print(){
        System.out.printf("%s : ", name);
        for(Pokemon pokemon : myPokemons){
            System.out.printf("%s ", pokemon.name);
        }
        System.out.println("");
    }

    boolean matches(String keyWord){
        if(name.contains(keyWord))
            return true;
        for(Pokemon pokemon : myPokemons){
            if(pokemon.matches(keyWord))
                return true;
        }
        return false;
    }
}
