/*
 * 412. Fizz Buzz
 * Given an integer n, return a string array answer (1-indexed) where:

 * answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
 * answer[i] == "Fizz" if i is divisible by 3.
 * answer[i] == "Buzz" if i is divisible by 5.
 * answer[i] == i (as a string) if none of the above conditions are true.
 */

class Solution {
    public List<String> fizzBuzz(int n) {
        // Initializes ArrayList        
        List<String> output = new ArrayList<>();

        for (int i = 1; i<= n; i++) {
            // Creates a temperary number to hold Fizz Buzz
            String num = "";
            
            // Checks if number is dividible by 3
            if (i % 3 == 0) {
                num += "Fizz";
            }

            // Checks if number is divisible by 5
            if (i % 5 == 0) {
                num += "Buzz";
            }

            // Returns the number if not divsible by 3 and/or 5
            if (num.isEmpty()) {
                num += Integer.toString(i);
            }

            // Replaces integer with Fizz Buzz
            output.add(num);
        }

        // Returns output
        return output;
    }
}