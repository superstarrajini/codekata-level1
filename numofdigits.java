import java.util.*;
import java.lang.*;
import java.io.*;

class NumberDigits {

    public static void main(String[] args) {

        int count = 0,num;
        Scanner sc =new Scanner(System.in);
        num=sc.nextInt();
        System.out.println("");

        while(num != 0)
        {
            // num = num/10
            num /= 10;
            ++count;
        }

        System.out.println( + count);
    }
}
