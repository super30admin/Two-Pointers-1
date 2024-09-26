// Time Complexity : n^2
//Space Complexity : O(1) 
//Did this code successfully run on Leetcode : Yes

class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int area = Integer.MIN_VALUE;
        for(int i = 0; i < n -1 ; i ++ ){
            for (int j = n - 1; j > i; j--){
                int width = j - i;
                int h = Math.min(height[i], height[j]);
                int temp = width * h;
                if(temp > area){
                    area = temp;
                }
            }
        }
        return area;
    }
}
// Time Complexity : O(n)
//Space Complexity : O(1) 
//Did this code successfully run on Leetcode : Yes
//-------------Using Two pointer High and low, if low is equal to minimun increment low else increment high, As shown in class-------------------
class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int area = Integer.MIN_VALUE;
        int min = Integer.MIN_VALUE;
        int low = 0;
        int high = n -1;
        while(low < high){
            int minH = Math.min(height[low], height[high]);
            int temp = (high - low) * minH;
            if(minH == height[low]){
                low++;
            }
            else{
                high--;
            }
            
            if(area < temp){
                area = temp;
            }
            
        }
        return area;
    }
}