import java.util.Scanner;
public class Calculator
{
public static void main (String[]args)
 {
 System.out.println("this is a calculator made by Lunar-eclips.");
 Scanner sc= new Scanner(System.in);
 System.out.println("Enter first number");
 double first_num=sc.nextDouble();
     double last_value = first_num ;
  for (int i=2;i>0;i++)
   {
     System.out.println("for Addition enter 1");
     System.out.println("for substraction enter 2");
     System.out.println("for multiplication enter 3");
     System.out.println("for division enter 4");
     System.out.println("To end at any point enter 5");
     int op =sc.nextInt();
       if (op==5)
       {
         System.out.println("Ending operations.");
         break;
       }
       else if (op>5 || op<1)
      {
       System.out.println("Wrong operation number");
       break;
     }
     System.out.println("Enter " +i+ "th number");
     double new_num=sc.nextDouble();
     if(op==1)
       {
      double add = last_value + new_num;
      last_value = add;
      System.out.println("result after addition " +last_value);
       }
     else if (op==2)
       {
         double sub = last_value - new_num;
         last_value =sub;
         System.out.println("result after subtraction " +last_value);
         
       }
     else if (op==3)
       {
         double mul = last_value * new_num;
         last_value = mul;
         System.out.println("result after multiplication " +last_value);
         
       }
     else if (op==4)
       {
       if (new_num!=0)
       {
         double div = last_value / new_num;
          last_value=div;
         System.out.println("result after division " +last_value);
     }
       else
         {
          System.out.println("You can't divide with 0");
          break;
         }
       }
      
     continue;
   }
  sc.close();
 }
}