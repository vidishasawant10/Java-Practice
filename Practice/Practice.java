import java.util.Scanner;

public class Practice{
    public static void main(String[] args) {
        Scanner myObj = new Scanner((System.in));

        System.out.println("Enter your Name: ");
        String name = myObj.nextLine();

        System.out.println("Enter value of a: ");
        int a = myObj.nextInt();

        System.out.println("Enter value of b: ");
        int b = myObj.nextInt();

        System.out.println("Name: "+name);
        System.out.println("a: "+a);
        System.out.println("b: "+b);

        int c = a + b;
        System.out.println("c: "+c);
    }
}