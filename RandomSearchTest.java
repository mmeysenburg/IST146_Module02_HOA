import java.util.*;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test class for RandomSearch.
 */
public class RandomSearchTest {
  @Before
  public void setUp() throws Exception {

  }

  @After
  public void tearDown() throws Exception {

  }

  @Test
  public void testRandomSearch() {
    // create an array with known contents for testing
    int[] arr = new int[100];
    for(int i = 0; i < 100; i++) {
      arr[i] = i;
    }

    // RandomSearch object for testing
    RandomSearch rs = new RandomSearch();

    // test edge cases: first and last elements in arr
    assertEquals(0, rs.randomSearch(arr, 0));
    assertEquals(99, rs.randomSearch(arr, 99));

    // not found case
    assertEquals(-1, rs.randomSearch(arr, 100));

  }

  /**
   * Test launcher.
   *
   * @param args Command-line arguments; ignored by 
   * this application
   */
  public static void main(String[] args) {
    org.junit.runner.JUnitCore.main("RandomSearchTest");
  }
}