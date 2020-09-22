package projectDictionary.ver1;

import java.util.Scanner;

public class DictionaryManagement {
    private Dictionary dict = new Dictionary();

    public void insertFromCommandline() {
        Scanner sc = new Scanner(System.in);
        int numberOfWords = sc.nextInt();
        String randomWord = sc.nextLine();
        String wordTarget, wordExplain;
        for (int i = 0; i < numberOfWords; i++) {
            wordTarget = sc.nextLine();
            wordExplain = sc.nextLine();
            Word newWord = new Word(wordTarget, wordExplain);
            dict.addWord(newWord);
        }
    }

    public void showWord(int i) {
        System.out.printf("| %-10d| %-11s| %s\n", i, dict.getWord(i).getWord_target(), dict.getWord(i).getWord_explain());
    }
    public void showAllWords() {
        System.out.println("| index     | word       | meaning ");
        for (int i = 0; i < Dictionary.currentIndex; i++) {
            showWord(i);
        }
    }
}
