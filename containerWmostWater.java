//T.C: O(n)  no. of element in the height[]. 
//S.c: O(1) No extra data structure is used.

/*Approach: By using two-pointer technique. i will calculate capacity at each iteration.
and update my max accordingly. my pointer updation will depend on the height at each pointer.
pointer at min. height  will be updated.
*/

class Solution {
    public int maxArea(int[] height) {
        int max = Integer.MIN_VALUE;
        int i =0, j = height.length - 1;

        while(i < j){
            int capacity = Math.min(height[i],height[j])*(j-i);
            max = Math.max(max, capacity);
            
            if(height[i] < height[j]) i++;
            else j--;
        }
     return max;
    }
}