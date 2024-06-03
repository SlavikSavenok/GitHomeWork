package homeWork_10;

public class StringMethods {

    String dokument;

    public static boolean getStart(String dokument) {
        return dokument.startsWith("555");
    }

    public static boolean getEnd(String dokument) {
        return dokument.endsWith("1a2b");
    }

    public static String getReplace(String dokument) {
        return dokument.replace("aPs", "***").replace("Odh", "***");
    }

    public static String getBlocks(String dokument) {
        String blockOne = dokument.substring(0, 5);
        String blockTwo = dokument.substring(9, 13);
        return blockOne + blockTwo;
    }

    public static String getLetters(String dokument) {
        String letters = dokument.substring(5, 8) + "/" + dokument.substring(14, 17) + "/" + dokument.charAt(19) + "/" + dokument.charAt(21);
        return letters.toLowerCase();
    }

    public static boolean getSubsequence(String dokument) {
        return dokument.contains("adc");
    }

    public static String getBigLetters(String dokument) {
        StringBuilder stringBuilder;
        stringBuilder = new StringBuilder("4820-aPs-4871-Odh-1a2b");
        stringBuilder.delete(0, 5).delete(3, 9).delete(6, 8).deleteCharAt(7);
        stringBuilder.insert(3, "/").insert(7, "/").insert(9, "/");
        return "Letters:" + stringBuilder.toString().toUpperCase();
    }
}
