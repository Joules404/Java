import java.util.Scanner;

public class typecasting{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float num = scanner.nextFloat();
        System.out.println(num);
        int x = 258;
        byte xx = (byte) (x);
        System.out.println(xx);
    }
}