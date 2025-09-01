
import java.util.Scanner;

class array{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n[]=new int[5];
        System.out.println("enter five numbers");
        for (int i = 0; i < 4; i++) {
            n[i]=sc.nextInt();
            
        }
        System.out.println("our array has following numbers");
        for (int i = 0; i < 4; i++) {
            System.out.println(n[i]);

            
        }
    }
}