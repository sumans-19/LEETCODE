package Logical;

import java.util.*;;

public class NthtermofAP {
    public static int nthTermOfAP(int a1, int a2, int n) {
        // using formula to find the
        // Nth term t(n) = a(1) + (n-1)*d
        return (a1 + (n - 1) * (a2 - a1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the a1 number");
        int a1 = sc.nextInt();
        System.out.println("enter the a2 number");

        int a2 = sc.nextInt();
        System.out.println("which number do u want to find");

        int n = sc.nextInt();
        System.out.println(nthTermOfAP(a1, a2, n));
    }
}
