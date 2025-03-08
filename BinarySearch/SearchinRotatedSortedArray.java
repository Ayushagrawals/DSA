//To search in rotated sorted array er vheck if the left half or the right half is sorted or not to comparing start with mid 
//and with mid with end if the sart is less then mid swe know left half is sorteed and if target is greater then start and smaller then mid
// then we know the answer is in the left half other wise the answer is in the right half
// and we also check if the mid is less then end if its is we know that right half is sorted and we check if target is greater
//then mid and smaller then end if it isthen we know answer will be in the right half other wise will move left half
// with end=mid-1;
class Solution {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int mid = 0;
        while (start <= end) {
            mid = (start + end) >> 1;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[start] <= nums[mid]) {
                if (target <= nums[mid] && target >= nums[start]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (nums[end] >= target && nums[mid] <= target) {
                    start = mid + 1;
                }

                else {
                    end = mid - 1;
                }
            }

        }

        return -1;
    }
}