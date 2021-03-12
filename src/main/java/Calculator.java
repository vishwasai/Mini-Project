import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.lang.*;

public class Calculator {
    private static final Logger logger = LogManager.getLogger(Calculator.class);

    public Calculator() {
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        double number1, number2;
        do {
            System.out.println("Calculator-DevOps, Choose to perform operation");
            System.out.print("Press 1 to Square root\nPress 2 to Factorial\nPress 3 to Logarithm\nPress 4 to Power\n" +
                    "Press any other key to exit\nEnter your choice: ");
            int choice;
            try {
                choice = scanner.nextInt();
            } catch (InputMismatchException error) {
                return;
            }

            switch (choice) {
                case 1:
                    System.out.println("Enter the number :");
                    number1 = scanner.nextInt();
                    System.out.println("Result : " + calculator.squareroot(number1));
                    break;
                case 2:
                    System.out.println("Enter the number :");
                    number2 = scanner.nextInt();
                    System.out.println("Result : " + calculator.factorial(number2));
                    break;
                case 3:
                    System.out.println("Enter the number :");
                    number1 = scanner.nextInt();
                    System.out.println("Result : " + calculator.logarithm(number1));
                    break;
                case 4:
                    System.out.println("Enter the number1 :");
                    number1 = scanner.nextInt();
                    System.out.println("Enter the number2 :");
                    number2 = scanner.nextInt();
                    System.out.println("Result : " + calculator.power(number1,number2));
                    break;
                default:
                    System.out.println("Exiting....");
                    return;
            }
        } while (true);
    }
    private double squareroot(double number1) {
        logger.info("[Square Root] - " + number1);
        double result = Math.sqrt(number1) ;
        logger.info("[RESULT - Square Root] - " + result);
        return result;
    }

    private double factorial(double number2) {
        logger.info("[Factorial] - " + number2);
        double result=1;
        if(number2==0){
            return result;
        }
        else
        for(double i=number2;i>0;i--){
            result*=i;
        }
        logger.info("[RESULT - Factorial] - " + result);
        return result;
    }
    private double logarithm(double number1) {
        logger.info("[Square Root] - " + number1);
        double result = Math.log(number1) ;
        logger.info("[RESULT - Square Root] - " + result);
        return result;
    }
    private double power(double number1,double number2) {
        logger.info("[Square Root] - " + number1);
        double result = Math.pow(number1,number2) ;
        logger.info("[RESULT - Square Root] - " + result);
        return result;
    }


//    public double divide(double number1, double number2) {
//        double result = 0;
//        try {
//            logger.info("[DIVISION] - " + number1 + ", " + number2);
//            if (number1 == 0 && number2 == 0) {
//                result = Double.NaN;
//                throw new ArithmeticException("Case of NaN 0.0/0.0");
//            } else if (number1 > 0 && number2 == 0) {
//                result = Double.POSITIVE_INFINITY;
//                throw new ArithmeticException("Case of Positive Infinity 1.0/0.0");
//            } else if (number1 <= -1 && number2 == 0) {
//                result = Double.NEGATIVE_INFINITY;
//                throw new ArithmeticException("Case of Negative Infinity -1.0/0.0");
//            } else {
//                result = number1 / number2;
//            }
//        } catch (ArithmeticException error) {
//            logger.error("[EXCEPTION - DIVISION] - Cannot be divided by ZERO " + error.getLocalizedMessage());
//        } finally {
//            logger.info("[RESULT - DIVISION] - " + result);
//        }
//        return result;
//    }
}
