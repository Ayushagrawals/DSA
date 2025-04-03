### **🧠 When to Use XOR, AND, OR, and Other Bitwise Operations?**

Understanding when to use XOR, AND, OR, and other bitwise operations is crucial. Here's a breakdown of when each is typically used:

---

## **🔹 XOR ( ^ ) – When to Use?**

✅ **Finding a unique element** (when every other element appears twice).  
✅ **Swapping two numbers without extra space** → `a = a ^ b; b = a ^ b; a = a ^ b;`  
✅ **Finding the missing number in a sequence** (cancelling out duplicates).  
✅ **Checking if two numbers have opposite signs** → `(a ^ b) < 0` (if signs are different, the result is negative).  
✅ **Finding two non-repeating numbers in an array where every other number appears twice** (XOR all elements to get `A ^ B`).  
✅ **Efficient hashing or encryption tricks** (XOR-ing values gives reversible operations).

🔍 **Example Problems:**

1. [LeetCode 136 - Single Number]
2. [LeetCode 260 - Single Number III]
3. [LeetCode 421 - Maximum XOR of Two Numbers]
4. [LeetCode 268 - Missing Number]

---

## **🔹 AND ( & ) – When to Use?**

✅ **Checking if a number is even or odd** → `num & 1` (0 means even, 1 means odd).  
✅ **Checking if a number is a power of 2** → `num & (num - 1) == 0` (only one set bit in power of 2).  
✅ **Extracting the rightmost set bit** → `num & -num` (isolates the lowest set bit).  
✅ **Bitmask operations for permissions and toggling specific flags**.

🔍 **Example Problems:**

1. [LeetCode 191 - Number of 1 Bits]
2. [LeetCode 231 - Power of Two]
3. [LeetCode 137 - Single Number II (Bitmasking)]

---

## **🔹 OR ( | ) – When to Use?**

✅ **Setting a bit at a specific position** → `num | (1 << pos)`.  
✅ **Merging two bitmasks (e.g., combining permissions or features).**  
✅ **Generating all subsets using a bitmask representation.**

🔍 **Example Problems:**

1. **Setting bits dynamically in bitmasking problems.**
2. **Generating subsets using bitwise operations (LeetCode 78 - Subsets).**

---

## **🔹 LEFT SHIFT ( << ) – When to Use?**

✅ **Multiplying a number by 2 efficiently** → `num << 1` (same as `num * 2`).  
✅ **Shifting bits in a bitmask to adjust values.**  
✅ **Generating powers of two quickly.**

🔍 **Example Problems:**

1. **Check if a given number is a power of 2 using shifts.**
2. **LeetCode 342 - Power of Four**

---

## **🔹 RIGHT SHIFT ( >> ) – When to Use?**

✅ **Dividing a number by 2 efficiently** → `num >> 1` (same as `num / 2`).  
✅ **Extracting specific bits from a number.**

🔍 **Example Problems:**

1. **Extracting bits from a binary representation.**
2. **LeetCode 191 - Number of 1 Bits**

---

## **📝 Quick Decision Table**

| **Problem Type**                  | **Use This Operation**                | **Example**              |
| --------------------------------- | ------------------------------------- | ------------------------ | ------------------- |
| Find unique number in array       | XOR (`^`)                             | LeetCode 136             |
| Find missing number in a range    | XOR (`^`)                             | LeetCode 268             |
| Check if a number is a power of 2 | AND (`&`)                             | LeetCode 231             |
| Count set bits                    | AND (`&`), Right Shift (`>>`)         | LeetCode 191             |
| Set/Clear/Toggle a bit            | OR (`                                 | `), AND (`&`), XOR (`^`) | Bitmasking problems |
| Multiply/Divide by 2              | Left Shift (`<<`), Right Shift (`>>`) | Optimization tricks      |
| Find maximum/minimum XOR pair     | XOR (`^`)                             | LeetCode 421             |
| Generate subsets                  | OR (`                                 | `), Bitmasking           | LeetCode 78         |

---

### **🔹 Summary**

- **Use XOR (`^`)** for finding unique numbers, missing numbers, or swapping values.
- **Use AND (`&`)** for checking power of 2, counting bits, and extracting specific bits.
- **Use OR (`|`)** for setting specific bits or merging bitmasks.
- **Use Left Shift (`<<`) and Right Shift (`>>`)** for multiplication, division, and efficient calculations.

Would you like a **detailed explanation** on any specific bitwise technique? 🚀
