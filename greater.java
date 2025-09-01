import java.util.Scanner;

public class greater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter first nuber:");
        int num1 = sc.nextInt();
        System.out.print("enter second nuber:");
        int num2 = sc.nextInt();
        if(num1>num2){
            System.out.println("Greater number is :"+num1);
        }
        else if(num2>num1){
            System.out.println("Greater number is:"+num2);
        } 
        else{
            System.out.println("both numbers are equal");
        }
        sc.close();   
    }
    
}
