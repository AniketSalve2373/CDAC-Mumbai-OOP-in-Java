public class _25_swapNumber {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        System.out.println("before swap a and b is resp. " + a + " " + b);

        // using 3rd variable
        // int temp = a;
        // a = b;
        // b = temp;

        // without using 3rd variable
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("after swap a and b is resp. " + a + " " + b);
    }
}
