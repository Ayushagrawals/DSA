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
//VARIATIONS
/*Since you are currently focusing on array-based questions,you can gradually move toward related concepts.Here’s an ideal next step roadmap for you:

1 ️⃣Standard Kadane’s Variations(Strengthen Core)
✅LeetCode#53-Maximum Subarray(Basic Kadane’s)
✅LeetCode#152-Maximum Product Subarray(Kadane’s with min/max tracking)
✅LeetCode#918-Maximum Sum Circular Subarray(Kadane’s with circular array handling)

Sliding Window Problems(Gradual Shift)Sliding Window is useful for problems involving contiguous subarrays with constraints.

✅LeetCode#209-Minimum Size Subarray Sum(Smallest subarray sum≥target)
✅LeetCode#424-Longest Repeating Character Replacement(Dynamic sliding window)
✅LeetCode#1004-Max Consecutive Ones III(Kadane+Sliding Window for binary array problems)

Prefix Sum+Binary Search(Needed for 2D Problems)Before jumping into 2D Kadane’s,it’s good to get comfortable with prefix sum concepts.

✅LeetCode#560-Subarray Sum Equals K(Find subarrays with sum exactly k using prefix sum+HashMap)
✅LeetCode#974-Subarray Sums Divisible by K(Variation using modulo prefix sum)

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
