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

    @Test
    void grinch_should_beats_jack_skellington(){
        Player player1 = new Player("Etienne", "Jack Skellington");
        Player player2 = new Player("Ness", "Grinch");
        Game game = new Game(player1, player2);
        assertEquals("Grinch beats Jack Skellington, Ness wins", game.play());
    }

    @Test
    void santa_claws_beats_grinch(){
        Player player1 = new Player("Etienne", "Grinch");
        Player player2 = new Player("Ness", "Santa Claws");
        Game game = new Game(player1, player2);
        assertEquals("Santa Claws beats Grinch, Ness wins", game.play());
    }

    @Test
    void two_grinches_should_be_a_draw(){
        Player player1 = new Player("Etienne", "Grinch");
        Player player2 = new Player("Ness", "Grinch");
        Game game = new Game(player1, player2);
        assertEquals("draw", game.play());
    }

    @Test
    void if_mama_who_modifier_used_game_ends_in_draw(){
        Player player1 = new Player("Etienne", "Santa Claws", "Mama Who");
        Player player2 = new Player("Ness", "Grinch", "Barrel, Lock and Shock");
        Game game = new Game(player1, player2);
        assertEquals("draw", game.play());
    }

    @Test
    void if_elves_modifier_used_game_ends_in_draw(){
        Player player1 = new Player("Etienne", "Santa Claws", "Mama Who");
        Player player2 = new Player("Ness", "Grinch", "Elves in the Shelves");
        Game game = new Game(player1, player2);
        assertEquals("Ness wins!", game.play());
    }

}
