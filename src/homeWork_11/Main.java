package homeWork_11;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String document;
        Set<String> documents = new HashSet<>();

        System.out.println("Enter document numbers. To complete your entry, enter 'Done': ");

        do {
            document = scanner.nextLine();
            documents.add(document);

        } while (!document.equals("Done"));


        Map<String, String> processedDocuments = new HashMap<>();

        for (String doc : documents) {
            processedDocuments.put(doc, validateDocument(doc));
        }
        for (Map.Entry<String, String> entry : processedDocuments.entrySet()) {
            System.out.println("Document number: " + entry.getKey() + " " + entry.getValue());

        }
    }

    private static String validateDocument(String document) {

        if (document.length() != 15) {
            return " - document is not the correct length: document must be 15 characters long. ";
        }
        if (!(document.startsWith("docnum") || document.startsWith("kontract"))) {
            return " - Incorrect document start sequence: document must start with 'docnгm' or 'kontract' ";

        }
        return " - document is valid";


    }

}

