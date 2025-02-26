
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