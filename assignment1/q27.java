class SmallestInArray {
    public static void main(String[] args) {
        int[] array = {5, 3, 8, 2, 7};
        int smallest = array[0];
        for (int num : array) {
            if (num < smallest) {
                smallest = num;
            }
        }
        System.out.println("Smallest: " + smallest);
    }
}
