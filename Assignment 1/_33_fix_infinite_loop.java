public class _33_fix_infinite_loop {
    public static void main(String[] args) {

        int i = 1;

        while (i <= 10) {
            System.out.println(i);
            i++; // FIX: increment added
        }
    }
}