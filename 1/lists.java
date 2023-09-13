import java.util.Arrays;
//import java.util.Scanner;

public class lists{
    public static void main(String[] args) {
        System.out.println("Arrays and Arraylists in Java");
        // //int[] arr1 = new int[5]; //syntax somewhat similar to C's
        // //int[] arr1_ = {1,2,3,4,5};
        // String[] strings = new String[5];
        // int[] ints = {1,2,3,4,5};// = new int[5];
        // Integer[] integers = new Integer[5];
        // System.out.println(strings[0]); //will return null
        // System.out.println(ints[0]); //will return 0
        // System.out.println(integers[0]); //will return null
        // /*think about the None in python it works the same way */
        // double[] doubles = {1,2,3,4,5};
        // System.out.println(Arrays.toString(ints));
        // System.out.println(Arrays.toString(doubles)); 
        // System.out.println(strings.length);
        // String[] words = new String[5];
        // Scanner scanner = new Scanner(System.in);
        // for(int i = 0; i < words.length; i++) words[i] = scanner.next();
        // System.out.println(Arrays.toString(words));
        int[] almonds = {1,2,3,4,5};
        int[] cashews = almonds; //pointing to the same object
        almonds[0] = 11;
        System.out.println(Arrays.toString(almonds));
        System.out.println(Arrays.toString(cashews));
        change(cashews);
        System.out.println(Arrays.toString(almonds));
        System.out.println(Arrays.toString(cashews));
        String[] strings = {"Julio","Reyes"};
        System.out.println(Arrays.toString(strings));
        changeString(strings);
        System.out.println(Arrays.toString(strings));
        int a = 30;
        System.out.println(a);
        changeprimitive(a);
        System.out.println(a);//there should be no change because it is pass by value
    }

    static void change(int[] nums){
        nums[0] = 69;
    }
    static void changeString(String[] strings){
        strings[0] = null;
    }
    static void changeprimitive(int a){
        a = 10;
    }
}