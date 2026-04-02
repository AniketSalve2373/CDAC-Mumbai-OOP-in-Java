import java.util.*;

class _7_mobile_recharge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1.199 2.399 3.599");
        int ch = sc.nextInt();

        if (ch == 1)
            System.out.println("28 days plan");
        else if (ch == 2)
            System.out.println("56 days plan");
        else if (ch == 3)
            System.out.println("84 days plan");

    }
}