import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PrimeCheckTest {
  // --------------------------------------------------------------- //
  @Test
  public void TestNegativeNumbers() {
    for (int i = -10; i < 0; ++i) {
      assertEquals("Test negative number " + i, false, PrimeCheck.isPrime(i));
    }
  }

  // --------------------------------------------------------------- //
  @Test
  public void TestEdgeCases() {
    assertEquals("Test 0", false, PrimeCheck.isPrime(0));
    assertEquals("Test 1", false, PrimeCheck.isPrime(1));
    assertEquals("Test 2", true, PrimeCheck.isPrime(2));
  }

  // --------------------------------------------------------------- //
  @Test
  public void testPrimes() {
    /* ToDo: insert a test here */
    assertEquals("7 is a prime", true, PrimeCheck.isPrime(7));
    assertEquals("13 is a prime", true, PrimeCheck.isPrime(13));
    assertEquals("17 is a prime", true, PrimeCheck.isPrime(17));
  }

  // --------------------------------------------------------------- //
  @Test
  public void testNonPrimes() {
    assertEquals("6 is not a prime", false, PrimeCheck.isPrime(6));
    assertEquals("12 is not a prime", false, PrimeCheck.isPrime(12));
    assertEquals("21 is not a prime", true, PrimeCheck.isPrime(21));
  }
}
