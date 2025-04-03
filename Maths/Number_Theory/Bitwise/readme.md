Here’s a structured list of **Bit Manipulation** problems, categorized by patterns from basic to advanced:

### **🔹 Basic Bit Manipulation Problems**

1. **Check if a Number is Odd or Even** → `num & 1`
2. **Find the ith Bit of a Number** → `(num >> i) & 1`
3. **Set the ith Bit of a Number** → `num | (1 << i)`
4. **Clear the ith Bit of a Number** → `num & ~(1 << i)`
5. **Toggle the ith Bit of a Number** → `num ^ (1 << i)`
6. **Count Set Bits in an Integer** → (`Brian Kernighan’s Algorithm`)
7. **Find XOR of Numbers from 1 to N**
8. **Convert Lowercase to Uppercase (or vice versa) using Bits**

### **🔹 Number Properties Using Bits**

9. **Check if a Number is a Power of Two**
10. **Find the Only Non-Repeating Element in an Array (Single Number - LeetCode 136)**
11. **Find Two Non-Repeating Elements in an Array (Single Number III - LeetCode 260)**
12. **Find Missing Number in an Array (Missing Number - LeetCode 268)**
13. **Find the Rightmost Set Bit in a Number** → `num & -num`
14. **Find the Unique Element in an Array where Every Element Appears Three Times (LeetCode 137)**

### **🔹 Bitwise Tricks & Optimization**

15. **Swap Two Numbers Without Using Extra Space** → `a = a ^ b; b = a ^ b; a = a ^ b;`
16. **Reverse Bits of a Number (LeetCode 190)**
17. **Check if a Number has Alternating Bits (LeetCode 693)**
18. **Find the Maximum XOR Pair in an Array (LeetCode 421)**
19. **Find the Maximum AND Pair in an Array**

### **🔹 Advanced Bit Manipulation (Tries & DP-based)**

20. **Find XOR of All Subsets in an Array**
21. **Find the Smallest Power of Two Greater than or Equal to N**
22. **Find the Maximum Subarray XOR (LeetCode 421, Trie-based Approach)**
23. **Find the XOR of a Subarray in Constant Time (Prefix XOR + Bitwise Tricks)**
24. **Count Numbers with a Given Number of Set Bits (Combinatorics + Bits)**
25. **Find the Kth Smallest XOR Pair in an Array (Binary Search + XOR)**

Would you like a **LeetCode problem list** for each of these?
