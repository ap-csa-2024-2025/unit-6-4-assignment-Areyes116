import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Main
{
  public static void main(String[] args)
  {
    // Example arrays to test the methods
    String[] stringArray = {"apple", "banana", "cherry", "apple", "date"};
    double[] doubleArray = {1.5, 2.5, 3.5, 2.5};
    int[] intArray = {1, 2, 3, 4, 5, 2};

    // Testing countLength method
    System.out.println("Count of strings with length 5: " + countLength(stringArray, 5));
    
    // Testing indexOf method
    System.out.println("Index of 2.5 in double array: " + indexOf(doubleArray, 2.5));
    
    // Testing hasDuplicates method
    System.out.println("Does the integer array have duplicates? " + hasDuplicates(intArray));
    
    // Testing findMode method
    System.out.println("Mode of the string array: " + findMode(stringArray));
  }

  // countLength: Returns the number of strings with the target length
  public static int countLength(String[] arr, int targetLength)
  {
    int count = 0;
    for (String s : arr) {
        if (s.length() == targetLength) {
            count++;
        }
    }
    return count;
  }

  // indexOf: Returns the index of the first occurrence of the target in a double array
  public static int indexOf(double[] arr, double target)
  {
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] == target) {
            return i;
        }
    }
    return -1;
  }

  // hasDuplicates: Returns true if there are duplicates in the integer array
  public static boolean hasDuplicates(int[] arr)
  {
    for (int i = 0; i < arr.length; i++) {
        for (int j = i + 1; j < arr.length; j++) {
            if (arr[i] == arr[j]) {
                return true;
            }
        }
    }
    return false;
  }

  // findMode: Returns the most frequent string in the array (mode)
  public static String findMode(String[] arr)
  {
    if (arr == null || arr.length == 0) return null;
    
    Map<String, Integer> frequencyMap = new HashMap<>();
    
    for (String s : arr) {
        frequencyMap.put(s, frequencyMap.getOrDefault(s, 0) + 1);
    }

    String mode = null;
    int maxFrequency = 0;
    for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
        if (entry.getValue() > maxFrequency) {
            maxFrequency = entry.getValue();
            mode = entry.getKey();
        }
    }
    
    return mode;
  }
}
