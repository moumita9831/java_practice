import java.util.Scanner;

public class TJS {
    public static void main(String[] args) {
        System.out.println("Taking Input From The User");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number 1");
        int a=sc.nextInt();

        System.out.println("Enter Number 2");
        int b=sc.nextInt();
        int sum = a+b;
        System.out.println("The sum of these numbers is");
        System.out.println(sum);
    }
}
