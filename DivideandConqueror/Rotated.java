public class Rotated {

    public static int Rotatedarr(int arr[], int target, int start, int end) {

       
        if (start > end) {
            return -1;
        }

        int mid = (start + end) / 2;

        if (arr[mid] == target) {
            return mid;
        }

        // Left part is sorted
        if (arr[start] <= arr[mid]) {

           
            if (arr[start] <= target && target < arr[mid]) {
                return Rotatedarr(arr, target, start, mid - 1);
            } 
            // search right part
            else {
                return Rotatedarr(arr, target, mid + 1, end);
            }
        }

        // Right part is sorted
        else {
            if (arr[mid] < target && target <= arr[end]) {
                return Rotatedarr(arr, target, mid + 1, end);
            } else {
                return Rotatedarr(arr, target, start, mid - 1);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        int index = Rotatedarr(arr, target, 0, arr.length - 1);
        System.out.println(index);
    }
}
