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
        Map<String, String> playerMap = getResolutionTriangle();


        var lowercaseModifier1 = player1.getModifier().toLowerCase();

        if(lowercaseModifier1.equals("mama who") || player2.getModifier().equals("Mama Who")){
            return "draw";
        }

        return getResults(playerMap, player1, player2);
    }

    private String getResults(Map<String, String> cardToTheCardItBeatsMap, Player player1, Player player2) {
        String character1 = player1.getCharacter();
        String character2 = player2.getCharacter();

        String theCardPlayer1WantsToBeat = cardToTheCardItBeatsMap.get(character1);
        if(theCardPlayer1WantsToBeat.equalsIgnoreCase(character2)){
            return character1 + " beats " + character2 + ", " + player1.getName() + " wins";
        }
        if(cardToTheCardItBeatsMap.get(character2).equalsIgnoreCase(character1)){
            return character2 + " beats " + character1 + ", " + player2.getName() + " wins";
        }
        checkElvesInTheShelves(player1);
        checkElvesInTheShelves(player2);
        return "draw";
        }

    private String checkElvesInTheShelves(Player player) {
        if(player.getModifier().equalsIgnoreCase("Elves in the Shelves")){
            return player.getName() + "wins!";
        }
        return null;
    }



    private Map<String, String> getResolutionTriangle() {
        Map<String, String> playerMap = new HashMap<String, String>();
        playerMap.put("Jack Skellington","Santa Claws");
        playerMap.put("Grinch","Jack Skellington");
        playerMap.put("Santa Claws","Grinch");

        Map.of("Jack Skellington","Santa Claws",
         "Grinch","Jack Skellington",
         "Santa Claws","Grinch"
        );


        return playerMap;
    }
}
