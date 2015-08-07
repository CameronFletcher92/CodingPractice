package ch05_bit_manipulation;

public class Q7 {
    public static int findMissingNumber(int[] nums) {
        // 0 case
        if (nums[0] != 0) {
            return 0;
        }

        // every other case, last digit should alternate
        boolean lastBit = false;
        for (int num : nums) {
            // if the last bit should be a 1 and its not (or visa versa) we skipped a number
            if ((lastBit && !getLastBit(num)) || !lastBit && getLastBit(num)) {
                return (num - 1);
            }

            lastBit = !lastBit;
        }

        return -1;
    }

    private static boolean getLastBit(int num) {
        return (num & 1) > 0;
    }
}
