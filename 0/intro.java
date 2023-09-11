import java.util.Scanner;

public class intro{
    public static void main(String[] args) {
        System.out.println("First program in a while.");
        System.out.println(args[0]); //showcasing the command line argument(s)
        Scanner scanner =  new Scanner(System.in);
        System.out.println(scanner.nextLine());
        scanner.close();
    }
}