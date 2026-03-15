import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Subject> subjects = new ArrayList<>();

        System.out.println("Welcome to Paritaj's AI Study Planner!");

        // Add subjects
        while (true) {
            System.out.print("Enter subject name (or 'done' to finish): ");
            String name = scanner.nextLine();
            if (name.equalsIgnoreCase("done")) break;
            int diff = 0;
            while (true) {
                System.out.print("Enter difficulty (1-5): ");
                try {
                    diff = Integer.parseInt(scanner.nextLine());
                    if (diff >= 1 && diff <= 5) break;
                    else System.out.println("Please enter a number between 1 and 5.");
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a number.");
                }
            }
            subjects.add(new Subject(name, diff));
        }

        // Exam date
        LocalDate examDate = null;
        while (true) {
            System.out.print("Enter exam date (YYYY-MM-DD): ");
            try {
                examDate = LocalDate.parse(scanner.nextLine());
                if (examDate.isAfter(LocalDate.now())) break;
                else System.out.println("Exam date must be in the future.");
            } catch (Exception e) {
                System.out.println("Invalid date format. Please use YYYY-MM-DD.");
            }
        }

        // Daily hours
        int hours = 0;
        while (true) {
            System.out.print("Enter available study hours per day: ");
            try {
                hours = Integer.parseInt(scanner.nextLine());
                if (hours > 0) break;
                else System.out.println("Please enter a positive number.");
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
            }
        }

        // Generate plan
        StudyPlan plan = new StudyPlan(subjects, examDate, hours);
        plan.generatePlan();
    }
}