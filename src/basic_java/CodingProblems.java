package basic_java;

public class CodingProblems {
    /**
     * TODO: This problem was asked by Glassdoor.
     * 
     * An imminent hurricane threatens the coastal town of Codeville. If at most two
     * people can fit in a rescue boat, and the maximum weight limit for a given
     * boat is k, determine how many boats will be needed to save everyone.
     * 
     * For example, given a population with weights [100, 200, 150, 80] and a boat
     * limit of 200, the smallest number of boats required will be three.
     * 
     * @param arr   - array of weights of peoples
     * @param limit -limit of weight per boat
     */
    public static int problem291(int[] arr, int limit) {
        return -1;
    }

    /**
     * TODO: This problem was asked by Salesforce.
     * 
     * The number 6174 is known as Kaprekar's contant, after the mathematician who
     * discovered an associated property: for all four-digit numbers with at least
     * two distinct digits, repeatedly applying a simple procedure eventually
     * results in this value. The procedure is as follows:
     * 
     * For a given input x, create two new numbers that consist of the digits in x
     * in ascending and descending order. Subtract the smaller number from the
     * larger number. For example, this algorithm terminates in three steps when
     * starting from 1234:
     * 
     * 4321 - 1234 = 3087 8730 - 0378 = 8352 8532 - 2358 = 6174 Write a function
     * that returns how many steps this will take for a given input N.
     */
    public static int problem288(int x) {
        return -1;
    }

    public static void main(String[] args) {
        assert (problem288(1234) == 3);
    }

}
