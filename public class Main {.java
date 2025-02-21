import java.util.Scanner;

public class Main averageNumbers {
   // Q8
    public static void main (String []args) {
       Scanner scanner = new Scanner(System.in);

       double sum = 0;
       int count = 0;
       double num;
       
       while (true) {
        system.out.print("Would you like to input a real number? (yes/no):");
        response = scanner.nextLine();
        if (scanner.hasNexDouble()){
            num = scanner.nextDouble();
            sum+=num;
            count++;

        }

        else  {
            String input = scanner.next();
            if(input = false){
                break;
            }
            else{
                System.out.println("Invalid input");
            }
    }


    if (count > 0) {
        double average = sum / count;
        System.out.println("The average of the numbers entered is: " + average);
    } else {
        System.out.println("No numbers were entered.");
    }

    scanner.close();
}
       }
       
        // Q1
        /* When the user inputs 3, the output will result in "hello 3", when that int does not meet the loop, it asks for another user input,
         and when the user inputs 5 the output will be "hello 5", and ask for the next input,
        an the loop will remain infinite until the input -1 is given, which terminates the loop and the rest of the code will likely continue. */

        /*Q2
        Very similar to the first question except the user is not starting the loop when inputting the integer, the loop starts before the input.In this loop, an integer is also only asked for once.

        Q3
        
        User is prompted to enter an int, when the value is not met, they are asked to input another int, when that int is also not met, it continues the loop, and only the input
        of -1 can terminate the loop.

        Q4

        The loop starts because 14/10 does not leave a remainder of 0. 
        If i % does not equal 0, add +1 to the next variable of i.  This loop continues until i can be divisible with no remainder.
        
        Q5

        The for loop needs brackets instead of a semicolon, so it will not execute.

        Q6

        The for loop needs brackets and 

        Q7

        The for loop needs brackets and "--" does not exist. ++ would be the correct way to incriment.
         */

         


    }
}
