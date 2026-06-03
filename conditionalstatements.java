import java.util.Scanner;

public class conditionalstatements {
    public static void main(String args[]) {

        // Scanner sc = new Scanner(System.in);
        // int age = sc.nextInt();                                // if else statement
        // if (age >= 18) {
        //     System.out.println("Adult");
        // } else {
        //     System.out.println("Not Adult");
        // }


        // print largest of 2 nos.

        // int A = 12;
        // int B = 12;
        // if (A >B) {
        //     System.out.println("A is largest");
        // }
        // else {
        //     System.out.println("B is largest");
        // }


        // Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();
        // if (num % 2 ==0) {
        //     System.out.println ("Even");
        // }
        // else {
        //     System.out.println("Odd");
        // }

        // int age = 23;
        // if (age >= 18) {
        //     System.out.println("Adult");
        // }
        // else if (age >= 13) {
        //     System.out.println("Teenager");
        // }
        // else {
        //     System.out.println("Child");
        // }



        // Income tax calculator

        // Scanner sc = new Scanner (System.in);
        // int income = sc.nextInt();
        // int tax = 0;
        // if (income < 500000) {
        //     tax = 0;
        // }
        // else if (income >= 500000 && income < 1000000) {
        //     tax = (int)(income * 0.2);
        // }
        // else {
        //     tax = (int)(income * 0.3);
        // }
        // System.out.println("Your tax is " + tax);




        // Find largest of 3 nos.

        // int A = 34, B = 23, C = 29;

        // if (A>B && A>C ) {
        //     System.out.print("A is largest");
        // }
        // else if (B>A && B>C) {
        //     System.out.println("B is largest");
        // }
        // else {
        //     System.out.println("C is largest");
        // }


        // Switch Statement

        // int num = 2;
        // switch(num) {
        //     case 1 : System.out.println("Samosa");
        //                 break;
        //     case 2 : System.out.println("chicken roll");
        //                 break;
        //     case 3 : System.out.println("momos");
        //                 break; 
        //     default : System.out.println("Wake up brat");
        // }


        String ch = "a";
        switch(ch) {
            case "a" : System.out.println("Samosa");
                        break;
            case "b" : System.out.println("chicken roll");
                        break;
            case "c" : System.out.println("momos");
                        break; 
            default : System.out.println("Wake up brat");
        }


    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a :");
    int a = sc.nextInt();
    System.out.println("Enter b:");
    int b = sc.nextInt();
    System.out.println("Enter operator:");
    char operator = sc.next().charAt(0);

    switch (operator) {
        case '+' : System.out.println(a+b);
                    break;
        case '-': System.out.println(a-b);
                    break;
        case '*': System.out.println(a*b);
                    break;
        case '/': System.out.println(a/b);
                    break;
        case '%': System.out.println(a%b);
                    break;
        default: System.out.println("Basic calculator");

    }

    









    }
}



