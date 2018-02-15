//Problem 2. Check Permutation. Given two strings, write a method to decide if
//one is a permutation of the other.

public class checkPermutation {
  public static boolean checkPermutation(String a, String b) {
      if (a.length() != b.length()) {
        return false;
      }
      if (a.length() == 0 | b.length() == 0) {
        return false;
      }
      int[] characters = new int[128]; //Assume ASCII
      for (int i = 0; i < a.length(); i++) {
        characters[a.charAt(i)]++;
      }
      for (int j = 0; j < b.length(); j++) {
        characters[b.charAt(j)]--;
        if (characters[b.charAt(j)] < 0) {
          return false;
        }
      }
      return true;
    }

    public static void main(String[] args) {
      String word_a = "facebook";
      String word_b = "cafekoob";
      String word_c = "racar";
      String word_d = "";
      System.out.println(word_a + ", " + word_c + ", " + checkPermutation(word_a, word_c));
      System.out.println(word_a + ", " + word_b + ", " + checkPermutation(word_a, word_b));
      System.out.println(word_a + ", " + word_d + ", " + checkPermutation(word_a, word_d));
    }
  }
