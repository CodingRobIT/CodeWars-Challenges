package CodeWarsTry;

public class SmashWords {
    public static String smash(String[] words) {
        if (words.length == 0) {
            return "";
        }

        StringBuilder sentence = new StringBuilder(words[0]);

        for (int i = 1; i < words.length; i++) {
            sentence.append(" ").append(words[i]);
        }

        return sentence.toString();

    }

    public static void main(String[] args) {
        String[] wordArray = {"hello", "world", "this", "is", "great"};
        String result = smash(wordArray);
        System.out.println(result);  // Output: "hello world this is great"
    }
}

// Code Wars Sentence Smash >>> Instructions

// Sentence Smash
// Write a function that takes an array of words and smashes them together into a sentence and returns the sentence.
// You can ignore any need to sanitize words or add punctuation, but you should add spaces between each word.
// Be careful, there shouldn't be a space at the beginning or the end of the sentence!
//
// Example
// ['hello', 'world', 'this', 'is', 'great']  =>  'hello world this is great'

// Other Codes in CodeWars

//public class SmashWords {
//    public static String smash(String... words) {
//        return String.join(" ", words);
//    }
//}

//import java.util.Arrays;
//
//public class SmashWords {
//
//    public static String smash(String... words) {
//        return words != null ? String.join(" ", words) : null;
//    }
//}

//import java.util.Arrays;
//        import java.util.stream.*;
//
//public class SmashWords {
//
//    public static String smash(String... words) {
//        return Stream.of(words).collect(Collectors.joining(" "));
//    }
//}

// This next one is nice i like it

//import java.util.Arrays;
//
//public class SmashWords {
//
//    public static String smash(String... words) {
//        if (words != null)
//            return String.join(" ", Arrays.asList(words));
//        else
//            return null;
//    }
//}