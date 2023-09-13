// Online Java Compiler
// Use this editor to write, compile and run your Java code online
package leetcode;
class circulararray {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int[] nums = {1,2,3,4,5,6,7};
        rotate(nums,2);
        print(nums);
        
    }
    public static void print(int[] nums){
        for(int i : nums){
            System.out.print(i + " ");
        }
        System.out.println();
    }
         //formula: (curr_index+1)%size for shifting 1 right
        //index: 0 1 2 3 4 5 6
        //--------------
        //value: 1 2 3 4 5 6 7
        //value: 1 2 1 4 5 6 7 (will have other array matching og)
        //int curr = nums[0]; //have 1
    public static void rotate(int[] nums,int k){
        int[] nums_copy = nums.clone();
        //for(int i = 0; i < nums.length; i++) nums_copy[i] = nums[i];
        for(int i = 0; i < nums.length; i++){
            nums[(i+k)%nums.length] = nums_copy[i]; ///6+2
        }
    }
}