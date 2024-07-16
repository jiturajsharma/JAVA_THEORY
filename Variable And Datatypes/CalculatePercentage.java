// Write a program to calculate percentage of a given student in CBSE board exam. His works forth 5 subjects must be taken as input from the keyword (must are out of 100)

import java.util.Scanner;



public class CalculatePercentage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter marks for Math: ");
        int math = scanner.nextInt();
        if (math < 0 || math > 100) {
            System.out.println("Invalid marks for Math. Please enter a value between 0 and 100.");
            System.exit(0);
        }

        System.out.print("Enter marks for English: ");
        int english = scanner.nextInt();
        if (english < 0 || english > 100) {
            System.out.println("Invalid marks for English. Please enter a value between 0 and 100.");
            System.exit(0);
        }

        System.out.print("Enter marks for Hindi: ");
        int hindi = scanner.nextInt();
        if (hindi < 0 || hindi > 100) {
            System.out.println("Invalid marks for Hindi. Please enter a value between 0 and 100.");
            System.exit(0);
        }

        System.out.print("Enter marks for Sanskrit: ");
        int sanskrit = scanner.nextInt();
        if (sanskrit < 0 || sanskrit > 100) {
            System.out.println("Invalid marks for Sanskrit. Please enter a value between 0 and 100.");
            System.exit(0);
        }

        System.out.print("Enter marks for Science: ");
        int science = scanner.nextInt();
        if (science < 0 || science > 100) {
            System.out.println("Invalid marks for Science. Please enter a value between 0 and 100.");
            System.exit(0);
        }

        int total = math + english + hindi + sanskrit + science;
        int percentage = total / 5;

        System.out.println("Percentage: " + percentage + "%");
    }
}
