// Scenario 10: Survey Data Analysis
// In a survey data analysis application, create an array to store the responses of participants to survey questions. Perform operations such as calculating the percentage of participants with specific responses, generating charts or graphs based on the survey data, and extracting insights from the responses.

import java.util.Scanner;

public class Task10 {
    private static final int MAX_PARTICIPANTS = 100;
    private static final int MAX_QUESTIONS = 5;
    private static int[][] responses = new int[MAX_PARTICIPANTS][MAX_QUESTIONS];
    private static int participantCount = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Survey Data Analysis System");
            System.out.println("1. Add Participant Response");
            System.out.println("2. Calculate Percentage of Specific Responses");
            System.out.println("3. Generate Survey Report");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    addParticipantResponse(scanner);
                    break;
                case 2:
                    calculateResponsePercentage(scanner);
                    break;
                case 3:
                    generateSurveyReport();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void addParticipantResponse(Scanner scanner) {
        if (participantCount == MAX_PARTICIPANTS) {
            System.out.println("Cannot add more participants.");
            return;
        }
        System.out.println("Enter responses for " + MAX_QUESTIONS + " questions (1-5 scale):");
        for (int i = 0; i < MAX_QUESTIONS; i++) {
            System.out.print("Question " + (i + 1) + ": ");
            responses[participantCount][i] = scanner.nextInt();
        }
        participantCount++;
        System.out.println("Participant responses added successfully.");
    }

    private static void calculateResponsePercentage(Scanner scanner) {
        System.out.print("Enter question number (1-" + MAX_QUESTIONS + "): ");
        int questionNumber = scanner.nextInt();
        System.out.print("Enter response value (1-5): ");
        int responseValue = scanner.nextInt();

        if (questionNumber < 1 || questionNumber > MAX_QUESTIONS || responseValue < 1 || responseValue > 5) {
            System.out.println("Invalid input.");
            return;
        }

        int count = 0;
        for (int i = 0; i < participantCount; i++) {
            if (responses[i][questionNumber - 1] == responseValue) {
                count++;
            }
        }

        double percentage = (double) count / participantCount * 100;
        System.out.println("Percentage of participants who gave response " + responseValue + " for question " + questionNumber + ": " + String.format("%.2f", percentage) + "%");
    }

    private static void generateSurveyReport() {
        if (participantCount == 0) {
            System.out.println("No participants to display.");
            return;
        }

        System.out.println("Survey Report:");
        for (int q = 0; q < MAX_QUESTIONS; q++) {
            System.out.println("Question " + (q + 1) + " responses:");
            int[] responseCount = new int[5];
            for (int p = 0; p < participantCount; p++) {
                responseCount[responses[p][q] - 1]++;
            }
            for (int r = 0; r < 5; r++) {
                double percentage = (double) responseCount[r] / participantCount * 100;
                System.out.println("Response " + (r + 1) + ": " + responseCount[r] + " (" + String.format("%.2f", percentage) + "%)");
            }
        }
    } 
}
