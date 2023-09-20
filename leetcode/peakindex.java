package leetcode;
public class peakindex{
    public static void main(String[] args){
        int[] nums = {0,1,2,3,10,5,2};
        int[] nums2 = {3,5,3,2,0};//right is now 1, left is still 0, middle is 0
        System.out.println(peakIndexMountainArray(nums)); 
        System.out.println(peakIndexMountainArray(nums2));
        // System.out.println(bs(num2,3));      
    }
    /*
     * [0,10,5,2]
     */
    public static int peakIndexMountainArray(int[] nums){
        int left = 0;
        int right = nums.length - 1;
        int peak = -1;
        while(left <= right){
            int middle = left + (right - left + 1)/2; //but why???
            if(nums[middle] > nums[middle-1] && nums[middle] > nums[middle+1]) return middle;
            else{
                if(nums[middle] > nums[middle-1] && nums[middle] < nums[middle+1]){//going up
                    left = middle+1;
                }else{//going down
                    right = middle-1;
                }
            }
        }
        return peak;
    }

    public static int bs(int[] nums, int target){
        int left = 0; int right = nums.length-1;
        int ret = -1;
        while(left <= right){
            int middle = left + (right-left)/2;
            if(nums[middle] == target) return middle;
            else if(nums[middle] > target) right = middle-1;
            else left = middle+1;
        }
        return ret;
    }
}