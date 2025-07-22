package week03_day4and5_LinearAndBinarySearch.LinearSearch;

public class SearchWordInSentences {
    public static void main(String[] args) {
        String[] sentences = {
            "Java is a popular language",
            "It is used for backend development",
            "Linear search is simple",
            "String handling is fun"
        };

        String word = "backend";
        String result = findSentenceWithWord(sentences, word);
        System.out.println("Result: " + result);
    }

    static String findSentenceWithWord(String[] sentences, String word) {
        for (String sentence : sentences) {
            if (sentence.contains(word)) {
                return sentence;
            }
        }
        return "Not Found";
    }
}
