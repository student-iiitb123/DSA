public class Merge {
    public static void main(String[] args){
        int arr[][] = {{1,2},{3,5},{4,8},{6,7},{8,10},{12,16}};
        int nums[][] =  new int[arr.length][2];
        int index = 0;

        int start1 = arr[0][0];
        int end1 = arr[0][1];

        for(int i =1;i<arr.length;i++){
         int start2 = arr[i][0];
         int end2 = arr[i][1];

         if(end1 >= start2){
         start1 = Math.min(start1,start2);
         end1 = Math.max(end1,end2);

         }else{
          
             nums[index][0] = start1;
             nums[index][1] = end1;
             index++;

             start1 = start2;
             end1 = end2;

         }
        }
           nums[index][0] = start1;
        nums[index][1] = end1;

        index++;

        for(int i =0;i<nums.length;i++){
            for(int j =0;j<nums[i].length;j++){
                System.out.print(nums[i][j]);
            }
            System.out.println();
        }
    }
}
