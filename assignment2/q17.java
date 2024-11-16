class ConsecutiveSum {
    public static void main(String[] args) {
        int number = 2415;
        int sum = 0;
        String numStr = Integer.toString(number);

        for (int i = 0; i < numStr.length() - 1; i++) {
            int consecutive = Integer.parseInt(numStr.substring(i, i + 2));
            sum += consecutive;
        }

        System.out.println("Sum: " + sum);
    }
}
