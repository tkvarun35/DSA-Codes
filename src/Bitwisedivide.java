import java.sql.SQLOutput;

public class Bitwisedivide {
    public static void main(String[] args) {
//        bitwise right shift divides the number by 2

        int a=10;
        a=a>>1;
        System.out.println(a);


//        bitwise leftshift multiplies the number by 2
        int b=20;
        b=b<<1;
        System.out.println(b);

// the number on the right side shows how many times the number will be divided by 2 or multiplied by 2.

        int c= 128;
        c=c>>6;
        System.out.println(c);
    }
}
