
import java.nio.charset.UnmappableCharacterException;

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
    //     maxsubarrayprefixsum(numbers);
        
    // }


           //// Max Sub Array - Two -   Prefix Array - using formula for max array sum - prefix[end] - prefix[start-1] - using formula for prefix sum - prefix[i-1] - arr[i]
           
        public static void maxsubarrayprefixsum(int numbers[]) {
            int currSum = 0;
            imt maxSum = Integer.MIN_VALUE;
            int prefix[] = new int[numbers.length];
            prefix[0] = numbers[0];

            // calculate prefix array

            for (int i = 1; i < prefix.length ; i++){
                prefix[i] = prefix[i-1] + numbers[i];
            }

             for (int i = 0; i < numbers.length; i++){
                int start = i;
                for (int j = i; j < numbers.length ; j++){
                    int end = j;
                    currSum = start == 0? prefix[end ] : prefix[start - 1];
                    
                    if (maxSum < currSum) {
                        maxSum = currSum;
                    }
                }
             }

             System.out.println("max sum = " + maxSum);
        }




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


    // public static void main(String[] args) {
    //     int numbers[] = {-2,-3,4,5,6,7,8,-6};
    //     kadane(numbers);
    // }

        public static int buyandSellStock(int prices[]) {
            int buyPrice = Integer.MAX_VALUE;
            int maxProfit = 0;

            for (int i = 0; i < prices.length; i++) {
                if (buyPrice < prices[i]) {
                    int profit = prices[i] - buyPrice;
                    maxProfit = Math.max(maxProfit, profit);
                } else {
                    buyPrice = prices[i];
                }
            }
            return maxProfit;
        }

        public static void main(String[] args) {
            int prices[] = {7,1,5,3,6,4};
            System.out.println(buyandSellStock(prices));
        }
    



                  //// Trapping Rainwater
            
    public static void trappingRainwater(int height[]) {
 
    
}
}