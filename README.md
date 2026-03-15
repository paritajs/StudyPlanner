# AI Study Planner

## Overview
AI Study Planner is a Java 17 console application that helps students generate a personalized daily study schedule based on their exam date, subjects, difficulty levels, and available study hours. The application allocates study time to each subject proportionally to its difficulty, ensuring efficient preparation for exams.

## Features
- Add multiple subjects with custom difficulty levels (1-5)
- Enter your exam date
- Specify your available study hours per day
- Automatically generates a daily study plan, distributing hours based on subject difficulty
- User-friendly console interface with input validation

## How It Works
1. **Input Subjects:** Enter each subject and assign a difficulty level (1 = easy, 5 = hard).
2. **Set Exam Date:** Provide the date of your exam (format: YYYY-MM-DD).
3. **Set Daily Hours:** Enter the number of hours you can study each day.
4. **Get Your Plan:** The app calculates and displays how many hours per day to spend on each subject, repeating this plan until your exam date.

## Example
```
Welcome to AI Study Planner!
Enter subject name (or 'done' to finish): Math
Enter difficulty (1-5): 3
Enter subject name (or 'done' to finish): English
Enter difficulty (1-5): 2
Enter subject name (or 'done' to finish): done
Enter exam date (YYYY-MM-DD): 2026-04-30
Enter available study hours per day: 2

--- Your Daily Study Plan ---
Math: 1.20 hours/day
English: 0.80 hours/day
Repeat this plan each day until your exam on 2026-04-30
```

## How to Run
1. Open a terminal in the project root directory.
2. Compile the source files:
   ```
   javac -d out src/*.java
   ```
3. Run the application:
   ```
   java -cp out Main
   ```

## Requirements
- Java 17 or higher

## Project Structure
```
StudyPlanner/
├── src/
│   ├── Main.java
│   ├── Subject.java
│   └── StudyPlan.java
└── README.md
```
