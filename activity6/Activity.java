package activity6;

public class Activity {
//    NOTE: DO NOT google solutions. Complete each part on your own.
//    In this activiry you will return the word Fizz, Buzz of FizzBuzz based on these rules:
//    If the number is divisible by 3, return Fizz.
//    If the number is divisible by 5, return Buzz.
//    If the number is divisible by BOTH 3 and 5, then return FizzBuzz.

//    Run tests in ActivityTest file. All tests should fail.
//    Complete each method below. After completing it, re-run the tests.
//    If everything was solved correctly, the tests should pass.


    public String fizzbuzz(int number) {
        String[] fizzbuzz = new String[]{"1","2", "3","4","5","6","7", "8","9","10","15"};


        if (number % 3 == 0 && number % 5 == 0)  {
            return "FizzBuzz";
        } else if (number % 5 == 0) {
            return "Buzz";
        } else if (number % 3 == 0 ) {
            return "Fizz";
        } else {
            return null;
        }

        }
    }
