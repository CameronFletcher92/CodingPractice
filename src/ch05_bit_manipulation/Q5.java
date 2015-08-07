package ch05_bit_manipulation;

public class Q5 {
    public static int getFlipCount3(int a, int b) {
        // XOR will give us ones where a flip is required
        int xor = a ^ b;

        String binary = Integer.toBinaryString(xor);
        int count = 0;

        for (char c : binary.toCharArray()) {
            if (c == '1') {
                count++;
            }
        }

        return count;
    }

    public static int getFlipCount2(int a, int b) {
        int count = 0;

        for (int xor = a ^ b; xor > 0; xor >>= 1) {
            if (xor % 2 == 1) {
                count++;
            }
        }

        return count;
    }

    public static int getFlipCount(int a, int b) {
        int count = 0;
        for (int xor = a ^ b; xor > 0; xor >>= 1) {
            count += xor & 1;
        }
        return count;
    }

}
