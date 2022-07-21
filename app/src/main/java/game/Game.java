package game;

import java.util.ArrayList;

public class Game {
  private String wordToGuess;
  private Integer remainingAttempts = 10;
  private ArrayList<Character> guessedlLetters = new ArrayList<Character>();

  public Game(WordChoser choser) {
    // WordChoser choser = new WordChoser();
    this.wordToGuess = choser.getRandomWordFromDictionary();
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

  public Integer getRemainingAttempts() {
    return remainingAttempts;
  }

  // public String guessLetter(String letter){
  //   String endResult = "";
  //   if (this.wordToGuess.contains(letter)) {
  //     endResult =  "This letter is in the word";
  //   } else {
  //     endResult = "This letter is not in the word";
  //     this.remainingAttempts = this.remainingAttempts - 1;
  //   }
  //   return endResult;
  // }

  public Boolean guessLetter(Character letter) {
    if (this.wordToGuess.indexOf(letter) != -1) {
        guessedlLetters.add(letter);
        return true;
    } else {
        remainingAttempts--;
        return false;
    }
}

  
  
}


