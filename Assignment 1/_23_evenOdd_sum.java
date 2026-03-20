public class _23_evenOdd_sum {
    public static void main(String[] args) {
        int n = 10;

        int even = 0;
        int odd = 0;
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                even += i;
            } else {
                odd += i;
            }
        }

        System.out.println("sum of even and odd number is : " + even + " and " + odd + " respectily");
    }
}
