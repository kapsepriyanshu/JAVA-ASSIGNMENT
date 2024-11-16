import java.util.Arrays;

class FindMedian {
    public static void main(String[] args) {
        int[] numbers = {3, 1, 4, 2, 5};
        Arrays.sort(numbers);
        int n = numbers.length;
        double median;
        if (n % 2 == 0) {
            median = (numbers[n / 2 - 1] + numbers[n / 2]) / 2.0;
        } else {
            median = numbers[n / 2];
        }
        System.out.println("Median: " + median);
    }
}
