package game;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GameTest {
  @Test public void testsGetsWordToGuess() {
    Game game = new Game();
    assertEquals(game.getWordToGuess(), "M_____");
  }

  @Test public void attemptsStartAtZero() {
    Game game = new Game();
    assertEquals(game.getRemainingAttempts(), Integer.valueOf(10));
  }
}
