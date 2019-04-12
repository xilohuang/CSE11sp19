import java.util.*;

public class Lab2 {

   public static void main (String[] args) {
      String telephonenum;
      String areacode;
      String exchange;
      String number;
   
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter 10-digit telephone number: ");
   
      telephonenum = scan.next();
      //String length = Integer.toString(telephonenum);
      int length = telephonenum.length();
      
      if (length == 10) {
         areacode = telephonenum.substring(0,3);
         exchange = telephonenum.substring(3,6);
         number = telephonenum.substring(6);
      
         System.out.println("You entered " + telephonenum);
         System.out.println("The area code is " + areacode);
         System.out.println("The exchange is " + exchange);
         System.out.println("The number is " + number);
         System.out.println("The complete telephone number is (" + areacode + ") " + exchange + "-" + number);
      }
   
      else {
         System.out.println("You entered " + telephonenum);
         System.out.println("Please enter a 10-digit number");
      }
   }
}