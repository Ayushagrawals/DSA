Certainly! This "mark then modify" pattern is applicable to a variety of problems involving 2D arrays. Here are some problems where you can use this pattern, along with how it fits:

---

### ✅ **Problems for "Mark Then Modify" Pattern**

1. **Set Matrix Zeroes**
   - **Problem:** Given a matrix, if an element is 0, set its entire row and column to 0.
   - **Approach:** As we discussed, mark rows and columns that need to be zeroed and apply changes in the second pass.

2. **Game of Life**
   - **Problem:** Given an initial state of the game, apply the rules of life to each cell (alive or dead) based on neighbors.
   - **Approach:** First pass marks the cells that will change, and in the second pass, apply the changes without modifying the current state.

3. **Flood Fill**
   - **Problem:** Given a 2D image and a starting pixel, fill all connected pixels of the same color with a new color.
   - **Approach:** Mark all pixels to be changed (using a temp value or visited array), and apply the flood fill in a second step.

4. **Rotting Oranges (LeetCode)**
   - **Problem:** Given a grid of oranges, rotten oranges spread to adjacent fresh ones. After each minute, fresh oranges turn rotten.
   - **Approach:** Mark all rotten orange positions first, then spread the rot.

5. **Island Count (DFS/BFS)** 
   - **Problem:** Given a grid of `1`s and `0`s, count the number of islands (connected components of `1`s).
   - **Approach:** First mark visited land cells, then modify during DFS/BFS to traverse and count.

6. **Surrounded Regions (LeetCode)**
   - **Problem:** Given a 2D board of `'X'` and `'O'`, capture all regions surrounded by `'X'` by changing all `'O'`s to `'X'`.
   - **Approach:** First pass marks the `'O'`s that should not be captured (those connected to the borders), then in the second pass, modify the board.

7. **Rotate Image (90 degrees clockwise)**
   - **Problem:** Rotate a 2D matrix 90 degrees in-place.
   - **Approach:** First, mark the cells in the first row and column for the rotated positions, then perform the rotation.

8. **Matrix Block Sum (LeetCode)**
   - **Problem:** Given a 2D matrix, calculate the sum of elements within a block (a square or rectangle) around each element.
   - **Approach:** Mark the contributions for each element first (using a prefix sum technique), then calculate the sum for each block in a second pass.

9. **Maximum Size Submatrix with All 1's**
   - **Problem:** Find the maximum size square submatrix that contains only `1`s in a binary matrix.
   - **Approach:** You can mark intermediate results (like the size of possible squares) and modify the matrix based on those results.

---

### 🚀 **Add these problems to your list!**
- **Set Matrix Zeroes** (you already have this)
- **Game of Life**
- **Flood Fill**
- **Rotting Oranges**
- **Island Count**
- **Surrounded Regions**
- **Rotate Image**
- **Matrix Block Sum**
- **Maximum Size Submatrix with All 1's**

These are great examples of problems that utilize the "mark first, modify later" pattern. 

You can group these under a **2D Array** pattern in your list to easily recognize when you need to apply this approach. Would you like to add these to your sheet and track them, or would you like me to give you further details on any specific problem?
