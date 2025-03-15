package BinarySearch;

//here we need to find the minium distance hence on valid we move towads the left and also we need to find the min distance between
//two station so sorting is good we subtract and can heck if it greaer then mid if it is then we cold so we knowhow much it is for
// for example if disance is 5 and mid is 2 so we divide to find it exta sation and we add it and finally compare it with the
//k if it is not greaer then true back to binary search if it's valid ten mvoe towards left otherwise rights

import java.util.*;

class Solution {
    public static double findSmallestMaxDist(int stations[], int k) {
        Arrays.sort(stations); // Ensure the stations are sorted
        
        double left = 0;  // Minimum possible distance
        double right = stations[stations.length - 1] - stations[0]; // Max possible distance
        double precision = 1e-6; // Precision for floating-point binary search
        
        while ((right - left) > precision) {
            double mid = (left + right) / 2.0;
            
            if (canPlace(stations, k, mid)) {
                right = mid; // Try to minimize the max allowed distance
            } else {
                left = mid; // Increase distance as we need more gas stations
            }
        }
        
        return left; // Left will hold the minimum possible max distance
    }

    private static boolean canPlace(int[] stations, int k, double maxAllowedDist) {
        int requiredStations = 0;
        
        for (int i = 1; i < stations.length; i++) {
            double gap = stations[i] - stations[i - 1];
            requiredStations += (int) (gap / maxAllowedDist); // Count required extra stations
        }
        
        return requiredStations <= k; // If we can place within the limit, return true
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // Number of test cases
        while (T-- > 0) {
            int n = sc.nextInt(); // Number of gas stations
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            int k = sc.nextInt(); // Number of new gas stations allowed
            
            double ans = findSmallestMaxDist(a, k);
            System.out.printf("%.6f\n", ans); // Print with 6 decimal precision
        }
        sc.close();
    }
}{

}
