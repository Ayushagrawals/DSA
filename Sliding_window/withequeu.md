## Sliding Window with Queue / Deque – Summary

1. Sliding Window Maximum

   - Technique : Monotonic Deque
   - Window Type : Fixed
   - Leetcode : LC 239

2. Shortest Subarray Sum ≥ K (Negatives allowed)

   - Technique : Deque + Prefix Sum
   - Window Type : Variable
   - Leetcode : LC 862

3. First Negative in Every Window of Size K

   - Technique : Queue (track indices of negatives)
   - Window Type : Fixed
   - Link : GFG – First Negative Integer in Window

4. Maximum of All Subarrays of Size K

   - Technique : Monotonic Deque
   - Window Type : Fixed
   - Note : Variant of LC 239

5. Sum of Subarray Minimums
   - Technique : Monotonic Stack
   - Window Type : Variable (not fixed size)
   - Leetcode : LC 907

Notes:

- Use Monotonic Deque when you want to maintain increasing or decreasing order inside the window.
- Use Prefix Sum + Deque for problems involving negative numbers and variable-length subarrays.
- Traditional sliding window fails with negative values in sum/product logic.

Additional Optional Patterns (Nice to Know):
Minimum Window Substring – [LC 76]

Uses HashMap + Sliding Window

Good for char frequency tracking

Longest Substring with At Most K Distinct Characters – [LC 340]

Sliding window + HashMap

Good for string window problems

Max Consecutive Ones III – [LC 1004]

Sliding window for flipping 0s to 1s

Fruit Into Baskets – [LC 904]

Like LC 340 with numbers
