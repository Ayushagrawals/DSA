//2523. Closest Prime Numbers in Range

// ✅ Step 1: Use the Sieve of Eratosthenes to count prime numbers
// - We initialize all numbers as 0 (meaning "prime").
// - We start from `2` and mark all its multiples as `1` (not prime).

// ✅ Step 2: Optimization - Why i*i < n?
// - If a number `x` is composite, it must have a factor <= sqrt(n).
// - This means that after `i * i < n`, the non-prime numbers will already be marked.
// - Example: 16
//   - 2 * 8 = 16 (already marked)
//   - 8 * 2 = 16 (redundant, already covered)

// ✅ Step 3: Inner Loop - Why j = i * i?
// - We start marking multiples from `i * i` because smaller multiples are already marked.
// - Example:
//   - `i = 2` → Start marking from `2 * 2 = 4`, then `6, 8, 10...`
//   - `i = 3` → Start marking from `3 * 3 = 9`, then `12, 15...`

// ✅ Step 4: Count Prime Numbers
// - Loop through the array and count numbers that are still `0` (prime).
// - Return the count.

class Solution {
    public int countPrimes(int n) {
        if (n > 1) {
            int a[] = new int[n];
            a[0] = 1;
            a[1] = 1;
            for (int i = 2; i * i < n; i++) {
                for (int j = i * i; j < n; j += i) {
                    a[j] = 1;
                }
            }
            int count = 0;
            for (int i : a) {
                if (i == 0) {
                    count += 1;
                }
            }
            return count;
        } else
            return 0;
    }
}