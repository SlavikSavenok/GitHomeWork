package homeWork_10;

public class Main extends StringMethods {
    public static void main(String[] args) {
        String doсument = "4820-aPs-4871-Odh-1a2b";

        System.out.println("two blocks with numbers: " + getBlocks(doсument));
        System.out.println("block replacement: " + getReplace(doсument));
        System.out.println("document letters: " + getLetters(doсument));
        System.out.println("does the document number begin with 555: " + getStart(doсument));
        System.out.println("does the document number end with 1a2b: " + getEnd(doсument));
        System.out.println("is there a sequence (abc): " + getSubsequence(doсument));
        System.out.println(getBigLetters(doсument));
    }
}
