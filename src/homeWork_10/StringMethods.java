package homeWork_10;

public class StringMethods {

    String doсument;

    public static boolean getStart(String doсument) {
        return doсument.startsWith("555");
    }

    public static boolean getEnd(String doсument) {
        return doсument.endsWith("1a2b");
    }

    public static String getReplace(String doсument) {
        return doсument.replace("aPs", "***").replace("Odh", "***");
    }

    public static String getBlocks(String doсument) {
        String blockOne = doсument.substring(0, 5);
        String blockTwo = doсument.substring(9, 13);
        return blockOne + blockTwo;
    }

    public static String getLetters(String doсument) {
        String letters = doсument.substring(5, 8) + "/" + doсument.substring(14, 17) + "/" + doсument.charAt(19) + "/" + doсument.charAt(21);
        return letters.toLowerCase();
    }

    public static boolean getSubsequence(String doсument) {
        return doсument.equalsIgnoreCase(String.valueOf(doсument.contains("abc")));
    }

    public static String getBigLetters(String doсument) {
        StringBuilder stringBuilder;
        stringBuilder = new StringBuilder("4820-aPs-4871-Odh-1a2b");
        stringBuilder.delete(0, 5).delete(3, 9).delete(6, 8).deleteCharAt(7);
        stringBuilder.insert(3, "/").insert(7, "/").insert(9, "/");
        return "Letters:" + stringBuilder.toString().toUpperCase();
    }
}
