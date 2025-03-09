package BinarySearch;
// we consider is a single dimentional array and like normal binary serch we calculate the mid with start+end)/ and after calculating
//mid we calculate for rows and cols we do like int row=mid/rows; and int col=mid%col once we calcualte the row and col we compare
// it with the target and if it's less do end=mid-1 and otherwise start=mid+1
//REMEMBER
//int row=mid/COLS;
//int col=mid%COLS inside while loop we calcualte everytime to get current 
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows=matrix.length;
        int cols=matrix[0].length;
        int start=0;
        int mid=0;
        int end=rows*cols-1;
        System.out.println("cols is "+cols);
        
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) 
            return false;
        while(start<=end)
        {
            mid=(start+end)>>1;
           int row = mid / cols; // Correct calculation
           int col = mid % cols; 
            if(matrix[row][col]==target)
            {
                return true;
            }
            else if(matrix[row][col]<target)
            {
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return false;
    }
}
    
}
