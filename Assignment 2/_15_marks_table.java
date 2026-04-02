class _15_marks_table {
    public static void main(String[] args) {
        int m[][] = { { 70, 80, 90 }, { 60, 50, 40 }, { 90, 85, 88 } };

        for (int i = 0; i < 3; i++) {
            int total = 0;
            for (int j = 0; j < 3; j++)
                total += m[i][j];

            System.out.println("Avg: " + total / 3.0);
        }
    }
}