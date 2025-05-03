//BAsed on merges sort

Great — you're asking the right question! If you understand this problem well, you unlock a **powerful pattern**: using **prefix sums + merge sort** to count pairs or ranges in `O(n log n)`.

Here are some **similar/related problems** that also use this pattern (or a variant of it):

---

## ✅ **1. Count of Smaller Numbers After Self**

📌 [Leetcode 315](https://leetcode.com/problems/count-of-smaller-numbers-after-self/)
🔧 **Concepts**: Merge sort + counting during merge

> For each element, count how many smaller elements are **to the right** of it.

🧠 Trick: As you merge sort the array of indices, track how many elements jump ahead of a given number.

---

## ✅ **2. Reverse Pairs**

📌 [Leetcode 493](https://leetcode.com/problems/reverse-pairs/)
🔧 **Concepts**: Merge sort + two pointers

> Count how many pairs `(i, j)` exist such that:
>
> $$
> $$

i < j \quad \text{and} \quad nums\[i] > 2 \* nums\[j]
]

🧠 This is very similar to the **range sum** problem.
You fix an `i`, and try to count valid `j` values — exactly like using two pointers in merge sort.

---

## ✅ **3. Number of Range Sums (This One)**

📌 [Leetcode 327](https://leetcode.com/problems/count-of-range-sum/)
🔧 **You just did this!**

> Counts how many subarray sums fall within a given range `[lower, upper]`

---

## ✅ **4. Count Inversions in an Array** (Classic problem)

📌 \[GFG / Custom Implementations]
🔧 **Concepts**: Merge sort

> Count the number of **inversions**, i.e., how many pairs `(i, j)` exist such that:
>
> $$
> $$

i < j \quad \text{and} \quad arr\[i] > arr\[j]
]

🧠 It's like counting how unsorted the array is. Again, we use merge sort and count during merge.

---

## Summary of Merge Sort-Based Counting Problems:

| Problem                           | Condition                                | Key Technique            |
| --------------------------------- | ---------------------------------------- | ------------------------ |
| Range Sum Count (LC 327)          | `prefix[j] - prefix[i] ∈ [lower, upper]` | Merge sort + prefix sum  |
| Reverse Pairs (LC 493)            | `nums[i] > 2 * nums[j]`                  | Merge sort + two pointer |
| Count Smaller After Self (LC 315) | Count elements to right that are smaller | Merge sort on indices    |
| Inversion Count                   | `arr[i] > arr[j]` for `i < j`            | Merge sort               |

---

Would you like to solve one of these together (maybe Reverse Pairs or Count of Smaller After Self)?
