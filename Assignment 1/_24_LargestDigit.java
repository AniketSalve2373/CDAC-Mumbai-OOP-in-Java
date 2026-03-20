class _24_LargestDigit {
    public static void main(String[] args) {
        int n = 1234;

        int max = 0;

        while (n > 0) {
            int digit = n % 10;
            if (digit > max) {
                max = digit;
                n /= 10;
            }

            System.out.println("Largest digit is : " + max);
        }
    }
}