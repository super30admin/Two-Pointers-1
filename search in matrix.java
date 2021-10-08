// Time Complexity :o(n)
// Space Complexity :0(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :initially got errors at some cases but rectified them.


// Your code here along with comments explaining your approach:- checking last elementof every column as it is sorted in rows and columns if target is less than that decreementing column index if more then incrementing row.

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
        int n=matrix[0].length;
        int l=0;
        int h=n-1;
        while((h>=0)&&(l<=m-1)){
            if(matrix[l][h]==target){
                return true;
            }
            else if(matrix[l][h]<target){
                l=l+1;
            }
            else{
                h=h-1;
            }
        }
    return false;}
}