public class square {
    public static void main(String[] args) {
        int[] squares = new int[10];  // Array of size 10

        // Adding squares of numbers (1 to 10)
        for (int i = 0; i < 10; i++) {
            squares[i] = (i + 1) * (i + 1);
        }

        // Printing the array
        System.out.println("Squares of numbers from 1 to 10:");
        for (int i = 0; i < 10; i++) {
            System.out.print(squares[i] + " ");
        }
    }
}

    

