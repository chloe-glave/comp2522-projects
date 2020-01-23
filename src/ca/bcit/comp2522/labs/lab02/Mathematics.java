package ca.bcit.comp2522.labs.lab02;

/**
 * Creates a Mathematics object with methods for various mathematical operations.
 *
 * @author Chloe Glave
 * @version 2020
 */
public class Mathematics {
    /**Value of the mathematical constant Pi.*/
    static final double PI = 3.14159;

    /**Ratio of foot to kilometre (1 foot = [this ratio] kilometres).*/
    static final double ONE_FOOT_TO_KILOMETRE_RATIO = 0.0003048;

    /**
     * Calculates the area of a circle given the radius.
     * @param radius the circle's radius.
     * @return the area of the circle.
     */
    public double getCircleArea(double radius) {
        return (Math.pow(radius, 2)) * PI;
    }

    /**
     * Calculates the area of a square given the length of one side.
     * @param sideLength the length of one side of the square.
     * @return the area of the square.
     */
    public double getSquareArea(double sideLength) {
        return Math.pow(sideLength, 2);
    }

    /**
     * Adds two numbers together.
     * @param firstNumber the first number to be added.
     * @param secondNumber the second number to be added.
     * @return the sum of the two numbers.
     */
    public double add(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }

    /**
     * Multiplies two numbers together.
     * @param firstNumber the first number to be multiplied.
     * @param secondNumber the second number to be multiplied.
     * @return the product of the two numbers.
     */
    public double multiply(double firstNumber, double secondNumber) {
        return firstNumber * secondNumber;
    }

    /**
     * Subtracts one number from another.
     * @param minuend the number to be subtracted from.
     * @param subtrahend the number to subtract.
     * @return the difference between the two numbers.
     */
    public double subtract(double minuend, double subtrahend) {
        return minuend - subtrahend;
    }

    /**
     * Divides one number by another.
     *
     * @param dividend the number to divide.
     * @param divisor the amount of groups to divide into.
     * @return the quotient of the two numbers.
     */
    public double divide(double dividend, double divisor) {
        return dividend / divisor;
    }

    public double absoluteValue() {
        return;
    }

    public double getRandomNumberBetweenTenAndTwentyButNotFifteen() {
        return;
    }

    public double convertFeetToKilometres() {
        return;
    }

    public double sumOfInts() {
        return;
    }

    public double isPositive() {
        return;
    }

    public double isEven() {
        return;
    }

    public double sumOfEvens() {
        return;
    }

    public double sumOfProducts() {
        return;
    }

}
