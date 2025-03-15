//here we need to find array of size k such that maximum sum of it is minimum.

//This problem is similr to container ship in d days here also we can do with binary search as to understand that to do it
// at least one of the subarray will be of size 1 and is of max of number so we will it treat as minimum and maximum subarray
//should the sum of all the element so we will apply binary search on number between two.
// we will pass the mid after binary search and the array elements.
// after we pas the mid now we in the method calculateminsubarray we loop over array and doing subtraction if it is greater then
// 0 then we simply subtract otherwise if it is less then 0 it means current element will not fit in the min large subarray hence
// if we increase count and reset the mid to same largest element and subtract current element.(We choose the max element becuase
//if a number greater then it can not be subtracted if it was there then current answer would come logically)
class Solution {
    public int splitArray(int[] nums, int k) {
        // find maxelement subarray at least one subarray will be of this size
        // find maximum subarray size that is sum of element
        int maxelement = 0;
        int sumofelement = 0;
        for (int i = 0; i < nums.length; i++) {
            maxelement = Math.max(nums[i], maxelement);
            sumofelement += nums[i];
        }
        int mid = 0;
        int left = maxelement;
        int right = sumofelement;
        while (left < right) {
            mid = (left + right) >> 1;
            if (calculateMinSubarray(mid, k, nums)) {
                right = mid;
            } else {
                left = mid + 1;
            }

        }
        return left;
    }

    public boolean calculateMinSubarray(int largestSum, int k, int[] nums) {
        int counter = 1;
        int temp = largestSum;
        for (int i = 0; i < nums.length; i++) {
            if (largestSum - nums[i] >= 0) {
                largestSum = largestSum - nums[i];
            } else {
                counter += 1;
                largestSum = temp;
                largestSum -= nums[i];
            }
        }
        if (counter > k) {
            return false;
        } else {
            return true;
        }
    }
}