package LabSheet04;

public class Q28WordCounter {
    static String language = "English";

    void countWords(String sentence) {
        String trimmedSentence = sentence.trim();
        String[] words = trimmedSentence.split("\\s+");
        int wordCount = words.length;

        System.out.println("Language: " + language);
        System.out.println("Sentence: " + sentence);
        System.out.println("Number of Words: " + wordCount);
    }

    public static void main(String[] args) {
        String sentence = "Java is easy to learn";

        Q28WordCounter w = new Q28WordCounter();
        w.countWords(sentence);
    }
}
