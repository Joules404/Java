public class binarysearch{
    public static void main(String[] args) {
        System.out.println("Binary Search Theory");
        int[] nums = {2,4,6,9,11,12,14,18,19,20,36,48};//length = 12
        System.out.println(own(nums,4));
    }
    public static boolean own(int[] nums, int target){
        int left_index = 0;
        int right_index = nums.length-1;
        //int middle_index = nums.length/2; THIS WAY WON'T WORK BECAUSE POSSIBILITY LEFT + RIGHT MAY EXCEED INTEGER_MAX
        //while(left_index!=middle_index && right_index!=middle_index){
        // int middle_index = left_index + ((right_index-left_index)/2);
        while(left_index<=right_index){
            int middle_index = left_index + ((right_index-left_index)/2);
            if(nums[middle_index] != target){
                if(target > nums[middle_index]) left_index = middle_index+1;
                else right_index = middle_index-1;
                // middle_index = (right_index+left_index)/2;
            }else return true;
        }
        return false;
    }
}