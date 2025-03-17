public class Leet05 {
    public static void main(String[] args) {
        int[] arr = { 12, 234, 1, 2, 1234, 1200 };
        int numb = findNumbers(arr);
        System.out.println(numb);

    }

    public static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }

    public static boolean even(int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10;
        }
        if (count % 2 == 0) {
            return true;
        }
        return false;

    }
}


// to find number of digits in a number:
if(num < 0){
    num = num *-1;
}
if(num =0){
    return 1;
}
return (int)(Math.log(num)) +1 ;
