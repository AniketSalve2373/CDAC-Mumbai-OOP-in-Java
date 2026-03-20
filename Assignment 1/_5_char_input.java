// 5. Take a character input and print: 
// ○ Next character 
// ○ Previous character

import java.util.Scanner;

public class _5_char_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a character : ");
        char ch = sc.next().charAt(0);
        char next = (char) (ch + 1);
        char prev = (char) (ch - 1);

        System.out.println("next character is : " + next + " and previous character is : " + prev);
        sc.close();
    }
}
