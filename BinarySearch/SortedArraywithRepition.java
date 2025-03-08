    package BinarySearch;

    public class SortedArraywithRepition {
        public static void main(String[] args)
        {
        int[] a={1,1,2,2,3,4,5,5,6,6,7,7,8,10,21,21,21,21,21};
        int left=0;
        int right=a.length;
        int mid=(left+right)/2;
        int target=21;
    
        while(left<right)
        {
            if(a[mid]==target)
            {
                int checkerleft=mid;
                while(a[checkerleft]==target)
                {
                    checkerleft++;
                }
                System.out.println(checkerleft);
                int checkerright=0;
                while(a[checkerright]==target)
                {
                    checkerright++;
                }
                System.out.println(checkerleft);

            }
            if(a[mid]<target)
            {
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
    }
    }
