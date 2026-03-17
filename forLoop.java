
import java.util.Scanner;

public class forLoop{
    public static void main(String args[]){
        // for(int i =1; i<=10; i++){
        //     System.out.println("hello world");
        // }


//      PRINT SQUARE PATTERN
        // for( int line = 1; line<=4; line++){
        //     System.out.println("****");
        // }

        // print reverse of a number

        // int n = 10899;
        
        // while(n>0){
        //     int lastdigit = n%10;
        //     System.out.print(lastdigit + " ");
        //     n = n/10;
        // }
        // System.out.println("");


        // reverse the given number

        // int n =10899;
        // int rev = 0;
        // while(n>0){
        //     int lastdigit = n%10;
        //     rev = (rev*10) + lastdigit;
        //     n = n/10;
        // }
        // System.out.println(rev);


        // enter number until get a multiple of 10

        Scanner sc = new Scanner(System.in);
        // do { 
        //     System.out.println("enter a number");
        //     int n  = sc.nextInt();
        //     if(n%10 == 0){
        //         break;
        //     }
        //     System.out.println(n);

        // } while (true);

        // CHECK IF A NUMBER IS PRIME OR NOR 
        System.out.println("Enter a number to check it is prime or not");
             int n = sc.nextInt();
             
        if(n ==2){
            
            System.out.println("n is prime");
        }else{
            boolean isprime = true;
            for(int i =2; i<= Math.sqrt(n); i++){
                if(n% i ==0){
                    isprime = false;
                }
            }
            if(isprime == true){
                System.out.println("n is prime");
            }else{
                System.out.println("n is not prime");
            }
        }

    }
}