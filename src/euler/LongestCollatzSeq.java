package euler;

/**
 *

 The following iterative sequence is defined for the set of positive integers:

 n → n/2 (n is even)
 n → 3n + 1 (n is odd)

 Using the rule above and starting with 13, we generate the following sequence:
 13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1

 It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.

 Which starting number, under one million, produces the longest chain?

 NOTE: Once the chain starts the terms are allowed to go above one million.

 * Created by Damyan Damyanov <damyan.damyanov@scalefocus.com> on 11/19/15.
 */
public class LongestCollatzSeq {

    public static Double collatz(Double n) {
        if (n % 2 == 0) {
            return n / 2;
        } else {
            return n * 3 + 1;
        }
    }

    public static void main(String[] args) {

        Double count = 0.0;
        Double number = 0.0;
        for (Double i = 1.0; i <= 1000000.0; i++) {
            Double temp = i;
            Double tempCount = 0.0;
            while (true) {
                temp = collatz(temp);
                tempCount++;
                if (temp == 1) {
                    tempCount++;
                    break;
                }
            }
            if (tempCount > count) {
                count = tempCount;
                number = i;
            }
        }
        System.out.println(number.intValue());
    }
}
