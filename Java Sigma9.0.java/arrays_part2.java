public class arrays_part2 {



                ///// Max sub array - ONE
    

    
    public static void printSubarraySum (int numbers[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i<numbers.length; i++) {
            int start= i;
            for (int j= i; j<numbers.length; j++) {
                int end = j;
                currSum= 0;
                for (int k = start; k<=end; k++) {
                     // sub array sum
                    currSum = currSum + numbers[k];
                }
                System.out.println( currSum );
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
            System.out.println("max sum = " + maxSum);
        }
    }


    // public static void main(String[] args) {
    //     int numbers[] = {1,2,3,4,5,6,7,8,9,0};
    //     printSubarraySum(numbers);
        
    // }




                 //// Max Sub Array - THREE - KADANE ALGORITHM
    
                 
    public static void kadane(int numbers[]) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for (int i = 0; i < numbers.length; i++) {
            currentSum = currentSum + numbers[i];
            if (currentSum < 0 ) {
                currentSum = 0;
            }
            maxSum = Math.max(currentSum, maxSum);
        }
        System.out.println("Our max sum is " + maxSum);
    }


    public static void main(String[] args) {
        int numbers[] = {-2,-3,4,5,6,7,8,-6};
        kadane(numbers);
    }
    



                  //// Trapping Rainwater
            
    public static void trappingRainwater(int height[]) {
 
    
}
}