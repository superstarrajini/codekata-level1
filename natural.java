import java.util.*;
import java.lang.*;
import java.io.*;

class Naturalo 
{
    public static void main(String args[])
    {
        int x, i = 1 ;
        int sumx = 0;
        System.out.println("");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        while(i <= x)
        {
            sumx = sumx +i;
            i++;
        }
        System.out.println(+sumx);
    } 
}
