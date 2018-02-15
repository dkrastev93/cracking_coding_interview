//Problem 1.4: Given a string, write a function to check if it is
//a permutation of a palindrome. A palindrome is a word or phrase that is the
//same forwards and backwards. A permuatation is a rearrangement of letters.
//The palindrome does not need to be limited to just dictionary words.

public class palindromePermutation {

  public static boolean isPalindromePermutation(String input) {
    int oddValues = 0;
    int[] charCount = new int[128];
    for (int i = 0; i < input.length(); i++) {
      while (input.charAt(i) == ' ') {
        i++;
      }
      charCount[(int)input.charAt(i)]++;
    }
    for (int j = 0; j < charCount.length; j++) {
      if (oddValues > 1) {
        return false;
      }
      if ((charCount[j] % 2) != 0) {
        oddValues++;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    String s = "tact coa";
    System.out.println(s + ", " + isPalindromePermutation(s));
  }
}
