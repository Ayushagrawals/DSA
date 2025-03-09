/*
 * 
 * Great question! The **binary search on answer** approach is used in many
 * **"find the minimum or maximum"** type problems. Here are some classic
 * **Leetcode questions** that use this trick:
 * 
 * ---
 * 
 * ## **🔹 Problems Based on This Approach**
 * ### **1️⃣ Capacity to Ship Packages Within `D` Days**
 * 🔹 **(Leetcode 1011)** [🔗
 * Link](https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/)
 * - Find the **minimum capacity** required to ship all packages within `D`
 * days.
 * - **Binary search on capacity** (`max(weights)` to `sum(weights)`).
 * 
 * ---
 * 
 * ### **2️⃣ Split Array Largest Sum**
 * 🔹 **(Leetcode 410)** [🔗
 * Link](https://leetcode.com/problems/split-array-largest-sum/)
 * - Given an array, split it into `m` subarrays **to minimize the maximum
 * subarray sum**.
 * - **Binary search on subarray sum** (`max(nums)` to `sum(nums)`).
 * - **Similar to ship packages problem**, but now we divide the array instead
 * of limiting days.
 * 
 * ---
 * 
 * ### **3️⃣ Koko Eating Bananas**
 * 🔹 **(Leetcode 875)** [🔗
 * Link](https://leetcode.com/problems/koko-eating-bananas/)
 * - Koko can eat at most `k` bananas per hour. Find the **minimum `k`** so that
 * she finishes all bananas in `h` hours.
 * - **Binary search on `k`** (`1` to `max(piles)`).
 * 
 * ---
 * 
 * ### **4️⃣ Min Speed to Arrive on Time**
 * 🔹 **(Leetcode 1870)** [🔗
 * Link](https://leetcode.com/problems/minimum-speed-to-arrive-on-time/)
 * - Given an array of travel distances, find the **minimum speed** required to
 * reach the destination on time.
 * - **Binary search on speed** (`1` to `max distance`).
 * 
 * ---
 * 
 * ### **5️⃣ Find the Smallest Divisor Given a Threshold**
 * 🔹 **(Leetcode 1283)** [🔗
 * Link](https://leetcode.com/problems/find-the-smallest-divisor-given-a-
 * threshold/)
 * - Given an array and a threshold, find the **minimum divisor** such that the
 * sum of the divided values is ≤ threshold.
 * - **Binary search on divisor** (`1` to `max(nums)`).
 * 
 * ---
 * 
 * ### **6️⃣ Minimize the Maximum Distance to Gas Station**
 * 🔹 **(Leetcode 774)** [🔗
 * Link](https://leetcode.com/problems/minimize-max-distance-to-gas-station/)
 * - Given gas stations, find the **minimum distance** we need between two
 * stations if we are allowed to add new stations.
 * - **Binary search on distance** (`0` to `max difference between stations`).
 * 
 * ---
 * 
 * ## **🔹 Summary:**
 * | **Problem** | **What to Find?** | **Binary Search On?** |
 * |------------|----------------|----------------------|
 * | 🚢 **Ship Packages (1011)** | **Min ship capacity** | `max(weights)` to
 * `sum(weights)` |
 * | 📦 **Split Array Largest Sum (410)** | **Min max-subarray sum** |
 * `max(nums)` to `sum(nums)` |
 * | 🍌 **Koko Eating Bananas (875)** | **Min eating speed** | `1` to
 * `max(piles)` |
 * | 🚗 **Min Speed to Arrive (1870)** | **Min speed** | `1` to `max distance` |
 * | ➗ **Smallest Divisor (1283)** | **Min divisor** | `1` to `max(nums)` |
 * | ⛽ **Gas Stations (774)** | **Min max distance** | `0` to `max difference` |
 * 
 * Would you like an explanation for any specific one? 🚀
 */