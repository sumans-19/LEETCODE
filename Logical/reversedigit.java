package Logical;

public class reversedigit {
    public static void main(String[] args) {
        System.out.println(reverse(-1234));
    }
    public static int reverse(int x) {
        boolean isNegative = (x < 0); 
        x = Math.abs(x);              
        int revnum = 0;
        while (x != 0) {
            int digit = x % 10;
            // Check for overflow
            if (revnum > (Integer.MAX_VALUE - digit) / 10) {
                return 0;
            }
            revnum = revnum * 10 + digit;
            x = x / 10;
        }

        return isNegative ? -revnum : revnum;
    }
    
}

