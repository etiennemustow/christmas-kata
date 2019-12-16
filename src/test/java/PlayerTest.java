import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayerTest {

    @Test
    void jack_skellington_should_beat_santa_claws(){
        Player player1 = new Player("Etienne", "Jack Skellington");
        Player player2 = new Player("Ness", "Santa Claws");
        Game game = new Game(player1, player2);
        assertEquals("Jack Skellington beats Santa Claws, Etienne wins", game.play());
    }

}