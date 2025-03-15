// Here this is also a variance of binary search in this we have to min value of k the minimum number of banana eating speed k such that
// it should less than h that is the total time limit. so minimum banana she can eat is 1 per hour min is 1 and max is the 
// max of array. so will apply binary search between these two as thease are in sorted order and then we will call to check
// minbanabaeat and for every mid we will clauclate if arr[i] is large then we could find by dviding by k so we will find hour
// and the remainng shw eill eat in 1 hour hence we are taking ceil for decimal if k is bigger then aray then she would eat in 
// 1 hour so increment counter by 1 once we get the anwer we know it can be in the left because we find the min hence we setting
//right=mid to move left

//chatgpt explaination 

/*  Your description is good, but it has some grammatical errors and readability issues. Here's a clearer and more structured version:

Koko Eating Bananas - Binary Search Approach
This problem is a variation of Binary Search where we need to find the minimum eating speed K such that Koko finishes all the bananas within H hours.

Key Observations:
The minimum speed K can be 1 (eating 1 banana per hour).
The maximum speed K can be the largest pile in the array (if she eats an entire pile in one hour).
Since the answer lies between 1 and max(piles[]), we apply Binary Search to efficiently find the minimum valid K.
Binary Search Steps:
Initialize left = 1 and right = max(piles[]).
Perform Binary Search on K:
For each mid = (left + right) / 2, check if Koko can eat all bananas within H hours using this speed.
To calculate time taken:
If piles[i] > K, she needs ceil(piles[i] / K) hours.
If piles[i] ≤ K, she finishes in 1 hour.
Use Math.ceil(piles[i] / K) to handle division properly.
If mid is a valid speed (she finishes in ≤ H hours), search in the left half (right = mid).
Otherwise, search in the right half (left = mid + 1).
Return left, which stores the minimum valid eating speed. */
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int maxspeed = Integer.MIN_VALUE;
        for (int i = 0; i < piles.length; i++) {
            maxspeed = Math.max(maxspeed, piles[i]);
        }
        int left = 1;
        int right = maxspeed;
        int mid = 0;
        while (left < right) {
            mid = (left + right) >> 1;
            if (minbananaeat(piles, mid, h)) {
                right = mid;
            } else {
                left = mid + 1;
            }

        }
        return left;
    }

    public boolean minbananaeat(int[] piles, int mid, int hour) {
        int counter = 0;
        for (int i = 0; i < piles.length; i++) {
            if (mid < piles[i]) {
                counter += Math.ceil((double) piles[i] / mid);
            } else {
                counter += 1;
            }
        }
        if (counter > hour) {
            return false;
        } else {
            return true;
        }
    }
}