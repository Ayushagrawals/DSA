// KADANE'S ALGORITHM: Finds the maximum subarray sum in a given array.  
// Initialization: We set sum and curr_sum to nums[0] because we start from the first element.  
// - Using 0 or Integer.MIN_VALUE won't work, as we need a valid starting value from the array.  

// Thought Process & Issues Faced (Documenting for Future Reference):  
// 1️⃣ First mistake: I was checking for negative cases like `curr_sum + nums[i] < 0`.  
//    - Example: (1, -2) → sum becomes -1, so I thought it would decrease unnecessarily.  
//    - But Kadane’s handles this automatically with `Math.max(curr_sum + nums[i], nums[i])`.  
//    - Here, `Math.max(-1, -2)` keeps curr_sum as -1, and sum remains 1, which is correct.  

// 2️⃣ Handling Edge Cases:  
//    - If the array is [1, -2, 4], Kadane's ensures that (-1 + 4, 4) → 4 is chosen, updating sum.  
//    - If the array is [1, -2, -1], Kadane’s does `Math.max(-1 + -1, -1)`, keeping the correct max.  
//    - Works the same way for positive values, since we always check `Math.max(nums[i], curr_sum + nums[i])`.  

// Summary: No need to check negatives manually. Kadane’s already ensures we either continue or restart.  

class Solution {
    public int maxSubArray(int[] nums) {
        int curr_sum = nums[0];
        int sum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            curr_sum = Math.max(nums[i], curr_sum + nums[i]);

            if (sum < curr_sum) {
                sum = curr_sum;
            }
        }

        return sum;
    }
}
