 package leetcode;
 public class ceiling {
    public static void main(String[] args) {
        int[] nums = {2,3,5,9,14,16,17,18};
        int[] nums1 = {1,3,5,6};
        System.out.println(roof(nums,6));
        System.out.println(roof(nums1,7));
        System.out.println(searchInsert(nums,6));
        System.out.println(searchInsert(nums1,7));
    }
    public static int roof(int[] nums, int target){
        int left = 0;
        int right = nums.length-1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            //if(nums[left] == nums[mid]) return nums[right];
            if(nums[mid] == target) return nums[mid];
            if(nums[left] < target){
                if(nums[mid] < target){
                    left = mid+1;
                }else{
                    right = mid-1;
                }
            } else return nums[left];
        }
        return -1;
    }
    public static int searchInsert(int[] nums, int target) {
        int left = 0 ;
        int right = nums.length-1;
        while (left<=right){
            int mid  = left + (right-left)/2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }
}