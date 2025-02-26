//Here we needed that extra variable for calculating the min becaue in  multiplication is possible that current which is negative
// can be become larger number after multiplying with the next number for example [2,-3,-4] here -6* -4=24 in second step. the max
// would be -3 and become -4 in the end but with min answer acheived in case of kadane algo we were no t considering negative 
// into calcualtion because if the sum is less than 0 then we would not considering it so hence here we mainintained the 
//extra negative pointer and storing min result after that we are multiplying it with current number and comparing with the 
// max current multiplied by current number and storing it again and min and max. so will have everytime max and min value correctly

class Solution {
    public int maxProduct(int[] nums) {
        int max_product = nums[0];
        int curr_product = nums[0];
        int curr_negative = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int t = curr_negative * nums[i];
            curr_negative = Math.min(curr_negative * nums[i], curr_product * nums[i]);
            // curr_negatve*=nums[i];
            curr_product = Math.max(curr_product * nums[i], t);
            curr_negative = Math.min(curr_negative, nums[i]);
            curr_product = Math.max(curr_product, nums[i]);
            // curr_product=Math.max(curr_negative,curr_product);
            int temp = Math.max(curr_negative, curr_product);
            System.out.println("min is " + curr_negative + " max is " + curr_product + " temp is " + temp);
            max_product = Math.max(temp, max_product);
        }
        return max_product;

    }
}