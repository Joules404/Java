package leetcode;
public class numberpalindrome{
    public static void main(String[] args) {
    /*in terms of speed the program beat half of the others but in terms of memory it wasn't the best */
    /*after change it did much better with memory */
    /*this can be faster with a for loop => iterating to n/2 then checking left with (n-i-1) */
    }
    public boolean isPalindrome(int x) {
        if(x < 0) return false;
        String str = Integer.toString(x);
        //int length = str.length();
        int left_index = 0; 
        int right_index = str.length()-1;
        while(left_index < right_index){
            if(str.charAt(left_index++) != str.charAt(right_index--)) return false;
            //left_index+=1;
            //right_index-=1;
        }
        if(str.charAt(left_index) != str.charAt(right_index)) return false;
        return true;
    }
}