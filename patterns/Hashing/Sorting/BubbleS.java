public class BubbleS{

    public static void inner(int i,int j,int arr[]) {
        if(j>=5) return;
        //work
        if(arr[i]<arr[j]){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        inner(i,j+1,arr);
    }

    public static void outer(int i,int arr[]){
        if(i>=5) return;
        inner(i,0,arr);
        outer(i+1,arr);

        
    }
    public static void main(String[] args) {
        int arr[] ={6,4,8,2,9};
        outer(0, arr);
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]);
        }

    }
}