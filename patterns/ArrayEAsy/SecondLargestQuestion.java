public class SecondLargestQuestion {
    public static void main(String[] args) {
        int arr[] = {3,2,1,5,2};
        int maxElement = 0;
        int secondMaxElement = 0;
        int secondMax = Integer.MIN_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i =0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
            maxElement = Math.max(maxElement, max);
        }
      for(int i =0;i<arr.length;i++){
        if(arr[i] >secondMax && arr[i] != maxElement){
            secondMax = arr[i];
        }
        secondMaxElement = Math.max(secondMaxElement, secondMax);
      }
      System.out.println(secondMaxElement);
    }

}


//Method 1 = Sorting NlogN;
//Method2 = 
    

