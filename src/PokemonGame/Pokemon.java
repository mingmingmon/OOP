package PokemonGame;

import java.util.ArrayList;
import java.util.Scanner;

public class Pokemon {
    int id;
    String name;
    int offensivePower;
    int defensivePower;
    int healthPoint;
    Player myPlayer;
    ArrayList<String> types = new ArrayList<>();

    void read(int id, Scanner scanner){
        this.id = id;
        this.name = scanner.next();
        this.offensivePower = scanner.nextInt();
        this.defensivePower = scanner.nextInt();
        this.healthPoint = scanner.nextInt();
        while(true){
            String type = scanner.next();
            if(type.equals("0"))
                break;
            types.add(type);
        }
    }

    void print(){
        System.out.printf("[%d] %s (", id, name);

        int n = types.size();
        for (int i = 0; i < n - 1; i++) {
            System.out.printf("%s ", types.get(i));
        }
        System.out.printf("%s) ", types.get(n - 1));

        System.out.printf("공격력[%d] 방어력[%d] 체력[%d]\n",
                offensivePower, defensivePower, healthPoint);
    }

    boolean matches(String keyWord){
        if(name.contains(keyWord))
            return true;
        for(String type : types){
            if(type.equals(keyWord))
                return true;
        }
        return false;
    }

    void setPlayer(Player player){
        myPlayer = player;
    }

}
