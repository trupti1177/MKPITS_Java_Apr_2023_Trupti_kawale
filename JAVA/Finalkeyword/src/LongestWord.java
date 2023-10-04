import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class LongestWord {
    public static void main(String [ ] args) throws FileNotFoundException {
        new LongestWord ().findLongestWords();
    }

    public String findLongestWords() throws FileNotFoundException {

        String longest_word = "";
        String current;
        Scanner scanner = new Scanner(new File("/Desktop/test.txt"));


        while (scanner.hasNext()) {
            current = scanner.next();
            if (current.length() > longest_word.length()) {
                longest_word = current;
            }

        }
        System.out.println("\n"+longest_word+"\n");
        return longest_word;
    }
}















