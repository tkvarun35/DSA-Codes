import java.util.Scanner;

public class swapping {
    public static void main(String[] args) {

        // In this swapping is done by Using bitwise Operators....


        Scanner input= new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int a =input.nextInt();
        System.out.print("Enter Second Number: ");
        int b =input.nextInt();
        System.out.println("Initially a="+a+" and b="+b);
        a= a^b;
        b=a^b;
        a=a^b;
        System.out.println("Finally a="+a+" and b="+b);

    }
}
