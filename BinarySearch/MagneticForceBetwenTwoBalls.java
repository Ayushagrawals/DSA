
//This question was very tricky because to understand question was hard it took me 1 day with help of chatgpt too so first you 
// should know the pattern is still same askoko and ship here aslo we can go binary search we need to know that the we are 
//calculating the max difference hence teh minim we can select as 1 and maximum could be position[position.length-1] - position[0]
// and so it's in sorted order now we cold appl binary search here and call the boolean method which will check for the mid value
// we are passing if the distance between the two balls is greater then or equal to id if it is we wil update the counter
// and also we will update the lastplaced to the value which was valid.so in that way we could find total balls and disance is max.
import java.util.Arrays;

class MagneticForceBetweenTwoBalls {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int right = position[position.length - 1] - position[0];
        int mid = 0;
        int result = 0;
        int left = 1;

        while (left <= right) {
            mid = (left + right) >> 1;
            if (canplace(mid, position, m)) {
                left = mid + 1;
                result = mid;
            } else {
                right = mid - 1;
            }
        }
        return result;

    }

    public boolean canplace(int mid, int[] position, int m) {
        int lastplaced = position[0];
        int count = 1;
        for (int i = 1; i < position.length; i++) {
            if (position[i] - lastplaced >= mid) {
                count += 1;
                lastplaced = position[i];
                if (count == m)
                    return true;
            }
        }

        return false;

    }
}