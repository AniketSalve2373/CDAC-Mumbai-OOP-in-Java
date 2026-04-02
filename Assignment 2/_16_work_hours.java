class _16_work_hours {
    public static void main(String[] args) {
        int hours[][] = { { 8, 8, 8 }, { 7, 8, 6 } };

        for (int i = 0; i < hours.length; i++) {
            int total = 0;
            for (int j = 0; j < hours[i].length; j++)
                total += hours[i][j];

            System.out.println("Employee " + i + ": " + total);
        }
    }
}