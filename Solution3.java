//Time Complexity: O(n)
//Space Complexity: O(1)
//Container with most water
class Solution3 {
    public int maxArea(int[] height) {
        int n =height.length;
        int max =0;
        int low= 0;
        int high = n-1;
        while(low < high){
            int currArr = Math.min(height[low], height[high]) * (high - low);
            max = Math.max(max, currArr);
            if(height[low] <= height[high]){
                low++;
            } else {
                high--;
            }
        }
        return max;
    }
}
