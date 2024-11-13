import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //collecting input from users
        System.out.print("what is your first number ");
        Scanner scanner = new Scanner(System.in);

        //Changing input from string to Integer for calculation
        int firstInput = Integer.parseInt(scanner.next());

        //collecting input from users
        System.out.print("what is your second number ");
        Scanner secondscanner = new Scanner(System.in);

        //Changing input from string to Integer for calculation
        int secondInput = Integer.parseInt(secondscanner.next());

        //summing the two numbers
        int sum=firstInput+secondInput;
        System.out.println("Your sum is " + sum);

        // putting inputs from user into an array
        int[] findAverage  = new int[2];
        findAverage[0]= firstInput;
        findAverage[1]=secondInput;

        int average=(firstInput + secondInput)/findAverage.length;
        System.out.println("The average of the two number " + average);


    }
}