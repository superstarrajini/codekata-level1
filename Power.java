import java.util.*;
import java.lang.*;
import java.io.*;
class Power {

    public static void main(String[] args) {

        int ba,ex;
        System.out.println("");
        Scanner sc=new Scanner (System.in);
        ba=sc.nextInt();
        ex=sc.nextInt();
        long r= 1;

        while (ex != 0)
        {
            r *= ba;
            --ex;
        }

        System.out.println(r);
    }
}
