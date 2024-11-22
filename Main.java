import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        WordChecker w = new WordChecker();
        ArrayList<String> words = new ArrayList<String>();
        words.add ("an");
        words.add ("band");
        words.add ("band");
        words.add ("abandon");
        System.out.println(words);
        WordChecker x = new WordChecker(words);
        System.out.println(x.isWordChain());
        words = new ArrayList<String>();
        x = new WordChecker(words);
        words.add("to");
        words.add("too");
        words.add("stool");
        words.add("tools");
        System.out.println(x.getWordList());
        System.out.println(x.isWordChain());
        WordChecker y = new WordChecker(words);
        words.add("catch");
        words.add("bobcat");
        words.add("catchacat");
        words.add("cat");
        words.add("at");
        System.out.println(y.createList("cat"));
        System.out.println(y.createList("catch"));
        System.out.println(y.createList("dog"));
    }
}
