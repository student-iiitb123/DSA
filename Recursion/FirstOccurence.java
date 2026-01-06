
public class FirstOccurence {
    public static int Occurence(int arr[],int idx,int key){
        if(idx >= arr.length-1 ) {return  -1;}
        if(arr[idx] == key){ return idx;}
     
        
    
     return   Occurence(arr, idx+1, key);
       
    }
    public static void main(String[] args) {
        int arr[] = {8,3,6,9,10,2,5,3};
        int k=11;
       int s = Occurence(arr,0,k);
       System.out.println(s);
    }
}
