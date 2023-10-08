package DivisionWithoutDivision;

/**
 * Implement division of two positive integers without using the division, multiplication, or modulus operators.
 * Return the quotient as an integer, ignoring the remainder.
 *
 * my notes:
 * what is division?  how many times does n go into m evenly since remainder doesn't matter?
 * can use a while loop to decrememnt from m by n per iteration
 */

public class Division {
    public static int divide(int n, int m){
        int count = 0;
        while(m >= n){
            count++;
            m -= n;
        }
        return count;
    }

    public static void main(String[] args){
        int n = divide(5, 29);
        System.out.println(n);
    }
}
