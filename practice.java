
import java.util.Scanner;

// Write a Java program that declares variables for:
// Height (float)
// IsStudent (boolean)

public class practice{
    public static void main(String[] args) {
    //    String name = "rajveer";
    //    int age = 20;
    //    float height = 5.3f;
    //    boolean IsStudent = true;

    //    System.out.println("name:" + name);
    //           System.out.println("age:" + age);
    //    System.out.println("height:" + height);
    //    System.out.println("isstudent:" + IsStudent);
     



        Scanner sc = new Scanner(System.in);
    //    int a = sc.nextInt();
    //     int b = sc.nextInt();

    //     System.out.println("Sum = " + (a + b));
    //     System.out.println("Difference = " + (a - b));
    //     System.out.println("Product = " + (a * b));
    //     System.out.println("Division = " + (a / b));
                // int n = sc.nextInt();
            // int sum = 0;
            // int i =1;
            // while(i<=n){
            //     sum = sum+i;
            //     i++;

            // }
            // System.out.println("sum is " +sum);

            int n = sc.nextInt();
        int i = 1;

        while(i <= 10){
            System.out.println( (n*i));
            i++;

        }
    }
}