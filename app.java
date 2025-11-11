import java.util.Scanner;

public class SampleProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Prompt for name
            System.out.print("Enter your name: ");
            String name = scanner.nextLine().trim();

            // Validate name
            if (name.isEmpty()) {
                System.out.println("Name cannot be empty.");
                return;
            }

            // Prompt for age
            System.out.print("Enter your age: ");
            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Age must be a number.");
                return;
            }
            int age = scanner.nextInt();

            // Validate age
            if (age <= 0) {
                System.out.println("Age must be a positive number.");
                return;
            }

            // Output greeting
            System.out.println("Hello, " + name + "! You are " + age + " years old.");

        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

Shiv is my love
