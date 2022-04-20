import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int a,b=0,temp;
        System.out.print("Enter the number:- ");
        a=input.nextInt();
        temp=a;
        while (a>0){
            b=b*10+a%10;
            a=a/10;


        }
        if (b==temp){
            System.out.println("It s a palindrome number.");
        }
        else System.out.println("Not a palindrome.");
    }
}
