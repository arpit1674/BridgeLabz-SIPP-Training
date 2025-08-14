package day8_onWorkshop;

import java.io.*;
import java.nio.file.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class DocuVault {
    private static final String DATA_DIR = "DocuVaultData";
    private static final String TRASH_DIR = DATA_DIR + File.separator + "Trash";
    private static final String LOG_FILE = DATA_DIR + File.separator + "activity.log";

    public static void main(String[] args) throws IOException {
        setupDirectories();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter username: ");
        String username = sc.nextLine();

        while (true) {
            System.out.println("\n==== DocuVault Menu ====");
            System.out.println("1. Upload Document");
            System.out.println("2. Read Document");
            System.out.println("3. Append Content to Document");
            System.out.println("4. Search Keyword");
            System.out.println("5. Delete Document (Move to Trash)");
            System.out.println("6. Display Total Storage Used");
            System.out.println("7. Exit");
            System.out.print("Choose: ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1 -> uploadDocument(username, sc);
                case 2 -> readDocument(sc);
                case 3 -> appendContent(username, sc);
                case 4 -> searchKeyword(sc);
                case 5 -> deleteDocument(username, sc);
                case 6 -> displayStorage();
                case 7 -> {
                    System.out.println("Exiting...");
                    return;
                }
                default -> System.out.println("Invalid choice!");
            }
        }
    }

    // Create directories if not exist
    private static void setupDirectories() {
        new File(DATA_DIR).mkdirs();
        new File(TRASH_DIR).mkdirs();
    }

    private static void uploadDocument(String username, Scanner sc) {
        try {
            System.out.print("Enter file name to upload: ");
            String fileName = sc.nextLine();
            File file = new File(DATA_DIR, fileName);

            System.out.println("Enter file content (end with an empty line):");
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
                String line;
                while (!(line = sc.nextLine()).isEmpty()) {
                    writer.write(line);
                    writer.newLine();
                }
            }
            logActivity(username, fileName, "UPLOAD");
            System.out.println("File uploaded successfully.");
        } catch (IOException e) {
            System.out.println("Error uploading file: " + e.getMessage());
        }
    }

    private static void readDocument(Scanner sc) {
        try {
            System.out.print("Enter file name to read: ");
            String fileName = sc.nextLine();
            File file = new File(DATA_DIR, fileName);

            if (!file.exists()) {
                System.out.println("File not found.");
                return;
            }

            try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                String line;
                System.out.println("\n--- File Content ---");
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    private static void appendContent(String username, Scanner sc) {
        try {
            System.out.print("Enter file name to append: ");
            String fileName = sc.nextLine();
            File file = new File(DATA_DIR, fileName);

            if (!file.exists()) {
                System.out.println("File not found.");
                return;
            }

            System.out.println("Enter content to append (end with empty line):");
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
                String line;
                while (!(line = sc.nextLine()).isEmpty()) {
                    writer.write(line);
                    writer.newLine();
                }
            }
            logActivity(username, fileName, "APPEND");
            System.out.println("Content appended successfully.");
        } catch (IOException e) {
            System.out.println("Error appending content: " + e.getMessage());
        }
    }

    private static void searchKeyword(Scanner sc) {
        System.out.print("Enter keyword to search: ");
        String keyword = sc.nextLine();

        File dir = new File(DATA_DIR);
        File[] files = dir.listFiles((f) -> f.isFile() && !f.getName().equals("activity.log"));

        if (files != null) {
            System.out.println("Files containing keyword:");
            for (File file : files) {
                try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                    String line;
                    boolean found = false;
                    while ((line = br.readLine()) != null) {
                        if (line.contains(keyword)) {
                            found = true;
                            break;
                        }
                    }
                    if (found) System.out.println(file.getName());
                } catch (IOException e) {
                    System.out.println("Error reading file: " + file.getName());
                }
            }
        }
    }

    private static void deleteDocument(String username, Scanner sc) {
        try {
            System.out.print("Enter file name to delete: ");
            String fileName = sc.nextLine();
            File file = new File(DATA_DIR, fileName);

            if (!file.exists()) {
                System.out.println("File not found.");
                return;
            }

            System.out.print("Are you sure you want to delete? (yes/no): ");
            String confirm = sc.nextLine();
            if (!confirm.equalsIgnoreCase("yes")) {
                System.out.println("Deletion cancelled.");
                return;
            }

            Files.move(file.toPath(), new File(TRASH_DIR, fileName).toPath(), StandardCopyOption.REPLACE_EXISTING);
            logActivity(username, fileName, "DELETE (Moved to Trash)");
            System.out.println("File moved to Trash.");
        } catch (IOException e) {
            System.out.println("Error deleting file: " + e.getMessage());
        }
    }

    private static void displayStorage() {
        File dir = new File(DATA_DIR);
        long totalSize = 0;

        File[] files = dir.listFiles((f) -> f.isFile());
        if (files != null) {
            for (File file : files) {
                totalSize += file.length();
            }
        }

        System.out.printf("Total Storage Used: %.2f KB%n", totalSize / 1024.0);
    }

    private static void logActivity(String username, String fileName, String action) {
        try (BufferedWriter logWriter = new BufferedWriter(new FileWriter(LOG_FILE, true))) {
            String timeStamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
            logWriter.write(username + " | " + fileName + " | " + timeStamp + " | " + action);
            logWriter.newLine();
        } catch (IOException e) {
            System.out.println("Error logging activity: " + e.getMessage());
        }
    }
}

