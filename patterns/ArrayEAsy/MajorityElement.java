public class MajorityElement {

    public static int majorityElement(int[] nums) {
         
        int count = 0;
        int candidate = 0;

        
        for (int i = 0; i < nums.length; i++) {

            if (count == 0) {
                candidate = nums[i];
                count = 1;
            }
            else if (nums[i] == candidate) {
                count++;
            }
            else {
                count--;
            }
        }

      
        int count1 = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == candidate) {
                count1++;
            }
        }

        if (count1 > nums.length / 2) {
            return candidate;
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] nums = {2, 2, 1, 1, 1, 2, 2};

        System.out.println("Majority Element = " + majorityElement(nums));
    }
}//majority element 