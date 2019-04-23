public class DotProduct
{
   public static void main(String[] args)
   {

      //create the array A exactly as shown
      int[][] A = { {10,55,4,89,39} , {45,9,49,98,23} , {4,8,90,23,9} , {8,32,80,2,31} };

      // create the array B exactly as shown
      int[][] B = {  {40,1,16} , {90,3,7} , {9,2,22} , {44,35,60} , {18,67,21} };

      // prepare the product array C, currently empty (filled with 0's)
      int[][] C = new int [3][3];

      // compute the dot product of A's row 2, and B's column 1

      int sum = 0;

      for (int i= 0; i < 5; ++i)
      {
         sum = sum + A[2][i]*B[i][1];
      }

      // set the value of C[2][1]
      C[2][1] = sum;

      System.out.println(C[2][1]);

   } // end main
} // end class
