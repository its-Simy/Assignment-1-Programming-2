//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {




        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        //part 1
        //Variables store data and have a specific data type.
        int age = 25;
        double salary = 50000.0;
        String name = "John";

        //part 2
        //A for loop repeats a block of code a specified number of times.
        for (int i = 0; i < 5; i++) {
            System.out.println("Iteration: " + i);
        }

        //part3
        //A while loop continues executing a block of code as long as a condition is true.
        int count = 0;
        while (count < 3) {
            System.out.println("Count: " + count);
            count++;
        }


        //part 4
        //A do-while loop executes the code block at least once before checking the condition.
        int num = 1;
        do {
            System.out.println("Number: " + num);
            num++;
        } while (num <= 3);


        //part 5
        //Conditional execution using the if statement.
        int x = 10;
        if (x > 5) {
            System.out.println("x is greater than 5");
        }

        //part 6
        //Conditional branching using if-else.
        int num3 = 7;
        if (num3 % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

        //part 7
        //Multiple levels of conditional statements.
        int age2 = 18;
        if (age2 >= 18) {
            if (age2 < 21) {
                System.out.println("You're eligible but not for alcohol");
            } else {
                System.out.println("You're eligible for everything");
            }
        } else {
            System.out.println("You're not eligible");
        }

        //part 8
        //Multi-choice decision using switch-case.
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            default:
                System.out.println("Invalid day");
        }