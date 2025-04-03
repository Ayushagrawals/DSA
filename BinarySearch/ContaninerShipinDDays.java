//This is variation of binary search first we need to solve with the brute force then we can think that it could be solved with 
//the help of the binary search because we need to know where do we need to apply the binary search,
// here what we are doing is first we know that we need to ship in at most days(minimum). 
//and each day it should be packed at maximum weight of capacity, now we need to do in min time hence we know that at least the 
//minimum capacity should be the maxweight. if it's single packed and maximum capacity will be the sum of weight. Once we know
// that we will apply the loop from maxweight to sum of weight and calculate if it can be packed in d days with that much weight
// n canship method so a loop will run if we breach that capacity we reset capacity to it's initital and increase day after doing
//this loop we find that if calculate days are less or equal to given days then we did it.
//BUT this brute force that is 0(n2) is not good becauseof loop we can apply binary search why because we are checking incremently
//form the maxcapacity to sumof capcity so what we will do we calculate mid and check for it if that cpacity is matching then 
//we know that this working we need to find the min answer so will move to left that ny right=mid; if it's not then it means
//we need higher capacity and we will make left=mid+1; and then finally return the left that is the min.

//when it is written like that we want to mimimize the max it means we are minimizing after finding the answer we are moving towrds the left and in the 
//loop we are moing towards the right vice versa in case of maximizing the the min

class Solution {
    public int shipWithinDays(int[] weights, int days) {

        int maxweight = 0;
        int sumofweight = 0;
        for (int i = 0; i < weights.length; i++) {
            maxweight = Math.max(weights[i], maxweight);
            sumofweight += weights[i];
        }
        int left = maxweight;
        int right = sumofweight;
        int mid = 0;

        while (left < right) {
            mid = (left + right) >> 1;
            if (canShip(weights, mid, days)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;

    }

    public boolean canShip(int[] weights, int capacity, int days) {
        int tempCapacity = capacity;
        int daysused = 1;
        for (int i = 0; i < weights.length; i++) {
            if (tempCapacity - weights[i] >= 0)
                tempCapacity -= weights[i];
            else {
                daysused += 1;
                tempCapacity = capacity;
                tempCapacity -= weights[i];
            }
        }
        if (daysused > days) {
            return false;
        } else {
            return true;
        }
    }
}