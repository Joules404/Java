public class linearsearch{
    public static void main(String[] args) {
        System.out.println("linear search");
        int[] nums = {18,23,12,90,64,3,43};
        /*suppose we have to find the value 90 (which is present) 
         *all we have to do is iterate through the array
         *best case it resides in the first index giving us a time complexity of O(1)
         *worst case it doesn't reside in the array giving us a time complexity of O(n)
        */
        int target = 900;
        int i;
        for(i = 0; i < nums.length; i++){
            if(nums[i] == target) {
                System.out.println("Target found at index: " + i);
                break;
            }
        }
        if(i == nums.length) System.out.println("Target not found.");
        String name = "Julio";
        char lookfor = 'u';
        System.out.println(search(name,lookfor));
        char[] letters = name.toCharArray();
        for(char ch : letters) System.out.println(ch);
        /*
         * we also go over iterating through an array to search for the minimum value
         * we also go over iterating through a specified range to search for a specific value
         * ^^these are things that I already know (the basics)
         */
        int a = 90;
        String aa = Integer.toString(a);
        System.out.println(aa);
        System.out.println(aa.getClass());
    }
    static boolean search(String name, char tolookfor){
        for(int i = 0; i < name.length(); i++) if(name.charAt(i) == tolookfor) return true;
        return false;
    }
    static int findElement(int[] val, int target){
        /*will return the element value if found, if not then return MAX_VALUE */
        for(int i : val){
            if(i == target) return i;
        }
        return Integer.MAX_VALUE;
    }
    static boolean findElement2(int[] val, int target){
        for(int i : val) if(i == target) return true;
        return false;
    }
}