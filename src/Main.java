import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
public class Main {

  // The time complexity is O(n^2), where n is the input 'x'
  public static void timesTable(int x) {
    for(int i = 1; i <= x; i++) {
        for(int j = 1; j <= x; j++) {
            System.out.print(i*j + " ");
        }
        System.out.println();
    }
  }

  // The time complexity is O(n), where n is the length of the input word
  public static void printLetters(String word) {
    char[] letters = word.toCharArray();

    for (char letter : letters) {
        System.out.println(letter);
    }
  }

  // The time complexity is O(m), where m is the number of banned passwords
  public static boolean isBanned(String password) {
    String[] bannedPasswords = {"password", "hello", "qwerty"};
    boolean banned = false;
    for(String bannedPassword : bannedPasswords) {
        if(password.equals(bannedPassword)) {
            banned = true;
        }
    }
    return banned;
  }

  // The time complexity is O(n), where n is the length of the nums array
  public static int computeProduct(int[] nums) {
    int total = 1;
    for(int num : nums) {
        total *= num;
    }
    return total;
  }
 
  // The time complexity isO(n), where n is the length of the nums array
  public static void describeProduct(int[] nums) {
    System.out.println("About to compute the product of the array...");
    int product = computeProduct(nums);
    System.out.println("The product I found was " + product);
  }

  // The time complexity is O(n), where n is the input number 'n'
  public static int computeFactorial(int n) {
    int result = 1;
    for(int i = 1; i <= n; i++) {
        result *= i;
    }
    return result;
  }

  // The time complexity is O(n)
  public static void computeAllFactorials(int[] nums) {
    for(int num : nums) {
        int result = computeFactorial(num);
        System.out.println("The factorial of " + num + " is " + result);
    }
  }

  // The time complexity is O(n), where n is the length of the ArrayList
  public static void checkIfContainedArrayList(ArrayList<String> arr, String target) {
    if (arr.contains(target)) {
        System.out.println(target + " is present in the list");
    } else {
        System.out.println(target + " is not present in the list");
    }
  }

  // The time complexity is: O(n^2), where n is the length of the arrays
  public static boolean containsOverlap(String[] wordsA, String[] wordsB) {
    for(String wordA : wordsA) {
        for(String wordB : wordsB) {
            if(wordA.equals(wordB)) {
                return true;
            }
        }
    }
    return false;
  }

  // The time complexity is: O(n), where n is the total length of the two arrays
  public static boolean containsOverlap2(String[] wordsA, String[] wordsB) {
    Set<String> wordsSet = new HashSet<>();
    for(String word : wordsA) {
        wordsSet.add(word);
    }

    for(String word : wordsB) {
        if(wordsSet.contains(word)) {
            return true;
        }
    }

    return false;
  }

  // The time complexity is O(n), where n is the length of the chars array
  public static void printCharacters(char[] chars) {
    for (int i = 0; i < chars.length; i++) {
      char character = chars[i];
      System.out.println("The character at index " + i + " is " + character);
    }
  }

  // The time complexity is O(1)
  public static double computeAverage(double a, double b) {
    return (a + b) / 2.0;
  }

  // The time complexity is O(1), assuming the set's `contains` method is O(1)
  public static void checkIfContainedHashSet(HashSet<String> set, String target) {
    if (set.contains(target)) {
      System.out.println(target + " is present in the set");
    } else {
      System.out.println(target + " is not present in the set");
    }
  }

  // The time complexity is O(n), where n is the length of the names array
  public static String emailLookup(String[] names, String[] emails, String queryName) {
    for(int i = 0; i < names.length; i++) {
      if (names[i].equals(queryName)) {
        return emails[i];
      }
    }
    return "Person not found";
  }

  // The time complexity is O(1), since a HashMap lookup is O(1) on average
  public static String emailLookupEfficient(HashMap<String, String> namesToEmails, String queryName) {
    return namesToEmails.getOrDefault(queryName, "Person not found");
  }

  // The time complexity is O(n^2), where n is the length of the set/list
  public static boolean hasCommon(HashSet<String> wordSet, ArrayList<String> wordList) {
    for(String word : wordSet) {
      if(wordList.contains(word)) {
        return true;
      }
    }
    return false;
  }

  // The time complexity is O(n), where n is the total length of the set and list
  public static boolean hasCommonEfficient(HashSet<String> wordSet, ArrayList<String> wordList) {
    for(String word : wordList) {
      if(wordSet.contains(word)) {
        return true;
      }
    }
    return false;
  }

  // The best choice of data structure is: HashMap<String, Double>
  // A HashMap is ideal for keeping track of stock prices, providing efficient O(1) time complexity for both updates and lookups.

  // The best choice of data structure is: ArrayList<String>
  // An ArrayList allows efficient adding of songs to the end and accessing songs by their position, making it a good fit for this scenario.

  // The best choice of data structure is: LinkedList<String>
  // A LinkedList preserves the order of recent search queries, which is ideal when displaying the user's recent searches.
}
