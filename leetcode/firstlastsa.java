package leetcode;
public class firstlastsa{
    public static void main(String[] args) {
        //System.out.println("hello world does this work");
        int[] nums = {5,7,7,8,8,8,10};
        // System.out.println(binarysearch(nums, 8));
        int[] vals = searchRange(nums, 7);
        System.out.println(vals[0] + " " + vals[1]);
    }

    static int[] searchRange(int[] nums, int target){
        int ret[] = {-1,-1};
        ret[0] = inner(nums,target,true);
        if(ret[0] != -1){
            ret[1] = inner(nums,target,false);
        }
        return ret;
    }
    static int inner(int[] nums, int target, boolean startIndex){
        int ret = 0;;
        int left = 0; int right = nums.length-1;
        while(left <= right){
            int middle = left + (right-left)/2;
            if(target > nums[middle]) left = middle + 1;
            else if(target < nums[middle]) right = middle - 1;
            else{
                ret = middle;
                if(startIndex)right = middle - 1;
                else left = middle + 1;
            }
        }
        return ret;
    }
}