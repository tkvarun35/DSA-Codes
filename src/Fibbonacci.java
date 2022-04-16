import java.util.Scanner;

public class Fibbonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a=0,b=1,c;
        System.out.print("Enter the number:-");
        int n= input.nextInt();
        System.out.print(a+" "+b+" ");
        for(int i =0;i<n;i++){
            c=a+b;
            a=b;
            b=c;
            System.out.print(c +" ");
        }

    }
}
