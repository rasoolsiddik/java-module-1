import java.util.Scanner;
public class arrayoperations {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        int[] arr = {10, 25, 50, 60, 75, 90, 12, 37, 50, 90};

        // 1. Count how many numbers are greater than 50
        int countGreater50 = 0;
        for (int num : arr) {
            if (num > 50) countGreater50++;
        }
        System.out.println("1. Numbers greater than 50: " + countGreater50);

        // 2. Print all elements in reverse order
        System.out.print("2. Array in reverse: ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // 3. Print even numbers
        System.out.print("3. Even numbers: ");
        for (int num : arr) {
            if (num % 2 == 0) System.out.print(num + " ");
        }
        System.out.println();

        // 4. Print odd numbers
        System.out.print("4. Odd numbers: ");
        for (int num : arr) {
            if (num % 2 != 0) System.out.print(num + " ");
        }
        System.out.println();

        // 5. Find maximum element
        int max = arr[0];
        for (int num : arr) {
            if (num > max) max = num;
        }
        System.out.println("5. Maximum element: " + max);

        // 6. Find minimum element
        int min = arr[0];
        for (int num : arr) {
            if (num < min) min = num;
        }
        System.out.println("6. Minimum element: " + min);

        // 7. Check whether a given number exists
        System.out.print("7. Enter number to search: ");
        int search = sc.nextInt();
        boolean found = false;
        for (int num : arr) {
            if (num == search) {
                found = true;
                break;
            }
        }
        System.out.println("   Exists? " + found);

        // 8. Copy all elements to another array
        int[] copyArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            copyArr[i] = arr[i];
        }
        System.out.print("8. Copied array: ");
        for (int num : copyArr) {
            System.out.print(num + " ");
        }
        System.out.println();

        // 9. Swap first and last elements
        int temp = arr[0];
        arr[0] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;
        System.out.print("9. After swapping first & last: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        // 10. Count how many times a number appears
        System.out.print("10. Enter number to count: ");
        int target = sc.nextInt();
        int freq = 0;
        for (int num : arr) {
            if (num == target) freq++;
        }
        System.out.println("   Appears " + freq + " times.");

        // 11. Print index of a given number
        System.out.print("11. Enter number to find index: ");
        int indexSearch = sc.nextInt();
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == indexSearch) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            System.out.println("   Found at index: " + index);
        } else {
            System.out.println("   Number not found in array.");
        }

        sc.close();
    }
}

    

