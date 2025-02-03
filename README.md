[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-2972f46106e565e64193e422d61a12cf1da4916b45550586e14ef0a7c637dd04.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=18005159)
# unit-6-4-assignment

## Git Config
```
git config user.name "user"
git config user.email "email"
```

## Compiling and Running Java Programs
Note that since our classes are separate classes, you will need to compile ALL the files (at least one time).  You can do this by running
```
javac *.java
```
The star means to compile every file that is a Java file type.

Run your code by running
```
java Main.java
```

After you compile the shape classes, you only need to compile and run `Main.java` as usual.

# Instructions  

## countLength
Write the `countLength` method, that takes in an array of `Strings`, and a target length (> 0), and returns the number of elements whose length is equal to the target length.
```
public static int countLength(String[] arr, int targetLength)
```

## indexOf
Implement your own version of `indexOf` for an array of `double` values.  The method should return the index of the first occurrence of the `target` in the array, and should return -1, if the target cannot be found.
```
public static int indexOf(double[] arr, double target)
```
## hasDuplicates
Write the method `hasDuplicates`, that takes in an array of `int` values, and returns `true` if there is at least one repeated element, and `false` if the entire array contains only unique elements.

Use a combination of the algorithms we saw previously.
```
public static boolean hasDuplicates(int[] arr)
```
## findMode
Write the method `findMode`, that takes in an array of `Strings`, and returns the element that appears the most often in the array.  If there are multiple modes, then only return one of them.
```
public static String findMode(String[] arr)
```
