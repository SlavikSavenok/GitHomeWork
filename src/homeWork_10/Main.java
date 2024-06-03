package homeWork_10;

public class Main extends StringMethods {
    public static void main(String[] args) {
        String dokument = "4820-aPs-4871-Odh-1a2b";

        System.out.println("two blocks with numbers: " + getBlocks(dokument));
        System.out.println("block replacement: " + getReplace(dokument));
        System.out.println("document letters: " + getLetters(dokument));
        System.out.println("does the document number begin with 555: " + getStart(dokument));
        System.out.println("does the document number end with 1a2b: " + getEnd(dokument));
        System.out.println("is there a sequence (abc): " + getSubsequence(dokument));
        System.out.println(getBigLetters(dokument));
    }
}
