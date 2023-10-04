public class Excite {
    public static void main(String[] args) {
        String allWords = String.join(" ", args);
        String excitedAllWords = allWords.toUpperCase() + "!!!";
        System.out.println(excitedAllWords);
    }
}