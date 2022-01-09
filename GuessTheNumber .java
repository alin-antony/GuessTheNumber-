//finding the number guessed by the computer//

import java.util.Scanner;
public class GuessTheNumber {
    public static void main(String[] args) {
        int range = (int) (Math.random() * 30 + 1);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive number below 30:");
        int Number = sc.nextInt();

        int count = 1;
        while (Number != range) {
            count++;
            if (Number < range)
                System.out.println(Number + " is smaller than the guessed number!!!");
            else
                System.out.println(Number + " is greater than the guessed number!!!");
            System.out.println("Enter another number: ");
            Number = sc.nextInt();
            if (count >= 5) {
                System.out.println("better luck next time!!");
                System.exit(0);
            }

        }
        if (count == 1)
                    System.out.println("Brillient!!\ncongratulation");
                else if (count == 2)
                    System.out.println("good job!!\ncongratulation");
                else if (count == 3)
                    System.out.println("good try!!\ncongratulation");
                else if (count == 4)
                    System.out.println("you win!!\ncongratulation");

    }
        }