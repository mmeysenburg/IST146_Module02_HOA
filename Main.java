import java.util.*;

/**
 * Main class for IST 146 HOA 2: Randomized search.
 */
class Main {
  /**
   * Application entry point.
   *
   * @param args Command-line arguments; ignored by this app. 
   */
  public static void main(String[] args) {
    // build a target array and fill with random data
    int[] arr = new int[20];
    Random prng = new Random();
    for(int i = 0; i < arr.length; i++) {
      arr[i] = prng.nextInt(1000);
    }

    // display array contents
    System.out.println("Array:");
    System.out.println(Arrays.toString(arr));

    // prompt user for first key value
    Scanner stdin = new Scanner(System.in);
    System.out.print("Enter key to search for (neg. to exit): ");
    int key = stdin.nextInt();

    RandomSearch rs = new RandomSearch();

    // keep going until user wants to quit
    while(key >= 0) {
      // perform the search
      int idx = rs.randomSearch(arr, key);

      // print appropriate response
      if(idx == -1) {
        System.out.printf("%d not found.\n", key);
      } else {
        System.out.printf("%d found at index %d.\n", key, idx);
      }

      // get next key or sentinel from user 
      System.out.print("Enter key to search for (neg. to exit): ");
      key = stdin.nextInt();
    } // while
  } // main method
} // Main class