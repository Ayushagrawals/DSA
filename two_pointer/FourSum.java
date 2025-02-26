//It's similar to the three sum problem only things to be take care is takes O(n2) and two loops we are computing 4 no of sum
// two will come in the first and last third will come in the first loop and fourth will come in the last loop.
//Issue i faced is with the it should be first<last while we skip the duplicate and we should increment first++ last-- in case 
// we find the sum.

import java.util.*;

class FourSum {

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> l = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {

            int first = i + 1;
            int last = nums.length - 1;
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            while (first < last) {
                if (nums[first] + nums[last] + nums[i] == 0) {
                    ArrayList<Integer> l1 = new ArrayList<Integer>();
                    l1.add(nums[first]);
                    l1.add(nums[last]);
                    l1.add(nums[i]);
                    while (first < last && nums[first] == nums[first + 1]) {
                        first++;
                    }
                    while (first < last && nums[last] == nums[last - 1]) {
                        last--;
                    }
                    l.add(l1);
                    first++;
                } else if (nums[first] + nums[last] + nums[i] < 0) {
                    first++;
                } else {
                    last--;
                }
            }

        }
        return l;
    }
}