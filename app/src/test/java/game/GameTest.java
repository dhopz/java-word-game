package game;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GameTest {
  @Test public void testsGetsWordToGuess() {
    Game game = new Game("Makers");
    assertEquals(game.getWordToGuess(), "M_____");
  }
}
