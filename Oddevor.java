import java.util.Scanner;
 
class Oddevor
{
   public static void main(String args[])
   {
      int x;
      System.out.println("");
      Scanner sc = new Scanner(System.in);
      x = sc.nextInt();
     if(x < 0)
        {
            System.out.println("invalid");
        }
        else
        {
      if (x % 2 == 0)
         System.out.println("Even");
      else
         System.out.println("Odd");
   }
   }
}
