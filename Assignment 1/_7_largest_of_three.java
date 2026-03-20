public class _7_largest_of_three {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;

        if (a > b && a > c) {
            System.out.println(a + " : a is largest");
        } else if (b > a && b > c) {
            System.out.println(b + " : b is largest");
        } else {
            System.out.println(c + " : c is largest");
        }
    }
}
