package Logical;

public class Powerofanumber {
    public static boolean isPower(int x, long y) {
        // The only power of 1 is 1 itself
        if (x == 1)
            return (y == 1);

        // Repeatedly compute power of x
        long pow = 1;
        while (pow < y)
            pow *= x;

        // Check if power of x becomes y
        return (pow == y);
    }

    public static void main(String[] args) {
        System.out.println(isPower(10, 1));
        System.out.println(isPower(1, 20));
        System.out.println(isPower(2, 128));
        System.out.println(isPower(2, 30));
         System.out.println(isPower2(2, 128));
    }
     public static boolean isPower2(int x, int y) {
        double res1 = Math.log(y) / Math.log(x);
        return res1 == Math.floor(res1);
    }
}
