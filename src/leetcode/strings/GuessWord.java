package leetcode.strings;

import java.util.Random;

interface Master {
    public int guess(String word);
}

class Checker implements Master {
    private String secretWord;

    public void setSecretWord(String secretWord) {
        if (this.secretWord.length() != 6) return;
        this.secretWord = secretWord;
    }

    @Override
    public int guess(String word) {
        return 0;
    }
}
public class GuessWord {
    public void findSecretWord(String[] words, Master master) {
        //random index
        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            //choose random index and use that word to make a guess
            String candidate = words[rand.nextInt(words.length)];
            int matches = master.guess(candidate);
            if(matches == candidate.length()) return; //guessed correctly
        }

    }

    public static void main(String[] args) {

    }
}
