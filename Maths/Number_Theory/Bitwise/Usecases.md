### **🚀 Advanced Bit Manipulation Concepts & When to Use Them**

Besides XOR, AND, OR, and shifts, there are **other essential bitwise techniques** used frequently in problem-solving. Let's break them down:

---

## **🔹 1’s Complement (~) - When to Use?**

✅ **Flipping all bits (inverting bits of a number).**  
✅ **Used in creating the 2’s complement of a number (for negative representation).**  
✅ **Checking if a number is negative in two's complement representation.**

🔍 **Example Problems:**

- **Flipping bits in a binary number.**
- **LeetCode 476 - Number Complement** (flip all bits and mask to get correct bit length).

**Example:**

```java
int num = 5;   // 00000101 in binary
int complement = ~num; // 11111010 in binary (-6 in decimal, because of two’s complement representation)
```

---

## **🔹 2’s Complement - When to Use?**

✅ **Used to represent negative numbers in binary.**  
✅ **Finding the negative equivalent of a number → `-num` is actually `(~num + 1)`.**  
✅ **Used in subtraction (`a - b` is `a + (~b + 1)`).**

🔍 **Example Problems:**

- **LeetCode 1009 - Complement of Base 10 Integer** (handling bitwise negation).
- **Finding the absolute value without using `Math.abs()`.**

**Example:**

```java
int num = 5;   // 00000101
int neg = ~num + 1;  // 11111011 (-5 in two's complement)
```

---

## **🔹 Extracting the Rightmost Set Bit (`num & -num`) - When to Use?**

✅ **Finding the lowest bit that is set (helpful in bitmask problems).**  
✅ **Checking the least significant set bit efficiently.**  
✅ **Iterating over all set bits in a number one by one.**

🔍 **Example Problems:**

1. **LeetCode 136 - Single Number (Finding the unique number).**
2. **LeetCode 190 - Reverse Bits (Manipulating individual bits).**
3. **Finding whether a number is a power of 2 efficiently.**

**Example:**

```java
int num = 12;  // 1100 in binary
int lowestSetBit = num & -num;  // 0100 (4 in decimal, isolates rightmost set bit)
```

---

## **🔹 Counting Set Bits (`Brian Kernighan’s Algorithm`) - When to Use?**

✅ **Faster than looping through all bits (`O(log n)` time complexity).**  
✅ **Used in problems requiring bit counting (e.g., Hamming weight).**

🔍 **Example Problems:**

1. **LeetCode 191 - Number of 1 Bits**
2. **LeetCode 338 - Counting Bits**

**Algorithm:**

```java
int countSetBits(int n) {
    int count = 0;
    while (n > 0) {
        n = n & (n - 1); // removes the rightmost set bit
        count++;
    }
    return count;
}
```

---

## **🔹 Checking if a Number is a Power of 2 (`num & (num - 1) == 0`)**

✅ **Used in problems related to power of 2 checks.**  
✅ **Faster than looping methods.**

🔍 **Example Problems:**

1. **LeetCode 231 - Power of Two**

**Example:**

```java
boolean isPowerOfTwo(int num) {
    return num > 0 && (num & (num - 1)) == 0;
}
```

- `8` → `1000` & `0111` → `0000` ✅ (Power of 2)
- `10` → `1010` & `1001` → `1000` ❌ (Not a power of 2)

---

## **🔹 Finding XOR of All Numbers from `1` to `n` Efficiently**

✅ **Used in problems involving XOR-based range queries.**  
✅ **Faster than looping through all numbers.**

🔍 **Example Problems:**

1. **LeetCode 1486 - XOR Operation in an Array**
2. **Finding missing numbers in an array efficiently.**

**Formula:**

```java
int xorFrom1ToN(int n) {
    if (n % 4 == 0) return n;
    if (n % 4 == 1) return 1;
    if (n % 4 == 2) return n + 1;
    return 0;
}
```

🔹 **Pattern of `1 ^ 2 ^ 3 ^ ... ^ n`:**

- `n % 4 == 0` → `n`
- `n % 4 == 1` → `1`
- `n % 4 == 2` → `n + 1`
- `n % 4 == 3` → `0`

---

## **🔹 Finding Two Unique Numbers in an Array Using XOR**

✅ **Used in problems where every number appears twice except two numbers.**  
✅ **Uses XOR properties to isolate two different numbers.**

🔍 **Example Problems:**

1. **LeetCode 260 - Single Number III**

**Approach:**

```java
int[] singleNumbers(int[] nums) {
    int xorAll = 0;
    for (int num : nums) xorAll ^= num;  // XOR of two unique numbers remains

    int diffBit = xorAll & -xorAll;  // Extract lowest set bit (bitwise trick)

    int x = 0, y = 0;
    for (int num : nums) {
        if ((num & diffBit) == 0) x ^= num;
        else y ^= num;
    }
    return new int[]{x, y};
}
```

---

## **🔹 Using Bitmasks for Subset Generation**

✅ **Generating all subsets efficiently (`2^n` subsets for `n` elements).**  
✅ **Used in combinatorial problems.**

🔍 **Example Problems:**

1. **LeetCode 78 - Subsets**

**Example:**

```java
List<List<Integer>> subsets(int[] nums) {
    List<List<Integer>> result = new ArrayList<>();
    int n = nums.length;
    for (int i = 0; i < (1 << n); i++) {  // Iterate over all 2^n subsets
        List<Integer> subset = new ArrayList<>();
        for (int j = 0; j < n; j++) {
            if ((i & (1 << j)) != 0) {  // Check if j-th bit is set
                subset.add(nums[j]);
            }
        }
        result.add(subset);
    }
    return result;
}
```

---

### **📝 Summary of Advanced Bit Tricks**

| **Trick**                                       | **Usage**                              | **Example Problem** |
| ----------------------------------------------- | -------------------------------------- | ------------------- |
| **1’s Complement (~num)**                       | Flipping bits, negative representation | LeetCode 476        |
| **2’s Complement (~num + 1)**                   | Negative numbers, subtraction trick    | -                   |
| **Extracting Rightmost Set Bit (`num & -num`)** | Finding lowest set bit                 | LeetCode 190        |
| **Counting Set Bits (`n & (n - 1)`)**           | Counting 1s in binary                  | LeetCode 191        |
| **Checking Power of 2 (`n & (n - 1) == 0`)**    | Checking if `n` is power of 2          | LeetCode 231        |
| **XOR from 1 to n (`1 ^ 2 ^ ... ^ n`)**         | Efficient range XOR                    | LeetCode 1486       |
| **Finding Two Unique Numbers**                  | XOR trick for pair finding             | LeetCode 260        |
| **Bitmasking for Subsets**                      | Generating subsets                     | LeetCode 78         |

---

Would you like **a roadmap** or **practice order** for these concepts? 🚀
