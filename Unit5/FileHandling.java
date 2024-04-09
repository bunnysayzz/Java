import java.io.*;

public class FileHandling {

    public static void main(String[] args) {
        // File path
        String filePath = "example.txt";

        // Writing to file
        writeToFile(filePath, "Hello, World!");

        // Reading from file
        String content = readFromFile(filePath);
        System.out.println("Content read from file: " + content);
        
        // Appending to file
        appendToFile(filePath, "\nThis is an additional line.");

        // Reading again after appending
        content = readFromFile(filePath);
        System.out.println("Content after appending: " + content);
        
        // Deleting the file
        deleteFile(filePath);
    }

    // Method to write content to a file
    public static void writeToFile(String filePath, String content) {
        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write(content);
            System.out.println("Content written to file successfully.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }

    // Method to read content from a file
    public static String readFromFile(String filePath) {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
        return content.toString();
    }

    // Method to append content to a file
    public static void appendToFile(String filePath, String content) {
        try (FileWriter writer = new FileWriter(filePath, true)) {
            writer.write(content);
            System.out.println("Content appended to file successfully.");
        } catch (IOException e) {
            System.out.println("Error appending to file: " + e.getMessage());
        }
    }

    // Method to delete a file
    public static void deleteFile(String filePath) {
        File file = new File(filePath);
        if (file.exists()) {
            if (file.delete()) {
                System.out.println("File deleted successfully.");
            } else {
                System.out.println("Failed to delete the file.");
            }
        } else {
            System.out.println("File does not exist.");
        }
    }
}
