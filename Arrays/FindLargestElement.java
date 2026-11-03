class FindLargestElement {
    public static void main(String[] args) {
        int[] numbers = {5, 12, 6, 7, 9};
        int largest = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (largest < numbers[i]) {
                largest = numbers[i];
            }

        }
        System.out.println(largest);
    }

}