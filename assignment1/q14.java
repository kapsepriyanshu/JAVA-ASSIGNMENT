class MultiplesOfTen {
    public static void main(String[] args) {
        int start = 10, end = 50;
        for (int i = start; i <= end; i++) {
            if (i % 10 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
