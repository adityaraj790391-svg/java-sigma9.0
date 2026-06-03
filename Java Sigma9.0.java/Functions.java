public class Functions {

            // Function without parameters and without return type

    // public static void printHelloWorld() {
    //     System.out.println("Hello World");
    //     System.out.println("Hello World");
    // }


    // public static void calculateSum(int a, int b) {         // formal parameters
       
    //     int sum = a+b;
    //     System.out.println("Sum is: " + sum);

    // }

    // public static void main(String args[]) { 

    //     Scanner sc = new Scanner(System.in);
    //     int a = sc.nextInt();
    //     int b = sc.nextInt();

    //     printHelloWorld();
    //     calculateSum(a,b);                                   // actual parameters
    // }



                   // Call by Value

    // public static void swap(int a, int b) {
    //     // swapping
    //     int temp = a;
    //     a = b;
    //     b = temp;

    //     System.out.println("a =" + a);
    //     System.out.println("b =" + b);
    // }

    // public static void main(String args[]) { 
    //     int a = 5;
    //     int b = 10;
    //     swap(a, b);                                              // actual parameters
    //     }


           // Find product of A and B

    // public static int multiply(int a, int b) {
    //     int product = a*b;
    //     return product;
    // }

    // public static void main (String args[]) {
    //     int a = 5;
    //     int b = 10;
    //     int prod = multiply(a, b);                                 // actual parameters
    //     System.out.println("Product is: " + prod);
    //     prod = multiply(7,2);
    //     System.out.println("Product is: " + prod);

    // }


        
           // Factorial of a number

    public static int factorial(int n) {
        int f = 1;
        for (int i = 1; i<=n; i++) {
            f= f*i;
        }
        return f;                       // factorial of n
    }

    // public static void main (String args[]) {
    //    System.out.println(factorial(7));
    //    System.out.println(binCoeff(5,2));
    // }


               // Binomial coefficient

    public static int binCoeff(int n, int r) {
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);
        int binCoeff = fact_n / (fact_r * fact_nmr);
        return binCoeff;

    }

          

                // func to calculate sum of two numbers
                // function overloading using parameters

    public static int sum (int a, int b) {
        return a + b;
    }


                // func to calculate sum of three numbers

    public static int sum (int a, int b, int c) {
        return a + b + c;
    }

    // public static void main (String args[]) {
    //     System.out.println(sum(5,10));
    //     System.out.println(sum(5,10,15));
    // }

               // function overloading using different data types


    public static float sum (float a, float b) {
        return a + b;
    }

    // public static void main (String args[]) {

    //     System.out.println(sum(3,5));
    //     System.out.println(sum(3.2f, 5.7f));

    // }


          // Check if a number is prime or not

    public static boolean isPrime(int n) {

        for (int i =2; i<=n-1; i++) {
            if (n%i == 0) {
            return false;
        }  
    }
    return true;
}

//     public static void main (String args[]) {
    
//     System.out.println(isPrime(4));
// }


            // Optimized code for printing prime numbers

    public static boolean isPrimeOpt(int n) {

        for (int i =2; i<=Math.sqrt(n); i++) {
            if (n%i == 0) {
            return false;
        }  
    }
    return true;
}

//     public static void main (String args[]) {
    
//     System.out.println(isPrimeOpt(29));
// }



             // Print all prime numbers in a given range

    public static void printPrimesInRange(int n) {
        for (int i =2; i<=n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }

    System.out.println();
    }

    // public static void main(String[] args) {
    //     printPrimesInRange(1000);
    // }


                // Binary to Decimal conversion

    public static int binToDec(int binNum) {
        int myNum = binNum;
        int pow = 0;
        int decNum = 0;

        while (binNum > 0) {
            int lastDigit = binNum % 10;
            decNum = decNum + (lastDigit * (int)Math.pow(2, pow));
            pow++;
            binNum = binNum / 10;
        }

        System.out.println("decimal of " + myNum + " is " + decNum);
        return decNum;
    }


    // public static void main(String[] args) {
    //     binToDec(1011);

    // }



             // Decimal to Binary conversion

    public static void decToBin(int n) {

        int myNum = n;
        int pow = 0;
        int binNum = 0;
        while (n > 0) {
            int rem = n % 2;
            binNum = binNum + (rem * (int)Math.pow(10, pow));
            pow++;
            n = n / 2;
        }
        System.out.println("Binary of " + myNum + " is " + binNum);

}


public static void main(String[] args) {
    decToBin(13);
}






}