import java.util.*;

public class Seasons {
   public static void main (String[] args) {
      int month;
      int day;
      String season = "";
      int input = 0;
      
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a month and day: ");
      month = sc.nextInt();
      day = sc.nextInt();
      
      //System.out.println(month + day);
      
      if (month <= 3) {
         season = "Winter";
         input = 1;
      }
      else if (month >= 4 && month <= 6) {
        season = "Spring";
        input = 2;
      }
      else if (month >= 7 && month <= 9) {
        season = "Summer";
        input = 3;
      }
      else if (month >= 10 && month <= 12) {
        season = "Fall";
        input = 4;
      }
      
      switch (input) {
        case 1: if(month % 3 == 0 && day >= 21) {
                  season = "Spring";
                  System.out.println(season);
                  }
               else {
                  System.out.println(season);
               };break;
        case 2: if(month % 3 == 0 && day >= 21) {
                  season = "Summer";
                  System.out.println(season);
                  }
               else {
                  System.out.println(season);
               };break;
        case 3: if(month % 3 == 0 && day >= 21) {
                  season = "Fall";
                  System.out.println(season);
                  }
               else {
                  System.out.println(season);
               };break;
        case 4: if(month % 3 == 0 && day >= 21) {
                  season = "Winter";
                  System.out.println(season);
                  }
               else {
                  System.out.println(season);
               };break;
      }
   }
}
