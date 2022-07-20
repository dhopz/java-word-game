package game;

public class Game {
  String wordToGuess = "";

  public Game(String word) {
    wordToGuess = word;
  }
  
  public static void main(String[] args) {    
  }

  public String getWordToGuess() {
    StringBuilder builder = new StringBuilder();      
    for (int i = 0; i < this.wordToGuess.length(); i++) {     
      Character currentLetter = wordToGuess.charAt(0);
      if (i == 0) {
          builder.append(currentLetter);
      } else {
          builder.append("_");
      }
    }
    return builder.toString();
  }
  
}


