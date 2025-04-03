# 🚀 Subarray Problem Classification

A quick reference for solving subarray problems — when to use **Sliding Window** and when other techniques are more suitable.

## ✅ Sliding Window (Best Fit)

These problems work well with fixed-size or variable-size sliding windows, often due to **positive elements** or **monotonic properties**:

| Problem | Approach | Leetcode |
|--------|----------|----------|
| Minimum Size Subarray Sum | Variable-size window | [LC 209](https://leetcode.com/problems/minimum-size-subarray-sum/) |
| Maximum Sum Subarray of Size K | Fixed-size window | - |
| Count Subarrays with Product < K | Variable-size window | [LC 713](https://leetcode.com/problems/subarray-product-less-than-k/) |
| Longest Substring Without Repeating Characters | Variable-size window + HashMap | [LC 3](https://leetcode.com/problems/longest-substring-without-repeating-characters/) |
| Sliding Window Maximum | Deque (Monotonic Queue) | [LC 239](https://leetcode.com/problems/sliding-window-maximum/) |
| Longest Substring with At Most K Distinct Characters | Variable-size window + HashMap | [LC 340](https://leetcode.com/problems/longest-substring-with-at-most-k-distinct-characters/) |

---

## ❌ Not Sliding Window (Use Other Techniques)

These problems either involve **negative numbers**, **non-contiguous elements**, or require **prefix sums**, **maps**, or **binary search**:

| Problem | Better Approach | Leetcode |
|--------|------------------|----------|
| Maximum Subarray (Any sign) | Kadane’s Algorithm | [LC 53](https://leetcode.com/problems/maximum-subarray/) |
| Subarray Sum Equals K | Prefix Sum + HashMap | [LC 560](https://leetcode.com/problems/subarray-sum-equals-k/) |
| Number of Subarrays with Bounded Maximum | Monotonic Stack or Math | [LC 795](https://leetcode.com/problems/number-of-subarrays-with-bounded-maximum/) |
| Count of Range Sum | Prefix Sum + Merge Sort (Hard) | [LC 327](https://leetcode.com/problems/count-of-range-sum/) |
| Maximum Size Subarray Sum Equals K | Prefix Sum + HashMap | [LC 325](https://leetcode.com/problems/maximum-size-subarray-sum-equals-k/) |
| Shortest Subarray with Sum at Least K (with negatives) | Deque + Prefix Sum (Hard) | [LC 862](https://leetcode.com/problems/shortest-subarray-with-sum-at-least-k/) |

---

## 💡 Tip to Recognize Sliding Window Problems

- ✔️ Problem asks about **contiguous subarrays**
- ✔️ Elements are **positive only**, or condition is **monotonic**
- ✔️ You can move left/right pointers based on a condition
- ❌ You need to count subarrays with complex constraints (sum = k, includes negatives, etc.)

---

Let me know if you want this converted into a table for a website, Notion doc, or integrated into a DSA GitHub repo!
