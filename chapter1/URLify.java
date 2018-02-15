//Problem 1.3. Write method to replace all spaces in a string with '%20'.
//Assume the string has sufficient space at the end to hold the additional
//characters, and that you're given the 'true' length of the string.

public class URLify {
  public static String URLify(String input, Integer length) {
    StringBuilder sb = new StringBuilder(length
    for (int i = 0; i < length; i++) {
      if (input.charAt(i) == ' ') {
        sb.append("%20");
      }
      else sb.append(input.charAt(i));
    }
    return sb.toString();
  }

  public static void main(String[] args) {
    String input = "Mr John Smith    ";
    int true_length = 13;
    System.out.println(URLify(input, true_length));
  }
}
