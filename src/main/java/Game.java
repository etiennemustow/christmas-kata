import java.util.HashMap;
import java.util.Map;

public class Game {
    private Player player1;
    private Player player2;

    public Game(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }


    public String play() {
        Map<String, String> playerMap = new HashMap<String, String>();
        playerMap.put("Jack Skellington","Santa Claws");
        playerMap.put("Grinch","Jack Skellington");
        playerMap.put("Santa Claws","Grinch");

        String character1 = player1.getCharacter();
        String character2 = player2.getCharacter();

        if(playerMap.get(character1).equalsIgnoreCase(character2)){
            return character1 + " beats " + character2 + ", " + player1.getName() + " wins";
        } if(playerMap.get(character2).equalsIgnoreCase(character1)){
            return character2 + " beats " + character1 + ", " + player2.getName() + " wins";
        }else {
           return "draw";
        }
    }
}
