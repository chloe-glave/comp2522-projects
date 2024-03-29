package ca.bcit.comp2522.labs.lab02;

import java.util.Random;

/**
 * Creates a Mathematics object with methods for various mathematical operations.
 *
 * @author Chloe Glave
 * @version 2020
 */
public class Mathematics {
    /**
     * Value of the mathematical constant Pi.
     */
    static final double PI = 3.14159;

    /**
     * Ratio of foot to kilometre (1 foot = [this ratio] kilometres).
     */
    static final double ONE_FOOT_TO_KILOMETRE_RATIO = 0.0003048;

    /**Lower bound for the random number generator.*/
    static final int RANDOM_NUM_LOWER_BOUND = 10;

    /**Upper bound for the random number generator.*/
    static final int RANDOM_NUM_UPPER_BOUND = 21;

    /**Forbidden value for the random number generator.*/
    static final int RANDOM_NUM_FORBIDDEN_VALUE = 15;

    /**
     * Calculates the area of a circle given the radius.
     *
     * @param radius the circle's radius.
     * @return the area of the circle.
     */
    public double getCircleArea(final double radius) {
        return (Math.pow(radius, 2)) * PI;
    }

    /**
     * Calculates the area of a square given the length of one side.
     *
     * @param sideLength the length of one side of the square.
     * @return the area of the square.
     */
    public double getSquareArea(final double sideLength) {
        return Math.pow(sideLength, 2);
    }

    /**
     * Adds two numbers together.
     *
     * @param firstNumber  the first number to be added.
     * @param secondNumber the second number to be added.
     * @return the sum of the two numbers.
     */
    public double add(final double firstNumber, final double secondNumber) {
        return firstNumber + secondNumber;
    }

    /**
     * Multiplies two numbers together.
     *
     * @param firstNumber  the first number to be multiplied.
     * @param secondNumber the second number to be multiplied.
     * @return the product of the two numbers.
     */
    public double multiply(final double firstNumber, final double secondNumber) {
        return firstNumber * secondNumber;
    }

    /**
     * Subtracts one number from another.
     *
     * @param minuend    the number to be subtracted from.
     * @param subtrahend the number to subtract.
     * @return the difference between the two numbers.
     */
    public double subtract(final double minuend, final double subtrahend) {
        return minuend - subtrahend;
    }

    /**
     * Divides one number by another.
     *
     * @param dividend the number to divide.
     * @param divisor  the amount of groups to divide into.
     * @return the quotient of the two numbers.
     */
    public double divide(final double dividend, final double divisor) {
        if (divisor == 0) { /*account for divide-by-zero error*/
            return 0;
        }
        return dividend / divisor;
    }

    /**
     * Calculates the absolute value of a number.
     *
     * @param num the number to get the absolute value of.
     * @return the absolute value of the given num.
     */
    public int absoluteValue(final int num) {
        return (num > 0) ? num : num * -1;
    }

    /**
     * Generates a random integer between 10 and 20, that cannot be 15.
     *
     * @return the generated random number.
     */
    public int getRandomNumberBetweenTenAndTwentyButNotFifteen() {
        int result;
        do {
            Random generator = new Random();
            result = generator.nextInt(RANDOM_NUM_UPPER_BOUND - RANDOM_NUM_LOWER_BOUND)
                    + RANDOM_NUM_LOWER_BOUND; /*generate random num between 0-9*/
        } while (result == RANDOM_NUM_FORBIDDEN_VALUE);
        return result;
    }

    /**
     * Converts a distance in feet to the equivalent distance in kilometres.
     *
     * @param distanceInFeet the initial distance in feet.
     * @return the distance in kilometres.
     */
    public double convertFeetToKilometres(final double distanceInFeet) {
        return distanceInFeet * ONE_FOOT_TO_KILOMETRE_RATIO;
    }

    /**
     * Sums all the positive integers between 0 and the specified value.
     *
     * @param upperBound the point at which to stop adding.
     * @return the sum of all positive ints up to the given upperBound.
     */
    public int sumOfInts(final int upperBound) {
        int sum = 0;
        for (int i = 0; i <= upperBound; i++) {
            sum += i;
        }
        return sum;
    }

    /**
     * Checks whether a given int is positive.
     *
     * @param num the int to check for positivity.
     * @return a boolean that is true if the int is positive, else false.
     */
    public boolean isPositive(final int num) {
        return num > 0;
    }

    /**
     * Checks whether a given int is even.
     *
     * @param num the int to check.
     * @return a boolean that is true if the int is even, else false.
     */
    public boolean isEven(final int num) {
        return (num % 2 == 0);
    }

    /**
     * Sums all the even integers between 0 and the specified value.
     *
     * @param upperBound the point at which to stop adding.
     * @return the sum of all positive even ints up to the given upperBound.
     */
    public int sumOfEvens(final int upperBound) {
        int sum = 0;

        if (isPositive(upperBound)) {
            for (int positiveIterator = 0; positiveIterator <= upperBound; positiveIterator += 2) {
                sum += positiveIterator;
            }
        } else {
            for (int negativeIterator = 0; negativeIterator >= upperBound; negativeIterator -= 2) {
                sum += negativeIterator;
            }
        }
        return sum;
    }

    /**
     * Calculates the sum of the numbers between 0 and the first parameter
     * that are divisible by the second parameter.
     *
     * @param upperBound the point at which to stop adding.
     * @param divisor    the number to divide each int by; checking whether to add it to the sum.
     * @return the sum of the numbers meeting the requirements.
     */
    public int sumOfProducts(final int upperBound, final int divisor) {
        int sum = 0;

        if (isPositive(upperBound)) {
            for (int positiveIterator = 0; positiveIterator <= upperBound; positiveIterator++) {
                if (positiveIterator % divisor == 0) {
                    sum += positiveIterator;
                }
            }
        } else {
            for (int negativeIterator = 0; negativeIterator >= upperBound; negativeIterator--) {
                if (negativeIterator % divisor == 0) {
                    sum += negativeIterator;
                }
            }
        }
        return sum;
    }
}
