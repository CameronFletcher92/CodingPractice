package ch05_bit_manipulation;

public class Q6 {
    public static int switchOddEvenBits(int num) {
        // odd mask is ...101010
        int oddMask = 0xaaaaaaaa;

        // even mask is ...010101
        int evenMask = 0x55555555;

        int odds = (num & oddMask) >> 1;
        int evens = (num & evenMask) << 1;

        // merge the two back together
        return (odds | evens);
    }
}
