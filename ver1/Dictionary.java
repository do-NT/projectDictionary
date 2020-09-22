package projectDictionary.ver1;

public class Dictionary {
    Word[] word = new Word[3000];
    public static int currentIndex = 0;

    public Word getWord(int i) {
        return word[i];
    }

    public void addWord(Word newWord) {
        word[currentIndex++] = newWord;
    }
}
