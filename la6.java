import java.util.*;

public class PasswordValidator {

  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    String userpassword = sc.nextLine();
    getValidPassword(userpassword);
    while (sc.hasNextLine()) {
            String str = sc.nextLine();
            getValidPassword(str);
    }

  }

  public static void getValidPassword(String userpassword) {
    Boolean isVaild1 = checkLength(userpassword);
    Boolean isVaild2 = checkUpperCase(userpassword);
    Boolean isVaild3 = checkNumbers(userpassword);
    Boolean isVaild4 = checkLowerCase(userpassword);

    if (isVaild1 && isVaild2 && isVaild3 && isVaild4) {
      System.out.println("Password accepted");
    }
    else {
      System.out.println("Invalid password, try again");
    }
   }

  public static Boolean checkLength(String userpassword) {
    if (userpassword.length() >= 8) {
      return true;
    }
    else {
      return false;
    }
  }

  public static Boolean checkUpperCase(String userpassword) {
    int i = 0;
    int counter = 0;

    while (i < userpassword.length()) {
      if (userpassword.charAt(i) >= 'A' && userpassword.charAt(i) <= 'Z') {
        counter++;
      }
      i++;
    }
    if (counter >= 2) {
      return true;
    }
    else {
      return false;
    }
  }

  public static Boolean checkLowerCase(String userpassword) {
    int i = 0;
    int counter = 0;

    while (i < userpassword.length()) {
      if (userpassword.charAt(i) >= 'a' && userpassword.charAt(i) <= 'z') {
        counter++;
      }
      i++;
    }
    if (counter >= 1) {
      return true;
    }
    else {
      return false;
    }
  }

  public static Boolean checkNumbers(String userpassword) {
    int i = 0;
    int counter = 0;

    while (i < userpassword.length()) {
      if (userpassword.charAt(i) >= '0' && userpassword.charAt(i) <= '9') {
        counter++;
      }
      i++;
    }
    if (counter >= 1) {
      return true;
    }
    else {
      return false;
    }
  }
}
