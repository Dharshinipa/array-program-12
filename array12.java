public class ArraySum {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int sum = 0;

        // Calculate the sum of all elements
        for (int num : array) {
            sum += num;
        }

        System.out.println("The sum of all elements in the array is: " + sum);
    }
}
