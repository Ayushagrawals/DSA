public class TrappingRainWater {
    class Solution {

        // "Trapping Rain Water II" (Leetcode 407)
        /*
         * ✅
         * This requires
         * a different approach,
         * using a Min-Heap (Priority Queue) and BFS/DFS traversal instead of the
         * two-pointer method.
         */

        // here we are using two pointer tracking left pointer and right pointer and
        // checking maximum height if the height of left is
        // less we are using left++ and if height of right is les we are doing is
        // right-- similar to leetcode 11 and tracking of maxleft
        // and maxright simontaneously and subtracking with current pillar will give us
        // the water filled at that particular pillar.
        // Its an important problem should be remembered

        // Stack<Integer> st=new Stack<Integer>();
        // Here

        public int trap(int[] height) {
            /*
             * int count=0;
             * Stack<Integer> track=new Stack<Integer>();
             * int tillmin=Integer.MIN_VALUE;
             * int ans=0;
             * track.push(height[0]);
             * //int tillMin=Integer.MAX_VALUE;
             * st.push(height[0]);
             * for(int i=1;i<height.length;i++)
             * {
             * if(i==height.length-1)
             * {
             * System.out.println("hello");
             * }
             * 
             * else if(track.peek()<=height[i])
             * {
             * System.out.println("hi");
             * int k=st.pop();
             * st.push(height[i]);
             * //ans+=maxx;
             * int mini=Math.min(k,height[i]);
             * while(track.size()!=0)
             * {
             * ans+=mini-track.pop();
             * }
             * track.push(height[i]);
             * //ans+=tillmin*count;
             * count=0;
             * tillmin=Integer.MIN_VALUE;
             * //maxx=0;
             * }
             * else{
             * int t=st.peek();
             * count+=1;
             * //st.push[height[i]]
             * track.push(height[i]);
             * //tillmin=Math.max(t-height[i],tillmin);
             * //maxx+=t-height[i];
             * }
             * System.out.println("ans is "+ans +" height is "+height[i]);
             * System.out.println();
             * }
             * 
             * return ans;
             * }
             */
            int maxleft = 0;
            int maxright = 0;
            int right = height.length - 1;
            int left = 0;
            int water = 0;
            while (left < right) {
                if (height[left] < height[right]) {
                    maxleft = Math.max(maxleft, height[left]);
                    water += maxleft - height[left];
                    left++;
                } else {
                    maxright = Math.max(maxright, height[right]);
                    water += maxright - height[right];
                    right--;
                }
            }
            return water;
        }
    }
}
