package projectDictionary.ver1;

public class DictionaryCommandline {
    public void dictionaryBasic() {
        DictionaryManagement d = new DictionaryManagement();
        d.insertFromCommandline();
        d.showAllWords();
    }

    public static void main(String[] args) {
        DictionaryCommandline dC = new DictionaryCommandline();
        dC.dictionaryBasic();
    }
}
