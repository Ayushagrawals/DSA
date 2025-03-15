
//ITs a two pointer problem we want to find maximum water trapped we need to calcualte index difference mtuliplied by the min 
// of right and left index vaules and if the left index value is less we move right that is left++ and similarly right--
//
import java.util.Stack;

class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int left = 0, right = n - 1;
        int maxWater = 0;
        int currwater = 0;
        while (left < right) {
            currwater = (right - left) * Math.min(height[right], height[left]);
            System.out.println(currwater);
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
            maxWater = Math.max(maxWater, currwater);
        }

        System.out.println("maxwater " + maxWater);
        return maxWater;
    }
}
