public class binary {
    public static void main(String[] args) {

        int arr[] = {1, 2, 5, 7, 8, 9};
        int low = 0;
        int high = arr.length - 1;
        int key = 7;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (arr[mid] > key) {
                high = mid - 1;
            }
            else if (arr[mid] < key) {
                low = mid + 1;
            }
            else {
                System.out.println("Found at index " + mid);
                return;
            }
        }

        System.out.println("Key not found");
    }
}
