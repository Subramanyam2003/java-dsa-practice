class CountEvenNumbers {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6};
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}