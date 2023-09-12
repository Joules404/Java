package leetcode;
public class evendigits{
    /*
     * iterate through an array and find the number of values with even number of digits
     * CONSTRAINT: 1 to 10^5 (100_000)
     */
    public static void main(String[] args) {
        int[] vals = {234,90,32,3000};
        System.out.println(findNumbers(vals));
        System.out.println(findNumbers2(vals));
        int a = 329323;
        System.out.println(Math.log10(a)); //should return 5?
    }
    static int findNumbers(int[] nums){
        int counter = 0;
        for(int val : nums){
            if(Integer.toString(val).length() % 2 == 0) counter+=1;
        }
        return counter;
    }
    static int findNumbers2(int[] nums){
        int counter = 0; 
        for(int i = 0; i < nums.length; i++){
            if((nums[i] > 9 && nums[i] < 100) || (nums[i] > 999 && nums[i] < 10000) || (nums[i]==100_000)) counter+=1;
        }
        return counter;
    }
    
}