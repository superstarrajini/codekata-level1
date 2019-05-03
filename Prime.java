import java.util.*;
import java.lang.*;
import java.io.*;

class Prime 
{

    public static void main(String[] args) {

        int num ;
        boolean flag = false;
        System.out.println("");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        for(int i = 2; i <= num/2; ++i)
        {
            
            if(num % i == 0)
            {
                flag = true;
                break;
            }
        }

        if (!flag)
            System.out.println("yes");
        else
            System.out.println("no");
    }
}
