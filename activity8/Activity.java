package activity8;

import java.io.OptionalDataException;

public class Activity {
//    NOTE: DO NOT google solutions. Complete each part on your own.
//
//    In this activity you will add all the numbers in the array and return its sum.
//
//    HINT:
//    Use a for loop to loop through the array and then add each item in the array.
//
//    Run tests in ActivityTest file. All tests should fail.
//    Complete each method below. After completing it, re-run the tests.
//    If everything was solved correctly, the tests should pass.

    public int sumArray(int[] numbers) {
        int sum = 0;

//check for the last variable in the array. The index starts from 0 + onwards
        for (int i = 0; i < numbers.length ; i++) {

            //size of the array remains the same

              sum = numbers[i] + sum;

        }
        return sum;
    }
}