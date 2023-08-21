// Time Complexity : O(n)
// Space Complexity : 0(1)
// Did this code successfully run on Leetcode :yes
// Here we are taking two pointers i and j if we found either of them is less will move that pointer  and keeep calculating area. 
class ContainsWater{
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length-1;
        int max = 0;
        while(i<j){
            max = Math.max(max, Math.min(height[i],height[j]) * (j-i));
            if(height[i]<=height[j]){
                i++;
            }else{
                j--;
            }
        }
        return max;
    }
}