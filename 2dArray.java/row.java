public class row {
  public static void main(String[] args) {

        int[][] arr = {
            {10,20,30,40},
            {15,25,35,45},
            {27,29,37,48},
            {32,33,39,50}
        };

        int key = 29;

        for (int i = 0; i < arr.length; i++) {
            int low = 0;
            int high = arr[0].length - 1;

            while (low <= high) {
                int mid = (low + high) / 2;

                if (arr[i][mid] == key) {
                    System.out.println("Found at row " + i + ", col " + mid);
                    return;
                }

                else if (arr[i][mid] < key) {
                    low = mid + 1;
                }

                else {
                    high = mid - 1;
                }
            }
        }

        System.out.print("Key not found");
    }
}



