import java.util.Scanner;

public class start {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println("I am from bd");

        Scanner obj=new Scanner(System.in);
        System.out.println("Enter first number");
        int a=obj.nextInt();
        System.out.println("Enter second number");
        int b=obj.nextInt();
        System.out.println("The sum is "+(a+b));

        // String s=obj.next();
        // System.out.print(s);
    }
}
