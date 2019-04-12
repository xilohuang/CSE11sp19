import java.util.*;

public class Mandarins {
  
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int numberOfOranges;//number of Oranges
    int numberOfDozens;
    int numberOfSingles;
    double totalCost;
    int discountCost;
    
    //System.out.println("Please enter the total number of pineapples");
    
    numberOfOranges = in.nextInt();
    numberOfDozens = numberOfOranges / 12;
    numberOfSingles = numberOfOranges % 12;
    totalCost = numberOfDozens * 3.25 + numberOfSingles * 0.35;
    discountCost = (int) totalCost;
    System.out.print("You ordered " + numberOfOranges + " oranges.");
    System.out.print(" That's " + numberOfDozens + " dozen at $3.25 per dozen and " + numberOfSingles + " loose oranges at 35 cents per each for a total of $" + totalCost + ". ");
    System.out.print("With the special promotion, you pay $" + discountCost + "!");
  }
}
    