import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String fakeNumber;
        int nowANumber;
        int number = 0;
        int times = 0;
        int greater = 0;
        int lower = 0;

        System.out.println("\nNo Arrays Here");
        System.out.println();

        while(true) {
            System.out.print("Enter a number (0 to quit): ");
            fakeNumber = input.nextLine();

            if(fakeNumber.isEmpty()) {
                System.out.println("\nPlease, make sure to input something.");
                System.out.println();
                continue;
            }

            try {
                nowANumber = Integer.parseInt(fakeNumber);
            } catch(NumberFormatException e) {
                System.out.println("\nInvalid input detected!");
                System.out.println();
                continue;
            }

            if(nowANumber != 0) {
                if(times == 0) {
                    greater = nowANumber;
                } else if(nowANumber > greater) {
                    greater = nowANumber;
                }

                if(times == 0) {
                    lower = nowANumber;
                } else if(nowANumber < lower) {
                    lower = nowANumber;
                }
            }

            number += nowANumber;
            times += 1;

            if(nowANumber == 0) {
                break;
            }
        }

        double avg = (number + 0.0) / (times - 1.0);

        System.out.println("\nTotal sum: " + number);
        System.out.println("Average: " + avg);
        System.out.println("Greater: " + greater);
        System.out.println("Lower: " + lower);
        System.out.println("Total of numbers: " + (times - 1));

        input.close();
    }
}