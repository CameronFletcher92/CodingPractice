package ch05_bit_manipulation;

public class Q2 {
    public static String printBinary(double num) {
        StringBuilder s = new StringBuilder();
        s.append("0.");

        while (num > 0) {
            double r = num * 2;
            if (r >= 1) {
                s.append("1");
                num = r - 1;
            } else {
                s.append("0");
                num = r;
            }
        }

        return s.toString();
    }

}
