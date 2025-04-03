class NextGreaterElement     {

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st = new Stack<Integer>();
        Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
        int leng = nums2.length - 1;
        st.push(nums2[leng]);
        hm.put(nums2[nums2.length - 1], -1);
        int i = leng - 1;
        while (i >= 0) {
            // System.out.println("curr is "+nums2[i]+" position is "+i);
            if (st.size() == 0) {
                hm.put(nums2[i], -1);
                st.push(nums2[i]);
                i--;
                // break;
            } else if (nums2[i] < st.peek()) {
                int t = st.peek();
                hm.put(nums2[i], t);
                st.push(nums2[i]);
                i--;
            } else {
                st.pop();
                // i--;
            }

        }
        for (int j = 0; j < nums1.length; j++) {
            if (hm.containsKey(nums1[j])) {
                nums1[j] = hm.get(nums1[j]);
            }
        }
        return nums1;
    }
}