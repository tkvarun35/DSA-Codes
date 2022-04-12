import java.util.Scanner;

public class oddeven {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter The number: ");
        int a = input.nextInt();
//        System.out.println(a);
//        System.out.println(a&1);
         if((a&1)==0){
             System.out.println("The number is Even.");
         }
         else{
             System.out.println("The number is Odd.");
         }
    }
}
