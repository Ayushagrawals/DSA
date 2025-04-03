Category 1: Binary Search on "Rate / Size / Speed / Threshold" → Return COUNT
✅ Characteristics:
You’re given a limit on time or count

You can simulate the process greedily

You try different rates/sizes and count how many operations/units/days it takes

✅ Common Pattern:
Binary search on: rate / speed / size / threshold

Greedy check: simulate and return a count, then compare with target

✅ Examples:
Problem Search On Count What? Greedy?
LC 875 – Koko Eating Bananas 🍌 Eating speed/hour Hours needed ✅
LC 1011 – Ship Packages in D Days 📦 Ship capacity/day Days needed ✅
LC 410 – Split Array Largest Sum 📊 Max sum per subarray No. of subarrays ✅
LC 2064 – Distribute Products 🏪 Max per store No. of stores ✅
LC 1552 – Magnetic Force ↔️ Min distance between balls Check placement ✅
LC 774 – Gas Stations ⛽ Max distance Check if stations can be added ✅
🧪 Category 2: Binary Search on "Number of Groups/Sessions/Bins" → Boolean Answer
✅ Characteristics:
You're trying to minimize number of groups or sessions

Each group has a fixed capacity

You need to assign tasks optimally, can't do it greedily

Use backtracking, bin-packing, or DP

✅ Common Pattern:
Binary search on: number of groups

Check: Can I assign all items in these many groups?

✅ Examples:
Problem Search On Use What? Greedy?
LC 1986 – Minimum Work Sessions 👨‍💻 Min sessions Backtracking / Bitmask DP ❌
LC 1723 – Split Array to Minimize Max Workload 💼 Minimize max load across k workers Backtracking / DP ❌
Bin Packing Style 🧺 Min bins Backtracking ❌
✅ Summary Decision Flow
text
Copy
Edit
🧠 Can I simulate this process greedily? → Use Count-Based Binary Search
✅ Subtract/sum/check one-by-one
✅ Use a counter (days/hours/people/stores)

❌ No? I need to pack items optimally into groups/sessions? → Use Boolean Check
✅ Use backtracking/DP
✅ Try assigning tasks to bins/sessions
✍️ Bonus Tip for Interviews:
When starting such problems, just say:

“I’ll try Binary Search on Answer. First, I’ll check if this is a greedy simulation where I return a count (like Koko), or an optimal packing problem where I return a boolean (like Work Sessions).”

That statement immediately shows depth and maturity. Interviewer = 😍

Want me to generate this cheat sheet as a README.md file for your GitHub too?

LC 1986 - Minimum Number of Work Sessions to Finish the Tasks

Similar LeetCode Problems (Bin-Packing Inspired)
LC 1986 - Minimum Number of Work Sessions to Finish the Tasks

Tasks = items, SessionTime = bin size, Minimize sessions.

LC 410 - Split Array Largest Sum

Split an array into k subarrays where the sum of each subarray ≤ threshold.

Similar, but order must be preserved.

LC 1011 - Capacity to Ship Packages Within D Days

Find the minimum ship capacity to ship weights in D days.

Similar to bin-packing, but order matters.

LC 875 - Koko Eating Bananas

Minimize eating speed to eat all bananas in H hours.

Conceptually similar to bin-packing.

LC 2064 - Minimized Maximum of Products Distributed to Any Store

Distribute products to stores such that the max products at any store is minimized.

Bin-packing inspired.

Painter’s Partition Problem

Allocate boards to painters such that the max time taken by any painter is minimized.

A variation of bin-packing.

True Bin-Packing Problem Challenges
LeetCode doesn’t have exact bin-packing problems (like minimizing bins with fixed sizes), because those typically require NP-hard solutions, such as:

Backtracking

Dynamic Programming
