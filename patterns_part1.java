public class patterns_part1 {
    
    public static void main(String args[]) {


                 // Print star  // Patterns  // Nested loops
 
        for(int i =1; i<=5; i++) {
            for(int star =1; star<=i; star++) {
                System.out.print("*");
            }
            System.out.println();
        }


              // Print inverted star pattern

        // int n = 5;
        // for (int line = 1; line <= n; line++) {
        //     for (int star = 1; star<=n-line+1; star++) {
        //         System.out.print("*");
        //     }
        // System.out.println();
        // }


              // Print half pyramid pattern 

        // int n =5;
        // for (int line =1; line<=n; line++) {
        //     for (int number =1; number<=line; number++) {
        //         System.out.print(number);
        //     }
        //     System.out.println();
        // }


        

    

        
       


              // Print characater pattern

        int n  = 5;
        char ch = 'A';
        // outer loop
        for(int line = 1; line<=n; line++) {
            for (int chars=1; chars<=line; chars++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
   
















    }
}
