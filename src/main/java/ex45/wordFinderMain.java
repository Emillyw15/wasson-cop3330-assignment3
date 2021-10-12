package ex45;
import ex45.wordFinder;

public class wordFinderMain {
    public static void main(String[] args) {
        wordFinder finder = new wordFinder();
        finder.replaceWord("src/main/java/ex45/exercise45_input.txt", "src/main/java/ex45/exercise45_output.txt", "utilize", "use");
    }
}
