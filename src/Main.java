import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // task 1
        int length ;
        int width ;
        length = 3;
        width = 5;
        int sqrt ;
        sqrt = length * width;

        System.out.println("Square root is: " + sqrt);

        // task 2
        double weight = 64.2;
        double height = 1.67;
        double BMI = weight / (height * height);

        System.out.printf("BMI = " + weight);
        System.out.printf(" kg / (" + height);
        System.out.printf(" m * " + height);
        System.out.printf(" m) = " + BMI);
        System.out.println(" kg/m2");


        // task 3
        double tempC = 36.6;
        double tempF = ((double) 9 / 5) * tempC + 32;

        // task 4
        short maxShort = 32767;

        maxShort++;

        System.out.println("Increased maxShort: " + maxShort);

        // task 5
        double valueD = 23.23;
        int valueI = (int) valueD;

        System.out.println("Floating value: " + valueD);
        System.out.println("Integer value: " + valueI);

        // task 6
        int age = 50;
        boolean isAgeCorrect = age >= 18;

        System.out.println("Is Age bigger or equal 18?: " + isAgeCorrect);

        // task 7
        char symbolS = 's';
        char symbolShift = (char) (symbolS + 4);

        System.out.println("Original symbol: "+ symbolS);
        System.out.println("Shifted symbol: "+ symbolShift);

        // task 8
        Scanner in = new Scanner(System.in);

        System.out.printf("Enter first integer: ");
        int int1 = in.nextInt();

        System.out.printf("Enter second integer: ");
        int int2 = in.nextInt();

        int multInt =int1 * int2;
        System.out.printf("Mult = " + multInt);

    }
}