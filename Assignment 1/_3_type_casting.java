public class _3_type_casting {
    public static void main(String[] args) {
        int i = 1;
        double d = 11.11;

        System.out.println("int i : " + i + " double d : " + d);

        System.out.println("type casting : ");
        double ichange;
        ichange = i;
        System.out.println("type casting int to double : " + ichange);
        int dchange;
        dchange = (int) d;
        System.out.println("type casting double to int : " + dchange);

    }
}
