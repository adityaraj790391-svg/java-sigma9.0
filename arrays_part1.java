public class arrays_part1 {


    public static void update (int marks[]) {
        for(int i = 0; i<marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
    }

    
    // public static void main(String[] args) {
        

                   /// Arrays creation
        // int marks[] = new int [50];
        // System.out.println(marks);

        // int numbers[] = {1,2,3};
        // System.out.println(numbers);

        // String fruits[] = {"apple", "banana", "mango"};
        // System.out.println(fruits);




                   /// Array - input, output, update
        
        // int marks[] = new int [100];

        // Scanner sc = new Scanner (System.in);

        // marks[0] = sc.nextInt();
        // marks[1] = sc.nextInt();
        // marks[2] = sc.nextInt();

        // System.out.println("phy = " + marks[1]);
        // System.out.println("che = " + marks[1]);
        // System.out.println("phy = " + marks[2]);

        // System.out.println("length of array = " + marks.length);

        // int percentage = (marks[0] + marks[1] + marks[2]) / 3;
        // System.out.println("percentage = " + percentage);




                   //// Array as function arguments
    
//         int marks [] = {97,98,99};
//         update (marks);

//             // print our marks

//         for (int i = 0; i<marks.length; i++) {
//             System.out.print(marks[i] + " ");
//         }
//         System.out.println();
//     }
// }






           /// Linear search
           

    //     public static int linearSearch(int numbers[], int key) {
    //     for (int i =0; i<numbers.length; i++){
    //         if (numbers[i] == key) {
    //             return i;
    //         }
    //     }
    //     return -1;
    // }


    // public static void main(String[] args) {
    //     int numbers[] = {2,4,6,8,10,12,14};
    //     int key = 10;
    //     int index = linearSearch(numbers, key);
    //     if(index == -1) {
    //         System.out.println("Not found");
    //     }else{
    //         System.out.println("key is at index " +  index);
    //     }
    // }





              /// print largest no in array

    public static int getLargest(int numberss[]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i<numberss.length; i++) {
            if(largest < numberss[i]) {
                largest = numberss[i];
            }
            if(smallest>numberss[i]) {
                smallest = numberss[i];
            }
        }
        System.out.println("smallest value is " + smallest);
        return largest;
    }


    // public static void main(String[] args) {
    //     int numberss[] = {1,2,3,4,5};
    //     System.out.println("largest value is " + getLargest(numberss)) ;

    // }



                 //// Binary search code

    public static int binarySearch (int numbers[], int key) {
        int start = 0, end = numbers.length-1;
        while (start <=end) {
            int mid = (start+end) / 2;

            // comparisons
            if (numbers[mid] == key) {
                return mid;
            }
            if (numbers[mid] < key) {
                start = mid+1;
            }else {
                // left
                end = mid-1;
            }
        }
        return -1;
    }

    // public static void main(String[] args) {
    //     int numbers[] = {2,4,6,8,10,12,14,16};
    //     int key = 11;
    //     System.out.println("index for key is " + binarySearch(numbers, key));
        
    // }




                  // Reverse an array
                

    
    public static void reverse (int numbers[]) {

        int first = 0, last = numbers.length-1;

        while (first < last) {
            // swap
            int temp = numbers [last];
            numbers[last] = numbers[first];
            numbers[first] = temp;

            first++;
            last--;
        }
    }

    // public static void main(String[] args) {
    //     int numbers[] = {1,2,3,4,5,6,7};
    //     reverse (numbers);
    //       //print
    //     for (int i = 0; i<numbers.length; i++) {
    //         System.out.print(numbers[i] + " ");
    //     }
    //     System.out.println();
    // }




                  ////
    

    public static void printPairs(int numbers []) {
        for(int i =0; i<numbers.length; i++) {
            int curr = numbers[i];
            for(int j =i+1; j<numbers.length; j++) {
                System.out.print("(" + curr +"," + numbers [j] + ")");
            }
            System.out.println();
        }
    }


    // public static void main(String[] args) {
    //     int numbers[] = {2,4,6,8,10,12};
    //     printPairs(numbers);
    // }




                //// print subarrays - it means printing continuous arrays
    

    public static void printSubarrays (int numbers[]) {
        for (int i = 0; i<numbers.length; i++) {
            int start= i;
            for (int j= i; j<numbers.length; j++) {
                int end = j;
                for (int k = start; k<=end; k++) {
                    System.out.print(numbers[k]+ " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        int numbers[] = {1,2,3,4,5,6,7,7,8};
        printSubarrays(numbers);
    }




                  //// practice - print sum of continuous sub arrays and find max sum
    


    
}




      


       
      



