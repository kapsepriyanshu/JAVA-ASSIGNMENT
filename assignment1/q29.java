class DuplicateFrequency {
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 4, 4, 4};
        for (int i = 0; i < array.length; i++) {
            int count = 1;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                    array[j] = -1; // Mark duplicate
                }
            }
            if (array[i] != -1 && count > 1) {
                System.out.println(array[i] + " appears " + count + " times.");
            }
        }
    }
}
