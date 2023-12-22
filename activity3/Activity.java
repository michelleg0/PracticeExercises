package activity3;

public class Activity {
    // NOTE: DO NOT google solutions. Complete each part on your own.

    // This exercise determines if a number is Even or Odd.
    // Run tests in ActivityTest file. All tests should fail.
    // Complete each method below. After completing it, re-run the tests.
    // If everything was solved correctly, the tests should pass.
    public int oddOrEven(int number) {
        // TODO 1 - this should return the word "even" or "odd" based on what the number is.
        number = 5;
        boolean isOddOrEven;


        if (number % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");

        }
        return number;
    }
}
