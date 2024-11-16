class MaxOfThree {
    public static void main(String[] args) {
        int a = 15, b = 25, c = 20;
        int max;
        if (a > b) {
            if (a > c) {
                max = a;
            } else {
                max = c;
            }
        } else {
            if (b > c) {
                max = b;
            } else {
                max = c;
            }
        }
        System.out.println("Maximum: " + max);
    }
}
