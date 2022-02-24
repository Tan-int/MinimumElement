import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myArray = readIntegers(5);
        System.out.println("Minimum number in array: " + findMin(myArray));

    }

    //Returns the minimum element in the array
    public static int findMin(int[] array) {
        int current = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < current) {
                current = array[i];
            }
        }
        return current;
    }

    //Returns an array with the desired elements and length
    public static int[] readIntegers(int count) {
        int[] myArray = new int[count];
        System.out.println("Please enter " + count + " integers");

        //To validate that the input is an integer
        while (true) {
            for (int i = 0; i < count; i++) {
                if (scanner.hasNextInt()) {
                    myArray[i] = scanner.nextInt();
                } else {
                    System.out.println("Please enter " + (count - i) + " more integer(s)");
                    i--;
                }
                scanner.nextLine();
            }
            break;
        }

        return myArray;
    }
}
