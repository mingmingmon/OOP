package Week3.HomeWork;
import java.util.*;

public class Center {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Pokemon> pokemonList = new ArrayList<>();
    ArrayList<Player> playerList = new ArrayList<>();

    void run(){
        System.out.println("센터에 오신 것을 환영합니다.\n");
        while(true){
            System.out.println("메뉴를 선택하세요.\n");
            System.out.println("1. 포켓몬 입력하기\n2. 전체 포켓몬 출력하기");
            System.out.println("3. 플레이어 입력하기\n4. 전체 플레이어 출력하기");
            System.out.println("5. 포켓몬 검색하기\n6. 플레이어 검색하기");
            System.out.println("0. 포켓몬 센터 나가기");

            System.out.print("메뉴 : ");
            int menu = scanner.nextInt();
            switch(menu){
                case gn1 : readAllPokemons();
                System.out.println("");
                break;
                case 2 : printAllPokemons();
                System.out.println("");
                break;
                case 3 : readAllPlayers();
                System.out.println("");
                break;
                case 4 : printAllPlayers();
                System.out.println("");
                break;
                case 5 : searchPokemon();
                System.out.println("");
                break;
                case 6 : searchPlayer();
                System.out.println("");
                break;
                case 0 : return;
            }
        }
    }

    void readAllPokemons(){
        System.out.println("==== 포켓몬 정보 입력 ====");
        while(true){
            Pokemon pokemon = new Pokemon();
            int id = scanner.nextInt();
            if(id == 0)
                break;
            pokemon.read(id, scanner);
            pokemonList.add(pokemon);
        }
    }

    void readAllPlayers(){
        System.out.println("==== 플레이어 정보 입력 ====");
        while(true){
            Player player = new Player();
            String name = scanner.next();
            if(name.equals("end"))
                break;
            player.read(name ,scanner, this);
        }
    }

    void printAllPokemons(){
        System.out.println("==== 전체 포켓몬 출력 ====");
        for(Pokemon pokemon : pokemonList){
            pokemon.print();
        }
    }

    void printAllPlayers(){
        System.out.println("==== 전체 플레이어 출력 ====");
        for(Player player : playerList){
            player.print();
        }
    }

    Pokemon findPokemon(int id){
        return pokemonList.get(id - 1);
    }

    void searchPokemon(){
        System.out.println("==== 포켓몬 검색 ====");
        scanner.nextLine();
        String keyWord;
        while(true){
            System.out.print("키워드 :");
            keyWord = scanner.nextLine();
            if(keyWord.equals("end"))
                break;
            for(Pokemon pokemon : pokemonList){
                if(pokemon.matches(keyWord))
                    pokemon.print();
            }
            System.out.println("");
        }
    }

    void searchPlayer(){
        System.out.println("==== 플레이어 검색 ====");
        scanner.nextLine();
        String keyWord;
        while(true){
            System.out.print("키워드 :");
            keyWord = scanner.nextLine();
            if(keyWord.equals("end"))
                break;
            for(Player player : playerList){
                if(player.matches(keyWord))
                    player.print();
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Center myCenter = new Center();
        myCenter.run();
    }
}


