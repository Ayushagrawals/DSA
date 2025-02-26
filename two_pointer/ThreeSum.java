//It's a famous problem here we are using two pointer approach to find sum with first and last but we are using loop due to three
//element starting from 0 to lenght-1 and first will start with i+1 till n and the problem which i faced is with the duplicate
// to counter it in the variable which we get by i we are using arr[i] with arr[i-1] comparing if it matches otherwise
//And with the first and last variable if we find duplicate if we are doing while loop in case of first to last if we find crrent
//element again we will skip it by moving forward. And in case of last we are moving backward ifnums[last] we find again by doing
// last-- the we will again skip it.

import java.util.List;
import java.util.*;

class ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> l = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {

            int first = i + 1;
            int last = nums.length - 1;
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            while (first < last) {
                System.out.println("first " + nums[first] + " last " + " " + nums[last] + " nums[i] " + nums[i]);
                if (nums[first] + nums[last] + nums[i] == 0) {
                    ArrayList<Integer> l1 = new ArrayList<Integer>();
                    l1.add(nums[first]);
                    l1.add(nums[last]);
                    l1.add(nums[i]);
                    while (first < last && nums[first] == nums[first + 1]) {
                        first++;
                    }
                    while (last > first && nums[last] == nums[last - 1]) {
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