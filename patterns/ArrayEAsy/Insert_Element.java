public class Insert_Element{
    public static void main(String[] args){
        int arr[][] = {{1,2},{3,5},{6,7},{8,10},{12,16}};
        int newArr[] = {4,8};

        int nums[][] = new int[arr.length+1][2];
        boolean insert = false;
        
        for(int i =0;i<arr.length;i++){
            if(insert == false && newArr[0] < arr[i][0]){
              nums[i][0] = newArr[0];
              nums[i][1] = newArr[1];
              insert = true;
            }
            else{
                   nums[i] = arr[i];
            }
         
        }

        for(int i =0;i<nums.length;i++){
            for(int j = 0;j<nums[i].length;j++){
                System.out.print(nums[i][j]);
            }
             System.out.println();
           
        }
    System.out.println();
    }
}