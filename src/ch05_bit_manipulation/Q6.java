package ch05_bit_manipulation;

public class Q6 {
    public static int switchOddEvenBits(int num) {
        // odd mask is 1010101
        int oddMask = 0xaaaaaaaa;

        // even mask is 0101010
        int evenMask = 0x55555555;

        int odds = (num & oddMask) >> 1;
        String oddString = Integer.toBinaryString(odds);

        int evens = (num & evenMask) << 1;
        String evenString = Integer.toBinaryString(evens);

        // merge the two back together
        return (odds | evens);
    }
}
