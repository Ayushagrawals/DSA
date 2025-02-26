// fast pointer approach is used as soon as fast pointer and first pointer is different we increment the first so we will not
// change the existing element as for example if the arrya is 1,4 so will not make it 4,4 by first=fast hence we do first++
// and then first=fast so we will remove the next same number if the fast=first we will increase only the fast one.
// we will swap if we want to 

import java.util.*;

class Solution {
    public int removeDuplicates(int[] nums) {

        int first = 0;
        int fast = 1;
        while (fast < nums.length) {
            if (nums[first] != nums[fast]) {
                first++;
                System.out.println(
                        "first before swapping " + first + " " + nums[first] + " fast is " + fast + " " + nums[fast]);
                nums[first] = nums[fast];
            }
            fast++;

        }
        return first + 1;
    }
}
