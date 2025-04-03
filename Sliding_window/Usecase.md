# 🔍 Sliding Window Technique — When to Use & When Not

Sliding Window is a powerful technique for subarray and substring problems — but it doesn't work **everywhere**.

---

## ✅ When Sliding Window **Works Well**

Use sliding window when:

- You're working with **contiguous subarrays or substrings**
- The array contains **only positive numbers**
- You can **move left/right pointers** to grow or shrink the window based on a condition
- The condition you're checking is **monotonic** (e.g., increasing/decreasing)

---

## ❌ When Sliding Window **Fails**

Avoid sliding window when:

- The array contains **negative numbers**, and you're checking for **sum** or **product** conditions
- You need to **count all subarrays**, not just find the max/min/length
- The problem is about **non-contiguous subsequences**
- The subarray condition requires **complex global tracking** (not local window decisions)
- You're doing **range-based counting**, which requires **prefix sums**, **binary search**, or **segment trees**

---

## 📋 Subarray Problem Classification

| Problem                                                       | Can Use Sliding Window? | Technique                 | Leetcode                                                                                      |
| ------------------------------------------------------------- | ----------------------- | ------------------------- | --------------------------------------------------------------------------------------------- |
| **Minimum Size Subarray Sum**                                 | ✅ Yes                  | Variable Window           | [LC 209](https://leetcode.com/problems/minimum-size-subarray-sum/)                            |
| **Maximum Sum Subarray of Size K**                            | ✅ Yes                  | Fixed Window              | –                                                                                             |
| **Count Subarrays with Product < K**                          | ✅ Yes                  | Variable Window           | [LC 713](https://leetcode.com/problems/subarray-product-less-than-k/)                         |
| **Longest Substring Without Repeating Characters**            | ✅ Yes                  | Variable Window + HashMap | [LC 3](https://leetcode.com/problems/longest-substring-without-repeating-characters/)         |
| **Sliding Window Maximum**                                    | ✅ Yes                  | Deque (Monotonic Queue)   | [LC 239](https://leetcode.com/problems/sliding-window-maximum/)                               |
| **Longest Substring with At Most K Distinct Characters**      | ✅ Yes                  | Variable Window + HashMap | [LC 340](https://leetcode.com/problems/longest-substring-with-at-most-k-distinct-characters/) |
| **Maximum Subarray (Kadane’s)**                               | ❌ No                   | Kadane’s Algorithm        | [LC 53](https://leetcode.com/problems/maximum-subarray/)                                      |
| **Subarray Sum Equals K**                                     | ❌ No                   | Prefix Sum + HashMap      | [LC 560](https://leetcode.com/problems/subarray-sum-equals-k/)                                |
| **Count of Range Sum**                                        | ❌ No                   | Prefix Sum + Merge Sort   | [LC 327](https://leetcode.com/problems/count-of-range-sum/)                                   |
| **Shortest Subarray with Sum at Least K (negatives allowed)** | ❌ No                   | Prefix Sum + Deque        | [LC 862](https://leetcode.com/problems/shortest-subarray-with-sum-at-least-k/)                |

---

## 💡 Sliding Window Checklist

✅ Is it about **contiguous subarrays or substrings**?  
✅ Are all elements **positive or monotonic**?  
✅ Can you adjust the window using **two pointers**?  
❌ Does it involve **negative values** in sum/product conditions?  
❌ Are you asked to **count** or handle **non-contiguous elements**?

---

Let me know if you want this split into a visual Notion doc or categorized in your DSA GitHub repo!
