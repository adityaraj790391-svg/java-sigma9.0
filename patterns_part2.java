public class patterns_part2 {

public static void hollow_rectangle (int totalRows,int totalColumns) {
    /// outer loop
for (int i = 1; i<=totalRows; i++) {
            /// inner columns
    for (int j =1; j<=totalColumns; j++) {
            /// cell (i,j)
        if(i==1 || i==totalRows || j==1 || j==totalColumns) {
            /// bounfdary cells
            System.out.print("*");
        } else {
            System.out.print(" ");
        }
}
            System.out.println();
        }
}

// public static void main(String args[]) { 
//     hollow_rectangle(4,5);
//          }

// }




             // Inverted and Rotated half pyramid pattern

public static void inverted_rotated_half_pyramid(int n) {

      // outer

    for(int i =1; i<=n; i++) {

        /// spaces
        for(int j =1; j<=i-1; j++) {
            System.out.print(" ");
        }

        /// stats
        for (int j =1; j<=n-i+1; j++ ) {
            System.out.print("*");
        }

      System.out.println();

    }
}

//    public static void main(String args[]) {
//     inverted_rotated_half_pyramid(4);
// }
// }




               /// Inverted half pyramid with numbers


public static void inverted_half_pyramid_with_numbers (int n) {

    for (int i =1; i<=n; i++) {

        /// inner numbers
        for(int j =1; j<=n-i+1; j++) {
            System.out.print(j);
        }
        System.out.println();
    }

}

//      public static void main(String args[]) {
//     inverted_half_pyramid_with_numbers(10);
// }
// }




                 /// Floyds Triangle
                 

public static void floyds_triangle(int n) {
     
     /// outer
    int counter =1;
    for(int i =1; i<=n; i++) {
         /// inner- how many timees counter will be printed
        for (int j=1; j<=i; j++) {
            System.out.print(counter+ " ");
            counter++;

        }
        System.out.println();
    }
}

// public static void main(String args[]) {
//     floyds_triangle(15);
// }
// }


             // 0-1 triangle pattern


public static void zero_one_triangle(int n) {
    for (int i= 1; i<=n; i++ ) {
        for (int j = 1; j<=i; j++) {
            if ( (i+j) % 2 ==0 ) {
                System.out.print("1");
            }
                System.out.print("0");
        }
        System.out.println();
    }
}

// public static void main(String[] args) {
//     zero_one_triangle(5);
// }
// }


         /// Butterfly pattern

public static void butterfly(int n) {
       /// 1st half
    for (int i =1; i<=n; i++) {
        /// stars-i
        for(int j =1; j<=i; j++) {
            System.out.print("*");
        }

        /// spaces-2nd
        for (int j =1; j<=2*(n-i); j++) {
            System.out.print(" ");
        }

        /// stars-i
        for (int j=1; j<=i; j++) {
            System.out.print("*");
        }
        System.out.println();
    }

    /// 2nd half
    for (int i =n; i>=1; i--) {
        /// stars-i
        for(int j =1; j<=i; j++) {
            System.out.print("*");
        }

        /// spaces-2nd
        for (int j =1; j<=2*(n-i); j++) {
            System.out.print(" ");
        }

        /// stars-i
        for (int j=1; j<=i; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
}

// public static void main(String[] args) {
//     butterfly(5);
// }
// }



            /// solid rhombus


public static void solid_rhombus (int n) {
    for(int i =1; i<=n; i++) {
        // spaces
        for(int j=1; j<=(n-i); j++) {
            System.out.print(" ");
        }

        // stars
        for(int j=1; j<=n; j++) {
            System.out.print("*");
        }

        System.out.println();
    }
}

// public static void main(String[] args) {
//     solid_rhombus(5);
// }
// }



               /// hollow rhombus


public static void hollow_rhombus(int n) {
    for (int i =1; i<=n; i++) {
        // spaces
        for (int j =1; j<=(n-i); j++) {
            System.out.print(" ");
        }

        // hollow rectangle-stars
        for(int j=1; j<=n; j++) {
            if (i==1 || i ==n ||  j==1 || j==n) {
                System.out.print("*");
            }
            else {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}

public static void main(String[] args) {
    hollow_rhombus(5);
    hollow_rectangle(4, 5);
    inverted_rotated_half_pyramid(4);
    inverted_half_pyramid_with_numbers(5);
}
}



          // Diamond pattern





 




