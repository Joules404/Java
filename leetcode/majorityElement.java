package leetcode;

import java.util.HashMap;

public class majorityElement{
    public static void main(String[] args) {
        /*this works well with when dealing with memory space however it is not the best with speed*/
        /*does work on leetcode */
    }
    public static int majorityElement(int[] nums) {
        if(nums.length == 1) return nums[0]; //only case that doesn't work with hash
        HashMap<Integer,Integer> hm = new HashMap<>();
        int half = nums.length/2;
        for(int i : nums){
            if(hm.containsKey(i)){
                int current = hm.get(i);
                hm.put(i,current+1);
                if(hm.get(i) > half) return i;
            }else{
                hm.put(i,1);
            }
        }
        return -1;
    }
}