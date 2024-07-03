import java.util.Scanner;
import java.util.LinkedHashMap;
import java.util.ArrayList;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Info info = new Info();

    public static void main(String[] args) {
        displayMenu();
        scanner.close();
        System.out.println("Exiting...");
    }

    static int choice = 0;

    private static void displayMenu() {
        System.out.println("\n=== Algorithm Complexity Analyzer ===");
        System.out.println("    -----     Main Menu     ----");
        System.out.println("1. Searching Algorithms");
        System.out.println("2. Sorting Algorithms");
        System.out.println("3. Stack");
        System.out.println("4. Queue");
        System.out.println("5. Linked List");
        System.out.println("6. Tree");
        System.out.println("7. Graph");
        System.out.print("Enter your choice (1-7): ");
        choice = getUserChoice(1, 7);
        handleCategoryChoice(choice);
    }

    private static int getUserChoice(int min, int max) {
        int choice;
        while (true) {
            try {
                choice = Integer.parseInt(scanner.nextLine());
                if (choice < min || choice > max) {
                    System.out.print("Please enter a number between " + min + " and " + max + ": ");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.print("Invalid input. Please enter a number: ");
            }
        }
        return choice;
    }

    private static void handleCategoryChoice(int choice) {
        switch (choice) {
            case 1:
                displaySubOptions("Searching Algorithms");
                break;
            case 2:
                displaySubOptions("Sorting Algorithms");
                break;
            case 3:
                displaySubOptions("Stack");
                break;
            case 4:
                displaySubOptions("Queue");
                break;
            case 5:
                displaySubOptions("Linked List");
                break;
            case 6:
                displaySubOptions("Tree");
                break;
            case 7:
                displaySubOptions("Graph");
                break;
            default:
                System.out.println("Invalid choice. Please enter a number between 1 and 7.");
        }
    }

    private static void displaySubOptions(String category) {
        LinkedHashMap<String, String> subOptions = info.subOptionsMap.get(category);
        System.out.println("\nSuboptions for " + category + ":");
        int i = 1;
        for (String algorithm : subOptions.keySet()) {
            System.out.println(i + ". " + algorithm);
            i++;
        }
        System.out.print("Enter your choice (1-" + subOptions.size() + "): ");
        int subChoice = getUserChoice(1, subOptions.size());
        handleSubOptionChoice(category, subChoice, subOptions);
    }

    private static void handleSubOptionChoice(String category, int subChoice, LinkedHashMap<String, String> subOptions) {
        ArrayList<String> algorithmList = new ArrayList<>(subOptions.keySet());
        String selectedAlgorithm = algorithmList.get(subChoice - 1);
        displayComplexities(category, selectedAlgorithm);
    }

    private static void displayComplexities(String category, String subOption) {
        System.out.println("\nComplexities for " + subOption + ":");
        System.out.println(info.subOptionsMap.get(category).get(subOption));
        System.out.print("\nDo you want an explanation for any of these complexities? (yes/no): ");
        String explanationChoice = getYesNoChoice();
        if (explanationChoice.equals("yes")) {
            displayExplanation(subOption);
        } else {
            System.out.print("1. Go to main menu");
            System.out.print("\t\t2. Stay in the same sub-option");
            System.out.println("\t\t3. Exit");
            System.out.print("Enter your choice: ");
            int n = getUserChoice(1, 3);
            if (n == 1) {
                displayMenu();
            } else if (n == 2) {
                handleCategoryChoice(choice);
            } else {
                System.exit(0);
            }
        }
    }

    private static String getYesNoChoice() {
        String choice;
        while (true) {
            choice = scanner.nextLine().toLowerCase();
            if (choice.equals("yes") || choice.equals("no")) {
                break;
            } else {
                System.out.print("Invalid input. Please enter 'yes' or 'no': ");
            }
        }
        return choice;
    }

    private static void displayExplanation(String subOption) {
        int complexityChoice;
        String complexity = null;

        while (true) {
            System.out.println("Select the complexity you want an explanation for:");
            System.out.print("1. Worst Case");
            System.out.print("\t2. Average Case");
            System.out.print("\t  3. Best Case");
            System.out.println("\t4. Space Complexity");
            System.out.print("Enter your choice (1-4): ");
            complexityChoice = getUserChoice(1, 4);
            switch (complexityChoice) {
                case 1:
                    complexity = "Worst Case";
                    break;
                case 2:
                    complexity = "Average Case";
                    break;
                case 3:
                    complexity = "Best Case";
                    break;
                case 4:
                    complexity = "Space Complexity";
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
                    continue;
            }
            break;
        }

        // Display the explanation for the selected complexity
        System.out.println("\nExplanation for " + complexity + ":");
        System.out.println(info.explanationMap.get(subOption).get(complexity));
        
        System.out.print("\nDo you want an explanation for any other complexity? (yes/no): ");
        String question = getYesNoChoice();
        if (question.equals("yes")) {
            displayExplanation(subOption);
        } else {
            System.out.println("1. Go to main menu");
            System.out.println("2. Stay in the same sub-option");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int n = getUserChoice(1, 3);
            if (n == 1) {
                displayMenu();
            } else if (n == 2) {
                handleCategoryChoice(choice);
            } else {
                System.exit(0);
            }
        }
    }

}
