import java.util.*;

public class Numbers {
   public static void main(String[] args) {

      // Task 1:

      System.out.print("The perfect numbers from 1 to 1000 are: ");
      for (int n = 1; n <= 1000; n++) { //Get everynumber from 1 to 1000
         int total = 0;
         for (int i = 1; i < n; i++) { //Find the number that can be divided by the perfectnumber I want to find
            if (n % i == 0) {
               total += i;             // total is the sum that add up all the number that can be perfectly divided
          }
        }
        if (total == n) {              // if total (exclude itself) equal to the perfect number, print out.
            System.out.println(n + " ");
      }
    }

    //Task 2:

      Scanner sc = new Scanner(System.in);

      System.out.println("Enter the populations of Telmar and Bism: ");
      int Tpp = sc.nextInt();//Telamr population at beginning
      int Bpp = sc.nextInt();//Bism pipulation at beginning
      int years = 0;//At the beginning is zero year

      while (years >= 0) { // while loop because I dont know how many time will excute.

         if (Bpp > Tpp) { // when Bism population is higher than Telamr break to print
            System.out.println("Bism had a population of " + Bpp + ", higher than that of Telmar's " + Tpp + ", " + years + " year(s) after the beginnings of the trends.");
            break;
         }
         years ++;
         Tpp = (int) (Tpp - Tpp * 0.0101); // every year Telamr population change
         Bpp = (int) (Bpp + Bpp * 0.0076); // every year Bism population change
      }
   }
}
