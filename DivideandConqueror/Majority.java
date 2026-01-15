

public class Majority {
public static int merge(int arr[], int lo, int mid, int hi,
                        int leftMajor, int rightMajor) {
// CONT LEFT MAJOR RIGHT MAJOR
    if (leftMajor == rightMajor) {
        return leftMajor;
    }

    int count1 = 0;
    int count2 = 0;

    for (int i = lo; i <= hi; i++) {
        if (arr[i] == leftMajor) count1++;
        if (arr[i] == rightMajor) count2++;
    }

    return (count1 > count2) ? leftMajor : rightMajor;
}

    public static int majority(int arr[],int lo,int hi){
        if(lo == hi) return arr[lo];
        int mid = (lo+hi)/2;
       int leftMajor = majority(arr, lo, mid);
       int rightMajor = majority(arr, mid + 1, hi);


        //combine time
      return merge(arr, lo, mid, hi, leftMajor, rightMajor);
    }
    
    public static void main(String[] args) {
        int arr[] = {2,2,1,1,1,2,2};
    int ans = majority(arr, 0, arr.length - 1);
    // ANSWER
    System.out.println(ans);
    }
}
