### **🔥 Prefix Sum Problems (Leetcode)**

Prefix sum is a powerful technique used for **range queries, subarray sums, and optimizations**. Here’s a **categorized list** of problems:

---

## **🔹 Basic Prefix Sum Problems**

✅ [**1480. Running Sum of 1d Array**](https://leetcode.com/problems/running-sum-of-1d-array/)  
→ Compute cumulative sum of array.  
📝 **Approach:** `prefix[i] = prefix[i-1] + arr[i]`

✅ [**303. Range Sum Query - Immutable**](https://leetcode.com/problems/range-sum-query-immutable/)  
→ Precompute prefix sum, answer **sum queries in O(1)**.  
📝 **Approach:**

- Precompute `prefix[i] = prefix[i-1] + arr[i]`
- Query `sumRange(L, R) = prefix[R] - prefix[L-1]`

✅ [**238. Product of Array Except Self**](https://leetcode.com/problems/product-of-array-except-self/)  
→ Uses **prefix & suffix products** instead of sum.  
📝 **Approach:** Store **prefix product** & **suffix product**, multiply for result.

✅ [**560. Subarray Sum Equals K**](https://leetcode.com/problems/subarray-sum-equals-k/)  
→ Count subarrays with sum **exactly k**.  
📝 **Approach:** Use **prefix sum + hashmap**.

✅ [**974. Subarray Sums Divisible by K**](https://leetcode.com/problems/subarray-sums-divisible-by-k/)  
→ Find count of subarrays whose sum is divisible by **k**.  
📝 **Approach:** **Prefix sum + modulo count map**.

✅ [**523. Continuous Subarray Sum**](https://leetcode.com/problems/continuous-subarray-sum/)  
→ Similar to above but for **at least length 2**.

---

## **🔹 2D Prefix Sum Problems**

✅ [**304. Range Sum Query 2D - Immutable**](https://leetcode.com/problems/range-sum-query-2d-immutable/)  
→ Precompute **2D prefix sum** for fast range queries.  
📝 **Approach:**

- `prefix[i][j] = grid[i][j] + prefix[i-1][j] + prefix[i][j-1] - prefix[i-1][j-1]`
- Answer in **O(1)** with `sumRegion(x1, y1, x2, y2)`

✅ [**1277. Count Square Submatrices with All Ones**](https://leetcode.com/problems/count-square-submatrices-with-all-ones/)  
→ Use **2D prefix sum** to count squares.

✅ [**221. Maximal Square**](https://leetcode.com/problems/maximal-square/)  
→ Uses **prefix sum + DP**.

✅ [**1504. Count Submatrices With All Ones**](https://leetcode.com/problems/count-submatrices-with-all-ones/)  
→ Another **2D prefix sum + histogram** problem.

---

## **🔹 Prefix Sum + Sieve Problems (Prime Number Range Queries)**

✅ **[Count Primes in a Range] (Custom)**  
→ Given **multiple queries** `[L, R]`, find **count of primes in range** `[L, R]` in **O(1)**.  
📝 **Approach:**

1. Compute **Sieve of Eratosthenes** (isPrime array).
2. Build **prefix sum array** where `prefix[i] = prefix[i-1] + isPrime(i)`.
3. Query efficiently:
   ```java
   int countPrimesInRange(int L, int R) {
       return prefix[R] - prefix[L-1];
   }
   ```

✅ **[Sum of Primes in a Range] (Custom)**  
→ Find **sum of all prime numbers** in range `[L, R]`.  
📝 **Approach:**

- Compute **sieve + prefix sum of primes**.
- Answer in **O(1)** using `sumPrimes[R] - sumPrimes[L-1]`.

✅ [**2521. Distinct Prime Factors of Product of Array**](https://leetcode.com/problems/distinct-prime-factors-of-product-of-array/)  
→ Uses **Smallest Prime Factor (SPF) sieve + prefix sum**.

✅ [**LC 1175 - Prime Arrangements**](https://leetcode.com/problems/prime-arrangements/)  
→ Uses **sieve + factorial mod**.

✅ **[Segmented Sieve with Prefix Sum (Advanced)]**  
→ Finding primes in **large ranges efficiently**.

---

## **🔹 Advanced Prefix Sum Problems**

✅ [**1524. Number of Sub-arrays With Odd Sum**](https://leetcode.com/problems/number-of-sub-arrays-with-odd-sum/)  
→ **Prefix sum + parity count**.

✅ [**930. Binary Subarrays With Sum**](https://leetcode.com/problems/binary-subarrays-with-sum/)  
→ **Prefix sum + hashmap**.

✅ [**325. Maximum Size Subarray Sum Equals k**](https://leetcode.com/problems/maximum-size-subarray-sum-equals-k/)  
→ **Prefix sum + hashmap**.

---

## **🚀 What's Next?**

1️⃣ Practice **basic prefix sum problems** first.  
2️⃣ Move to **prefix sum with range queries (1D & 2D)**.  
3️⃣ Combine **prefix sum with sieve** for number theory problems.  
4️⃣ Try **advanced problems using hashmap + prefix sum**.

Would you like a structured **practice schedule** to solve these step by step? 🚀
