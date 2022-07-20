package game;

public class Game {
  String wordToGuess = "";

  public Game(String word) {
    wordToGuess = word;
  }
  
  public static void main(String[] args) {

  }

  String getWordToGuess() {
    Integer lengthMinusOne = wordToGuess.length() - 1;
    String fill = "_".repeat(lengthMinusOne);
    char first = wordToGuess.charAt(0);
    return first + fill;
  }
  
}
