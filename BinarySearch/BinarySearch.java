package BinarySearch;

public class BinarySearch {
    
    int[] a={1,2,3,9,13,15,21,25,78};

    int left=0;
    int right=a.length;
    int target=10;
    int mid=(left+right)/2;
    while(left<right)
    {
        if(a[mid]<target)
        {
            low=mid+1;
        }
        else{
            right=mid-1;
        }
    }
}
