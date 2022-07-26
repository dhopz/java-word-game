package game;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.Test;

public class GameTest {
  @Test public void testsGetsWordToGuess() {
    WordChoser mockedWordChoser = mock(WordChoser.class);
    when(mockedWordChoser.getRandomWordFromDictionary()).thenReturn("DEVELOPER");
    
    Game game = new Game(mockedWordChoser);
    assertEquals(game.getWordToGuess(), "D________");
  }

  @Test public void attemptsStartAtZero() {
    WordChoser mockedWordChoser = mock(WordChoser.class);
    when(mockedWordChoser.getRandomWordFromDictionary()).thenReturn("DEVELOPER");
    
    Game game = new Game(mockedWordChoser);
    assertEquals(game.getRemainingAttempts(), Integer.valueOf(10));
  }

  @Test public void testsGuessLetter() {
    WordChoser mockedWordChoser = mock(WordChoser.class);
    when(mockedWordChoser.getRandomWordFromDictionary()).thenReturn("DEVELOPER");

    Game game = new Game(mockedWordChoser);
    // game.guessLetter('Z');
    assertEquals(game.guessLetter('P'), true); 
  }

  @Test public void testGuessLetterWrong() {
    WordChoser mockedChoser = mock(WordChoser.class);
    when(mockedChoser.getRandomWordFromDictionary()).thenReturn("MAKERS");

    Game game = new Game(mockedChoser);

    assertEquals(game.guessLetter('O'), false);
}
}
