//This is the class dutch national flag problem i was trying to make cases based on case like 0,1,2 in if condtion which is not
//needed here the key idea is in mid if we encounter 0 it should be left so we swap with low and increment mid and low if the
// mid is 2 then it means itshould be at last so we swap with the last and decrement high--; but not decrement mid because we don't
//know if the current number swapped from high is also could be 2 in case of swapping with 0  we didn't care about it becasue 
// we are moving left to right and low will always contain 0 or 1 because we are swapping as soon as we find 0
//As we are coming from the left so we are confident that low will always contain 0 or 1 not 2 but in case of high we have'nt
// explore on the right so we are not sure what could be there hence we are only doing high-- and not mid--. 

class Solution {
    public void sortColors(int[] nums) {
        int low = 0;
        int last = nums.length - 1;
        int mid = 0;
        while (mid <= last) {
            if (nums[mid] == 0) {
                int temp = nums[mid];
                nums[mid] = nums[low];
                nums[low] = temp;
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                int temp = nums[mid];
                nums[mid] = nums[last];
                nums[last] = temp;
                last--;
            }
        }
    }
}