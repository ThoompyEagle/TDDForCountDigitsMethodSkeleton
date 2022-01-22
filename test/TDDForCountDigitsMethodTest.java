//# BEGIN SKELETON
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * Test cases for countDigits method, of class TDDForCountDigitsMethod.
 *
<!--//# BEGIN TODO Name, student id, and date-->
<p><font color="red"><b>Thomas Willems, 1022753, 22-01-2022</b></font></p>
<!--//# END TODO -->
 */
// -----8<----- cut line -----8<-----
public class TDDForCountDigitsMethodTest {

    /** Subject Under Test.  Only static members are used. */
    private static final TDDForCountDigitsMethod SUT = null;

    /**
     * Invokes countDigits(n, r) and checks result against expectation.
     *
     * @param n  the number whose digits are counted
     * @param r  the radix
     * @param expResult  the expected result
     */
    private void checkCountDigits(long n, long r, int expResult) {
        System.out.println("countDigits(" + n + ", " + r + ")");
        int result = SUT.countDigits(n, r);
        assertEquals("result", expResult, result);
    }

//# BEGIN TODO Test cases
    /**
     * Test of countDigits method, of class TDDForCountDigitsMethod.
     * Boundary case: smallest n in radix 10
     */
    @Test
    public void testCountDigits0() {
        checkCountDigits(0, 10, 1);
    }
    
    /**
     * Test of countDigits method, of class TDDForCountDigitsMethod.
     * Boundary case: largest n with smallest result in radix 10
     */
    @Test
    public void testCountDigits9() {
        checkCountDigits(9L, 10, 1);
    }

    // Test cases, phase 3
    /**
     * Test of countDigits method, of class TDDForCountDigitsMethod.
     * Boundary case: smallest n with result 2 in radix 10
     */
    @Test
    public void testCountDigits10() {
        checkCountDigits(10L, 10, 2);
    }

    // Test cases, phase 4: More systematic approach
    /**
     * Test of countDigits method, of class TDDForCountDigitsMethod.
     * Boundary cases: smallest and largest numbers with small results 
     * in radix 10
     */
    @Test
    public void testCountDigitsSmall() {
        long n = 1L;
        for (int r = 0; r <= 5; ++ r) {
            // n == 10 ^ r
            checkCountDigits(n - 1, 10, Math.max(1, r));
            checkCountDigits(n, 10, r + 1);
            n *= 10;
        }
    }

    // Test cases, phase 5: Largest number
    /**
     * Test of countDigits method, of class TDDForCountDigitsMethod.
     * Boundary case: largest long value tested in radix 10
     * N.B. Overflow causes linear search to loop endlessly.
     */
    @Test(timeout = 1000)
    public void testCountDigitsMaxValue() {
        checkCountDigits(Long.MAX_VALUE, 10, 19);
    }
    
    
    //Test cases phase 6: different radix bases
    /**
     * Test of countDigits method, of class TDDForCountDigitsMethodSkeleton
     * Boundary case: smallest and largest numbers with small results in base 2
     */
    @Test
    public void testCountDigitsBinary() {
        long n = 1L;
        for (int k = 0; k <= 5; k++) {
            // n == 2 ^ k
            checkCountDigits(n - 1, 2, Math.max(1, k));
            checkCountDigits(n, 2, k + 1);
            n *= 2;
        }
    }
    
    /**
     * Test of countDigits method, of class TDDForCountDigitsMethodSkeleton
     * Boundary case: smallest and largest numbers with small results in small 
     * bases
     */
    @Test
    public void testCountDigitsRadix() {
        for (int r = 2; r <= 10; r++) {
            long n = 1L;
            for (int k = 0; k <= 5; k++) {
                // n == r ^ k
                checkCountDigits(n - 1, r, Math.max(1, k));
                checkCountDigits(n, r, k + 1);
                n *= r;
            }
        }
    }
    
    /**
     * Test of countDigits method, of class TDDForCountDigitsMethod.
     * Boundary case: largest long value tested in small radixes
     * N.B. Overflow causes linear search to loop endlessly.
     */
    @Test(timeout = 1000)
    public void testCountDigitsMaxValueDifferentRadix() {
        for (int r = 2; r < 10; r++) {
            int exp = (int) (Math.log(Long.MAX_VALUE)/Math.log(r));
            if (r != 2 && r != 8 ) {
                exp += 1;
            }
            checkCountDigits(Long.MAX_VALUE, r, exp);
        }
    }
    
    /**
     * Test of countDigits method, of class TDDForCountDigitsMethod.
     * Boundary case: largest long value as radix
     */
    @Test(timeout = 1000)
    public void testCountDigitsMaxRadix() {
        checkCountDigits(0, Long.MAX_VALUE, 1);
        checkCountDigits(Long.MAX_VALUE - 1, Long.MAX_VALUE, 1);
        checkCountDigits(Long.MAX_VALUE, Long.MAX_VALUE, 2);
    }
//# END TODO

}
//# END SKELETON
