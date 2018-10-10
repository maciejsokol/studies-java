import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.out;

public class Main {

    public static void main(String[] args) {
        Task_1();
        Task_2();
        Task_3();
    }

    private static void Task_1() {
        out.println("**************");
        out.println("* Exercise 1 *");
        out.println("**************");

        out.println("Please enter two numbers");

        int firstNumber = ReadValueInt();
        int secondNumber = ReadValueInt();

        boolean isFirstNumberTeen = (firstNumber >= 13) && (firstNumber <= 19);
        boolean isSecondNumberTeen = (secondNumber >= 13) && (secondNumber <= 19);

        if ((isFirstNumberTeen && !isSecondNumberTeen) || (!isFirstNumberTeen && isSecondNumberTeen)) {
            out.println("teen");
        }
    }

    private static void Task_2() {
        out.println("**************");
        out.println("* Exercise 2 *");
        out.println("**************");

        out.println("Enter first number");
        int firstNumber = ReadValueInt();

        out.println("Enter second number");
        int secondNumber = ReadValueInt();

        out.println("Enter third number");
        int thirdNumber = ReadValueInt();

        int sum = 0;

        if(firstNumber != 13) sum += firstNumber;
        if((firstNumber != 13) && (secondNumber != 13)) sum += secondNumber;
        if((firstNumber != 13) && (secondNumber != 13) && (thirdNumber != 13)) sum += thirdNumber;

        out.println(sum);
    }

    private static void Task_3() {
        out.println("**************");
        out.println("* Exercise 3 *");
        out.println("**************");

        out.println("Enter numbers and confirm them with an Enter. To finish, press anything other than number and also confirm by Enter.");

        ArrayList<Integer> arrayofInts = new ArrayList<Integer>();

        while (true) {
            try {
                arrayofInts.add(ReadValueInt());
            }
            catch (Exception ex) {
                break;
            }
        }

        int arrayLen =  arrayofInts.size();

        if(arrayLen > 2) {
            boolean foundNoOne = false;
            boolean foundNoTwo = false;
            boolean foundNoThree = false;

            int i = 0;
            for (; i < arrayLen; i++) {
                if(arrayofInts.get(i) == 1) {
                    foundNoOne = true;
                }
                if(arrayofInts.get(i) == 2) {
                    foundNoTwo = true;
                }
                if(arrayofInts.get(i) == 3) {
                    foundNoThree = true;
                }
            }

            if(foundNoOne && foundNoTwo && foundNoThree) {
                out.println("true");
            }
        }

        out.println(arrayofInts);
    }

    private static int ReadValueInt() {
        Scanner enteredNumber = new Scanner(System.in);
        return enteredNumber.nextInt();
    }
}
