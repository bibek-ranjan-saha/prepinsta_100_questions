import java.util.Scanner;

public class Main{

    final static String mainMenuText = "\nQ1 : Positive or negative\nQ2 : even or odd\nQ3 : sum of first n natural number\nQ0 : Exit app";
    final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Hii starting Application");
        boolean shouldExit = false;
        do {
            System.out.println(mainMenuText);
            int option = scanner.nextInt();
            switch(option)
            {
                case 1:
                checkPositiveOrNegative();
                break;
                case 2:
                checkEvenOrOdd();
                break;
                case 3:
                getSumOfFirstNNumber();
                break;
                case 0:
                shouldExit = true;
                scanner.close();
                break;
                default:
                System.out.println("Please select an option from 1-100");
                break;
            }
        } while (!shouldExit);
    }

    static void checkPositiveOrNegative()
    {
        System.out.println("Q1. positive or negative ?");
        PositiveOrNegative positiveOrNegative = new PositiveOrNegative();
        System.out.println(">> Enter a number");
        int input = scanner.nextInt();
        String answer = positiveOrNegative.isPositive(input);
        System.out.println(">> Ans : Number is "+answer+"\n\n");
    }

    static void checkEvenOrOdd()
    {
        System.out.println("Q2. even or odd ?");
        EvenOrOdd evenOrOdd = new EvenOrOdd();
        System.out.println(">> Enter a number");
        int input = scanner.nextInt();
        boolean isEven = evenOrOdd.isEven(input);
        System.out.println(">> Ans : Number is "+ (isEven ? "Even" : "Odd")+ "\n\n");
    }

    static void getSumOfFirstNNumber()
    {
        System.out.println("Q3. sum of first n natural number ?");

        System.out.println("select a method \n1: loop\n2: formula n*(n+1)/2\n3: Recursion");
        int option = scanner.nextInt();
        SumOfNNaturalNumber sumOfNNaturalNumber = new SumOfNNaturalNumber();
        System.out.println(">> Enter a number");
        int input = scanner.nextInt();
        int output = 0;
        switch(option)
        {
            case 1:
            output = sumOfNNaturalNumber.usingForLoop(input);
            break;
            case 2: 
            output = sumOfNNaturalNumber.usingFormula(input);
            break;
            case 3:
            output = sumOfNNaturalNumber.usingRecursion(input);
            break;
            default:
            System.out.println("Going with default for loop");
            output = sumOfNNaturalNumber.usingForLoop(input);
            break;
        }
        System.out.println(">> Ans : Sum of first "+input+" natural number is "+ output+"\n\n");
    }
}