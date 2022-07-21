package game;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class WordChoserTest {
  @Test public void hasADictionary() {
    WordChoser choser = new WordChoser();
    String randomString = "DEVELOPER";
    assertEquals(choser.getRandomWordFromDictionary(), randomString);
  }
  
}
