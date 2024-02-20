import java.security.spec.ECField;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TryandCatch {

    static Scanner data = new Scanner(System.in);

    public static void main(String[] args) {

//        question1(); // try-catch inside the method
//        question2();  // try-catch inside the method
        //------------
//        System.out.print("Enter the number: ");
//        try{
//            double radius = data.nextDouble();
//            question3(radius);
//        }catch (InputMismatchException e){
//            System.out.println("Please enter number");
//        }
        //-------------

//        try{
//            System.out.println("Enter count: ");
//            int count = data.nextInt();
//            System.out.println("Enter the numbers");
//            int integerNumbers = data.nextInt();
//            question4(count, integerNumbers);
//        }catch (InputMismatchException e){
//            System.out.println("Please enter nubmer.");
//        }
        //------------------------------------
//        question4();// try-catch inside the method
        //------------------------------------
//        try{
//            System.out.print("Enter the first number: ");
//            int firstNum = data.nextInt();
//            System.out.print("Enter the second number: ");
//            int secondNum = data.nextInt();
//            System.out.print("Enter the third number: ");
//            int thirdNum = data.nextInt();
//            question5(firstNum, secondNum, thirdNum);
//        }catch (InputMismatchException e){
//            System.out.println("Please Enter Number");
//        }
        //-------------------------------------
//        try{
//            System.out.print("Input a word: ");
//            String word = data.nextLine();
//            question6(word);
//        }catch (Exception e){
//            System.out.println(e.getMessage());
//        }
        //-------------------------------------
//        try {
//            System.out.println("Enter The Number: ");
//            int number = data.nextInt();
//            question7(number);
//        }catch (InputMismatchException e) {
//            System.out.println("Please Enter Number.");
//        }catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
        //---------------------------------------

//        try {
//            System.out.println("Enter The Temperature in Centigrade: ");
//            double centigrade = data.nextDouble();
//            question8(centigrade);
//        }catch (InputMismatchException e){
//            System.out.println("Please enter number.");
//        }catch (Exception e1){
//            System.out.println(e1.getMessage());
//        }
        //------------------------------------
//        String input;
//        int indexNumber;
//        try{
//            System.out.print("Input a string: ");
//            input = data.nextLine();
//            System.out.print("Input a number: ");
//            indexNumber = data.nextInt();
//            question9(input, indexNumber);
//        }catch (InputMismatchException e){
//            System.out.println(e.getMessage());
//        }catch (Exception e1){
//            System.out.println(e1.getMessage());
//        }
        //----------------------------------------
//        try{
//            double width;
//            double height;
//            System.out.print("Enter the width: ");
//            width = data.nextDouble();
//            System.out.print("Enter the height: ");
//            height = data.nextDouble();
//            question10(width, height);
//        }catch (InputMismatchException e){
//            System.out.println(e.getMessage());
//        }
        //---------------------------------------
//        try {
//            System.out.print("Input first integer: ");
//            int firstNum = data.nextInt();
//            System.out.print("Input second integer: ");
//            int secondNum = data.nextInt();
//            question11(firstNum, secondNum);
//        } catch (InputMismatchException e) {
//            System.out.println("Please enter number.");
//        } catch (Exception e1) {
//            System.out.println(e1.getMessage());
//        }
        //---------------------------------------
//        int seconds;
//        try{
//            System.out.println("Input seconds: ");
//            seconds = data.nextInt();
//            question12(seconds);
//        }catch (InputMismatchException e){
//            System.out.println("Please enter numbers.");
//        }catch (Exception e1){
//            System.out.println(e1.getMessage());
//        }finally {
//            System.out.println("this question 12");
//        }
        //---------------------------------------
//        int firstNum, secondNum, thirdNum, fourthNum;
//        try{
//            System.out.print("Input first number: ");
//            firstNum = data.nextInt();
//            System.out.print("Input second number: ");
//            secondNum = data.nextInt();
//            System.out.print("Input third number: ");
//            thirdNum = data.nextInt();
//            System.out.print("Input fourth number: ");
//            fourthNum = data.nextInt();
//            question13(firstNum, secondNum, thirdNum,fourthNum);
//        }catch (InputMismatchException e){
//            System.out.println("Please Enter number.");
//        }catch (Exception e1){
//            System.out.println(e1.getMessage());
//        }finally {
//            System.out.println("This question 13");
//        }
        //----------------------------------------------
//        try {
//            System.out.print("Enter The Number: ");
//            int number = data.nextInt();
//            question14(number);
//        }catch (InputMismatchException e){
//            System.out.println("Please enter number.");
//        }catch (Exception e1){
//            System.out.println(e1.getMessage());
//        }finally {
//            System.out.println("This is question 14");
//        }
        //---------------------------------------------
//        question15();//try-catch inside method.
        //------------------------------------------
//        try {
//            System.out.print("Enter the number: ");
//            int number = data.nextInt();
//            question16(number);
//        } catch (InputMismatchException e) {
//            System.out.println("Please Enter Number.");
//        } catch (Exception e1) {
//            System.out.println(e1.getMessage());
//        } finally {
//            System.out.println("This is question 16");
//        }
        //---------------------------------------------
//        question17();//Try-Catch inside the method
        //---------------------------------------------
//        try {
//            System.out.println("Enter the word: ");
//            String word = data.nextLine();
//            question18(word);
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        } finally {
//            System.out.println("This is question 17");
//        }
    }


    public static void question1() {
        try {
            int firstNumber;
            int secondNumber;
            System.out.print("Please Enter First Number: ");
            firstNumber = data.nextInt();
            System.out.print("Please Enter Second Number: ");
            secondNumber = data.nextInt();

            System.out.println(firstNumber + " + " + secondNumber + " = " + (firstNumber + secondNumber));
            System.out.println(firstNumber + " - " + secondNumber + " = " + (firstNumber - secondNumber));
            System.out.println(firstNumber + " x " + secondNumber + " = " + (firstNumber * secondNumber));
            System.out.println(firstNumber + " / " + secondNumber + " = " + (firstNumber / secondNumber));
            System.out.println(firstNumber + " mod " + secondNumber + " = " + (firstNumber % secondNumber));

        } catch (InputMismatchException e) {
            System.out.println("Please Enter number");
        } catch (Exception e1) {
            System.out.println(e1.getMessage());
        } finally {
            System.out.println("Work.");
        }

    }

    public static void question2() {
        try {
            int number;
            int mult;
            System.out.print("Enter The Number: ");
            number = data.nextInt();
            for (int i = 1; i <= 10; i++) {
                mult = i * number;
                System.out.println(number + " x " + i + " = " + (mult));
            }
        } catch (InputMismatchException e) {
            System.out.println("Pleae Enter Number");
        } catch (Exception e1) {
            System.out.println(e1.getMessage());
        }

    }

    public static void question3(double radius) {
        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;
        System.out.println("Perimeter is = " + perimeter);
        System.out.println("Area is = " + area);
    }

    public static void question4() {
        int count;
        int integerNumbers;
        int sum = 0;
        try {
            System.out.print("Enter The count of numbers: ");
            count = data.nextInt();
            for (int i = 0; i < count; i++) {
                System.out.print("Enter an integer: ");
                integerNumbers = data.nextInt();
                sum = sum + integerNumbers;
            }
            System.out.println("The Average is: " + sum / count);
        } catch (InputMismatchException e) {
            System.out.println("Please enter nubmer.");
        }
    }

    public static void question5(int firstNum, int secondNum, int thirdNum) throws Exception {
        if (firstNum + secondNum == thirdNum) {
            throw new Exception("The result is: True");
        } else {
            System.out.println("The result is: false");
        }
    }

    public static void question6(String word) {
        for (int i = word.length(); i > 0; i--) {
            System.out.print(word.charAt(i - 1));
        }
    }

    public static void question7(int number) throws Exception {
        if (number % 2 != 0) {
            throw new Exception("The number is odd");
        } else {
            System.out.println("The Number is Even");
        }
    }

    public static void question8(double centigrade) {
        double formula = 1.8;
        double fahrenheit = centigrade * formula + 32;
        System.out.println(fahrenheit);
    }

    public static void question9(String input, int indexNumber) {
        char charachter = input.charAt(indexNumber);
        System.out.println(charachter);
    }

    public static void question10(double width, double height) {
        double perimeter = 2 * (height + width);
        double area = width * height;
        System.out.println("Perimeter is: " + perimeter);
        System.out.println("Area is: " + area);
    }

    public static void question11(int firstNum, int secondNum) {
        if (firstNum != secondNum) {
            System.out.println(firstNum + " != " + secondNum);
        }

        if (firstNum < secondNum) {
            System.out.println(firstNum + " < " + secondNum);
        }

        if (firstNum <= secondNum) {
            System.out.println(firstNum + " <= " + secondNum);
        }

        if (firstNum == secondNum) {
            System.out.println(firstNum + " == " + secondNum);
        }

        if (firstNum > secondNum) {
            System.out.println(firstNum + " > " + secondNum);
        }

        if (firstNum >= secondNum) {
            System.out.println(firstNum + " >= " + secondNum);
        }

    }

    public static void question12(int seconds) {

        int hours, minutes;
        hours = seconds / 3600;
        minutes = (seconds % 3600) / 60;
        seconds = seconds % 60;

        System.out.println(hours + ":" + minutes + ":" + seconds);
    }

    public static void question13(int firstNum, int secondNum, int thirdNum, int fourthNum) throws Exception {

        if (firstNum == secondNum ||
                firstNum == thirdNum ||
                firstNum == fourthNum ||
                secondNum == thirdNum ||
                secondNum == fourthNum ||
                thirdNum == fourthNum
        ) {
            throw new Exception("Numbers are equal");
        } else {
            System.out.println("Numbers are not equal!");
        }
    }

    public static void question14(int number) throws Exception {

        if (number < 0) {
            throw new Exception("Number is Negative: ");
        } else if (number == 0) {
            System.out.println("Number is Zero");
        } else {
            System.out.println("Number is Positive");
        }
    }

    public static void question15(){
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;
        try {
            System.out.println("Enter numbers (enter -1 to stop): ");
            int number;
            do {
                number = data.nextInt();
                if (number != -1) {
                    if (number > 0) {
                        positiveCount++;
                    } else if (number < 0) {
                        negativeCount++;
                    } else {
                        zeroCount++;
                    }
                }
            } while (number != -1);
            System.out.println(positiveCount + " positives");
            System.out.println(zeroCount + " zeros");
            System.out.println(negativeCount + " negatives");
        } catch (InputMismatchException e) {
            System.out.println("Please enter number");
//            throw new Exception("Please enter a valid number");
        } catch (Exception e1) {
            System.out.println(e1.getMessage());
//            throw new Exception(e1.getMessage());
        } finally {
            System.out.println("This is question 15");
        }
    }

    public static void question16(int number) {
        int revers = 0;
        while (number != 0) {
            int digit = number % 10;
            revers = revers * 10 + digit;
            number /= 10;
            if (number == 0) {
                System.out.println(revers);
            }
        }
    }

    public static void question17() {
        int numbers;
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        try {
            while (true) {
                System.out.print("Enter a number (-1 to stop): ");
                numbers = data.nextInt();
                if (numbers == -1) {
                    break;
                }
                if (numbers > largest) {
                    largest = numbers;
                }

                if (numbers < smallest) {
                    smallest = numbers;
                }
            }
            System.out.println("The largest number: " + largest);
            System.out.println("The smallest number: " + smallest);
        } catch (InputMismatchException e) {
            System.out.println("Please enter number.");
        } catch (Exception e1) {
            System.out.println(e1.getMessage());
        } finally {
            System.out.println("This is question 17");
        }

    }

    public static void question18(String word) {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'a' || word.charAt(i) == 'A') {
                count++;
            }
        }
        System.out.println("Number of 'a's: " + count);
    }


}