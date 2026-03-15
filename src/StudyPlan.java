import java.time.LocalDate;
import java.util.*;

public class StudyPlan {
    private List<Subject> subjects;
    private LocalDate examDate;
    private int dailyHours;

    public StudyPlan(List<Subject> subjects, LocalDate examDate, int dailyHours) {
        this.subjects = subjects;
        this.examDate = examDate;
        this.dailyHours = dailyHours;
    }

    public void generatePlan() {
        if (subjects.isEmpty() || examDate == null || dailyHours <= 0) {
            System.out.println("Please provide all required information.");
            return;
        }
        LocalDate today = LocalDate.now();
        long days = java.time.temporal.ChronoUnit.DAYS.between(today, examDate);
        if (days <= 0) {
            System.out.println("Exam date must be in the future.");
            return;
        }

        int totalDifficulty = subjects.stream().mapToInt(Subject::getDifficulty).sum();
        System.out.println("\n--- Your Daily Study Plan ---");
        for (Subject subject : subjects) {
            double subjectHours = ((double) subject.getDifficulty() / totalDifficulty) * dailyHours;
            System.out.printf("%s: %.2f hours/day\n", subject.getName(), subjectHours);
        }
        System.out.println("Repeat this plan each day until your exam on " + examDate);
    }
}
