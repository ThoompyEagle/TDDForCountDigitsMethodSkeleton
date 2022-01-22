//# BEGIN SKELETON
/**
 * Illustrates Test-Driven Development of a single method.
 *
<!--//# BEGIN TODO Name, student id, and date-->
<p><font color="red"><b>Thomas Willems, 1022753, 22-01-2022</b></font></p>
<!--//# END TODO -->
*/
// -----8<----- cut line -----8<-----
public class TDDForCountDigitsMethod {

    /**
     * Counts the digits of a number.
     * This concerns a non-negative integer, assumed to be
     * written in positional notation without leading zeroes.
     * Robust version.
     *
    <!--//# BEGIN TODO Contract-->
    <p><font color="red"><b>
    * @param n  the number whose digits are counted
    * @return  the number of decimal digits in {@code n}
    * @pre {@code 0 <= n}
    * @post {@code \result = (\min int k; 1 <= k; n < 10 ^ k)}
    </b></font></p>
<!--//# END TODO-->
     */
    public static int countDigits(long n, long r)
            throws IllegalArgumentException {
//# BEGIN TODO Implementation
        int result = 1;
        while (10 <= n) {
            n /= 10;
            ++ result;
        }
        return result;
//# END TODO
    }

}
//# END SKELETON
