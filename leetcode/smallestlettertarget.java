package leetcode;
public class smallestlettertarget{
    public static void main(String[] args) {
        //runs super fast but memory wise its not the best it only beats 43 percent
    }
    public static char nextGreatestLetter(char[] letters, char target) {
        if(target >= letters[letters.length-1]) return letters[0];
        int left = 0;
        int right = letters.length-1;
        while(left <= right){
            int middle = left + (right - left) / 2;
            if(target >= letters[middle]) left = middle + 1;
            else right = middle - 1;
        }
        return letters[left];
    }
}