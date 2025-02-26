//This is similar to remove dplicate from sorted array but here we are using count to check if it increased once then we will do
//the same

class Solution {
    public int removeDuplicates(int[] nums) {
        int first = 0;
        int last = 1;
        int count = 0;
        while (last < nums.length) {
            // System.out.println("nums first "+nums[first] +" index is "+first+ " nums last
            // "+nums[last]+" last index is "+last);
            if (nums[first] == nums[last] && count < 1) {
                count += 1;
                first += 1;
            } else if (nums[first] == nums[last] && count >= 1) {
                count += 1;
            }

            else if (nums[first] != nums[last]) {

                first += 1;
                System.out.println(("swapping " + nums[last] + " with " + nums[first]));
                nums[first] = nums[last];
                count = 0;

            }
            last += 1;
            System.out.println(Arrays.toString(nums));

        }

        return first + 1;
    }
}