public class HighestandLowest {

    public static void main(String[] args) {

        int max = 0;
        int min = Integer.MAX_VALUE;

        int arr[] = {10, 5, 10, 15, 10, 5};
        boolean visited[] = new boolean[arr.length];

        for (int i = 0; i < arr.length; i++) {

            if (visited[i]) {
                continue;
            }

            int frequency = 1;

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] == arr[j]) {
                    frequency++;
                    visited[j] = true;
                }
            }

            // Update after counting is complete
            max = Math.max(max, frequency);
            min = Math.min(min, frequency);
        }

        System.out.println("Maximum Frequency = " + max);
        System.out.println("Minimum Frequency = " + min);
    }
}