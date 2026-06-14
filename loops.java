import java.util.Scanner;

public class loops {
    public static void main(String args[]) {


          // While Loop

    // int counter = 0;
    // while(counter<10) {
    //     System.out.println("Hello World");
    //     counter ++;
    // }

    // System.out.println("Printed loop 10 X");



          // Print nos. from 1 to 10

    // int counter = 1;
    // while(counter<=1000) {
    //     System.out.print(counter+" ");
    //     counter++;
    // }



          // Print nos. from 1 to n from user

    // Scanner sc = new Scanner (System.in);
    // int range = sc.nextInt();
    // int counter = 1;
    // while(counter<=range) {
    //     System.out.print(counter+ " ");
    //     counter++;
    // }
    System.out.println();



          // Sum of first 10 natural numbers

    // Scanner sc = new Scanner (System.in);
    // int n =sc.nextInt();
    // int sum = 0;
    // int i =1;
    // while(i<=n) {
    //     sum = sum + i;
    //     i++;
    // }
    // System.out.print("Sum is " + sum);


          
         // For loop INCLUDES initialization, condition, updation in single line

    for (int i =1; i<=10; i++) {
        System.out.println("Hello World ");
    }


                // PRINT SQUARE PATTERN

      for (int line =1; line<=4; line++) {
            System.out.println("****");
      }

      int line = 1;
        while(line<=4) {
            System.out.println("****");
            line++;
      }


                // Print reverse of a number

      int n = 54321;
        while (n>0) {
            int lastDigit = n%10;
            System.out.print(lastDigit + " ");
            n = n/10;
      }
      System.out.println("Reverse printed");


               // Reverse the given no.

      //   int n = 12345;

      int reverse = 0;
      while (n>0) {
            int lastDigit = n%10;
            reverse = (reverse*10) + lastDigit;
            n = n/10; 
      }
      System.out.println(reverse);


              // DO WHILE LOOP

        int counter = 1;
        do {
            System.out.println("Hello World");
            counter++;
        } while (counter<=10);
    
    
    
    
           // Break statement

    for (int i =1; i<=10; i++) {
        if(i==5) {
            break;
        }
        System.out.println(i);
    }



          // Keep entering numbers until users enters multiple of 10

    // Scanner sc = new Scanner (System.in);
    // do {
    //     System.out.print("Enter a number :");
    //     int n = sc.nextInt();
    //     if(n%10==0) {
    //         break;
    //     }
    //     System.out.println(n);
    // }while(true);


            // Continue Statement

    for (int i =1; i<=10; i++) {
        if(i==5) {
            continue;
        }
        System.out.println(i);
    }


          // Display all nos. except multiples of 10

        // Scanner sc = new Scanner (System.in);
        // do {
        //     System.out.print("Enter a number :");
        //     int n = sc.nextInt();
        //     if(n%10==0) {
        //         continue;
        //     }
        //     System.out.println(n);
        // }while(true);



            //. Check if a no. is prime or not

      Scanner sc = new Scanner (System.in);
      // int n = sc.nextInt();

      if(n==2) {
            System.out.println("n is prime");
      }
      else {
            boolean isPrime = true;
            for (int i = 2; i<=Math.sqrt(n); i++) {
                  if(n%i==0) {
                        isPrime = false;   
                  }
                  if (isPrime==true) {
                        System.out.println("n is prime");
                  }
                  else {
                        System.out.println("n is not prime");
                  }
            }
      }


      
    
      
     





       }
}

    
 

